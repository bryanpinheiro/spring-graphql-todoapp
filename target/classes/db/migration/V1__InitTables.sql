CREATE TABLE TODOS (
   TODO_ID BIGINT PRIMARY KEY AUTO_INCREMENT,
   TITLE VARCHAR(64),
   COMPLETED BOOLEAN DEFAULT FALSE
);