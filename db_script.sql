CREATE DATABASE personality_test /*!40100 DEFAULT CHARACTER SET utf8mb4 COLLATE utf8mb4_0900_ai_ci */ /*!80016 DEFAULT ENCRYPTION='N' */;
create user 'testappuser' identified by 'P@ssw0rd2022';
grant all on personality_test.* to 'testappuser';

create table personality_test.TEST
(
	ID numeric primary key
);

create table personality_test.TEST_RESULTS
(
	id numeric primary key,
    questionid numeric not null,
    question varchar(1000),
    category varchar(100),
    answer varchar(2000),
    test_id numeric
);