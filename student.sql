CREATE DATABASE IF NOT EXISTS studentformdb;
USE studentformdb;

CREATE TABLE IF NOT EXISTS students (
    student_id VARCHAR(20) NOT NULL,
    NAME VARCHAR(100) NOT NULL,
    age INT(11) NOT NULL,
    grade VARCHAR(100) NOT NULL,
    PRIMARY KEY (student_id)
);
