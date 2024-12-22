#!/bin/bash
set -e  # 에러 발생 시 스크립트 중단

echo "Restoring database from backup.dump..."

# pg_restore 명령으로 덤프 파일 복원
pg_restore -U "$POSTGRES_USER" -d "$POSTGRES_DB" /docker-entrypoint-initdb.d/backup.dump

echo "Database restored successfully!"
