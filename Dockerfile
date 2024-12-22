# 1단계: 빌드 이미지
FROM openjdk:17-jdk-slim AS build

# 작업 디렉터리 설정
WORKDIR /app

# Gradle Wrapper 파일과 Gradle 빌드에 필요한 파일 복사
COPY gradle /app/gradle
COPY gradlew /app
COPY build.gradle /app
COPY settings.gradle /app
COPY src /app/src

# 실행 권한 부여
RUN chmod +x gradlew

# Gradle 빌드 실행 (clean 포함)
RUN ./gradlew clean build -x test

# 2단계: 실행 이미지
FROM openjdk:17-jdk-slim

# 작업 디렉터리 설정
WORKDIR /app

# 빌드된 JAR 파일을 복사
COPY --from=build /app/build/libs/*.jar app.jar

# 애플리케이션 실행
CMD ["java", "-jar", "app.jar"]
