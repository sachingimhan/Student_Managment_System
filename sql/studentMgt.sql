DROP DATABASE StudentManagmentSystem;
CREATE DATABASE StudentManagmentSystem;

USE StudentManagmentSystem;

CREATE TABLE student(
	stdID VARCHAR(10) not NULL,
	name VARCHAR(255) NOT NULL,
	dob DATE NOT NULL,
	address VARCHAR(100) NOT NULL,
	guardian VARCHAR(255) not NULL,
	tel1 VARCHAR(15) NOT NULL,
	constraint primary key (stdID)
);
CREATE TABLE subject(
	subID VARCHAR(10) NOT NULL,
	sname VARCHAR(100) NOT NULL,
	constraint primary key (subID)
);
CREATE TABLE teacher(
	tecID varchar(20) not NULL,
	subID VARCHAR(10) NOT NULL,
	tecName varchar(255) not NULL,
	tecAddress varchar(255) NOT NULL,
	tecContact VARCHAR(12) not NULL,
	constraint primary key (tecID),
	constraint foreign key (subID) references subject(subID)
);
CREATE TABLE classroom(
	roomID varchar(10) NOT NULL,
	roomName VARCHAR(255) not NULL,
	constraint primary key (roomID)
);
CREATE TABLE classSubject(
	csId int(10) NOT NULL auto_increment,
	roomID varchar(10) NOT NULL,
	subID VARCHAR(10) NOT NULL,
	subFee decimal(10,2) NOT NULL,
	constraint primary key (csId),
	constraint foreign key (roomID) references classroom(roomID),
	constraint foreign key (subID) references subject(subID)
);
create table classFee(
	feeId varchar(20) NOT NULL,
	stdID VARCHAR(10) not NULL,
	feeDate date NOT NULL,
	feeMonth varchar(50) not null,
	grossAmount decimal(10,2) NOT NULL,
	discount decimal(10,2) NOT NULL,
	netAmount decimal(10,2) NOT NULL,
	payAmount decimal(10,2) NOT NULL,
	bala decimal(10,2) NOT NULL,
	constraint primary key (feeId),
	constraint foreign key (stdID) references student(stdID)
);
create table csFee(
	feeId varchar(20) NOT NULL,
	csId int(10) NOT NULL,
	subFee decimal(10,2) NOT NULL,
	status varchar(50),
	constraint foreign key (feeId) references classFee(feeId),
	constraint foreign key (csId) references classSubject(csId)
);
CREATE TABLE users(
	username varchar(20) PRIMARY KEY,
	password varchar(50) NOT NULL,
	previlages varchar(20) not null
);
