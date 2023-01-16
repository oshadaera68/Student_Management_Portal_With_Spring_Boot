/*======== Creating a database=======*/
DROP DATABASE IF EXISTS smsportal;
CREATE DATABASE IF NOT EXISTS smsportal;
USE smsportal;

/*======== Creating tables=======*/
/*Student*/
DROP TABLE IF EXISTS Student;
CREATE TABLE IF NOT EXISTS Student
(
    sId   INT AUTO_INCREMENT NOT NULL,
    sName VARCHAR(255)       NOT NULL,
    email VARCHAR(255)       NOT NULL,
    gId   INT                NOT NULL,
    cId   INT                NOT NULL,
    CONSTRAINT PRIMARY KEY (sId),
    CONSTRAINT FOREIGN KEY (gId) references Grades (gId),
    CONSTRAINT FOREIGN KEY (cId) REFERENCES Classes (cId)
);
SHOW TABLES;
DESC Student;

# INSERT INTO Student VALUES (001, 'nimesh', 'nimesh@gmail.com', 001,001);


/*Classes*/
DROP TABLE IF EXISTS Classes;
CREATE TABLE IF NOT EXISTS Classes
(
    cId   INT AUTO_INCREMENT NOT NULL,
    cName VARCHAR(255)       NOT NULL,
    insId INT AUTO_INCREMENT NOT NULL,
    CONSTRAINT PRIMARY KEY (cId),
    CONSTRAINT FOREIGN KEY (insId) REFERENCES Instructors (insId)
);

SHOW TABLES;
DESC Classes;

INSERT INTO Classes VALUES (001,'test1', 001);

/*Grades*/
DROP TABLE IF EXISTS Grades;
CREATE TABLE IF NOT EXISTS Grades
(
    gId   INT AUTO_INCREMENT NOT NULL,
    grade VARCHAR(255)       NOT NULL,
    CONSTRAINT PRIMARY KEY (gId)
);
INSERT INTO Grades VALUES (001,'test1');

SHOW TABLES;
DESC Grades;

/*Instructors*/
DROP TABLE IF EXISTS Instructors;
CREATE TABLE IF NOT EXISTS Instructors
(
    insId   INT AUTO_INCREMENT NOT NULL,
    insName VARCHAR(255)       NOT NULL,
    CONSTRAINT PRIMARY KEY (insId)
);
INSERT INTO Instructors VALUES (0001,'test2');
SHOW TABLES;
DESC Instructors;