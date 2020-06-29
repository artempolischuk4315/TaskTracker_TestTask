FROM mysql

COPY src/main/resources/db/task_tracker_dump.sql /docker-entrypoint-initdb.d/task_tracker.sql