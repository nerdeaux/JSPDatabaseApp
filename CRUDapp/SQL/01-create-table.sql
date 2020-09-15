create database EmployeeDB;

USE EmployeeDB;

CREATE TABLE `employeehr` (
  `EmployeeID` int(10) NOT NULL,
  `Full_Name` varchar(45) NOT NULL,
  `Birthday` varchar(45) NOT NULL,
  `Telephone_Number` varchar(45) NOT NULL,
  `Marital_Status` varchar(45) NOT NULL,
  `BranchID` int(4) NOT NULL,
  PRIMARY KEY (`EmployeeID`),
  KEY `Branch_FK_ID` (`BranchID`),
  CONSTRAINT `Branch_FK_ID` FOREIGN KEY (`BranchID`) REFERENCES `branchhr` (`BranchID`) ON DELETE NO ACTION ON UPDATE NO ACTION
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4

CREATE TABLE `branchhr` (
  `BranchID` int(3) NOT NULL,
  `Branch_Name` varchar(45) NOT NULL,
  `Postal_Address` int(8) NOT NULL,
  `Branch_Location` varchar(45) NOT NULL,
  PRIMARY KEY (`BranchID`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4