DROP DATABASE IF EXISTS quan_ly_sinh_vien;
CREATE DATABASE quan_ly_sinh_vien;
USE quan_ly_sinh_vien;

CREATE TABLE class(
id INT PRIMARY KEY AUTO_INCREMENT,
`name` VARCHAR(20)
);

INSERT INTO class
VALUE (NULL,"TUAN"),(NULL,"TIEN");
SELECT * FROM class; 

CREATE TABLE teacher(
id int primary key auto_increment, 
`name` varchar(20),
age int ,
country varchar(20)
);

insert into teacher (`name`,age, country)
value ("Tuan",18,"DA NANG");
SELECT * FROM teacher; 