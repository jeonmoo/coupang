# 👕 의류 쇼핑몰
![image](https://github.com/jeonmoo/shoppingmall/assets/86511348/64133731-2767-4732-a65c-19eedc456763 "메인페이지 이미지")

<!--
테스트 계정
**id : test@test.com**  
**pw : test!@#$**
-->

## 프로젝트 소개
- 이 프로젝트는 일반적인 쇼핑몰을 구현한 개인 프로젝트입니다.
- 이 프로젝트는 상품 구매 ~ 결제(실결제x)단계까지를 기반으로 만들어져 있습니다.
- 일반회원가입을 포함해 카카오, 네이버, 구글 OAuth2 연동이 되어 있습니다.
- 로그인, OAuth2 로그인은 Spring Security를 사용하여 개발 되었습니다.
- Dockerfile, docker-compose, 백업db파일 등을 추가해 도커만으로 실행가능하게 수정했습니다
- 구현 기능으로는 아래와 같습니다.
    - 회원
        - 회원가입, 이메일 중복확인, 로그인
    - 주문
        - 주문등록 (결제전), 결제 (등록주문 결제), 주문조회 (옵션값 : 시작일, 마지막일)
    - 상품
        - 상품등록 (API만), 상품조회 (단건, 리스트)
    - 장바구니
        - 장바구니 등록
    - 리뷰
        - 리뷰작성

## 개발환경
- Front : Thymeleaf, bootstrap5.3, Jquery
- Backend : Java(17), JPA(+ QueryDsl), Facade 패턴, MapStruct, Gradle
- DB : Postgresql
- 버전 관리 : GitHub, GitFlow, 일반적인 커밋 컨벤션 준수
- other : docker

## ERD
![image](https://github.com/jeonmoo/shoppingmall/assets/86511348/07344468-f20a-4963-a107-d3bb850f96f4)

## 기타
- 개발 기간 : 23.11.14 ~ 24.01.05

## 페이지별 스크린샷
- 로그인 페이지
![image](https://github.com/jeonmoo/shoppingmall/assets/86511348/54e76faf-642d-482b-95ec-44b343e37380)

- 회원가입
![image](https://github.com/jeonmoo/shoppingmall/assets/86511348/af4f38a0-95d1-438b-b0ff-5b7eb4893997)

- 상품 페이지
![image](https://github.com/jeonmoo/shoppingmall/assets/86511348/0b7046fa-97d4-45bf-8860-df066f503cbf)

- 결제 페이지
![image](https://github.com/jeonmoo/shoppingmall/assets/86511348/cedffde4-f8b2-4c44-8ea3-29029a37c48a)

- 주문조회
![image](https://github.com/jeonmoo/shoppingmall/assets/86511348/b007483d-ec6b-4055-95a2-98afc0717840)

- 장바구니
![image](https://github.com/jeonmoo/shoppingmall/assets/86511348/442d6733-38f4-4cf5-b953-e3b615c2a2dd)
