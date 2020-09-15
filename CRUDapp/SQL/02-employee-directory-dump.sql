use EmployeeHR;

select * from EmployeeHR;

INSERT INTO `employeedb`.`branchhr` (`BranchID`, `Branch_Name`, `Postal_Address`, `Branch_Location`) VALUES ('1', 'Bloemfontein Central', '121 Mark Srett', 'Bloemfontein');
INSERT INTO `employeedb`.`branchhr` (`BranchID`, `Branch_Name`, `Postal_Address`, `Branch_Location`) VALUES ('2', 'Durban North', 'Clifford Street, Mhlaga', 'Durban');
INSERT INTO `employeedb`.`branchhr` (`BranchID`, `Branch_Name`, `Postal_Address`, `Branch_Location`) VALUES ('3', 'Century City', '16th Street, Century', 'Cape Town');

INSERT INTO `employeedb`.`employeehr` (`EmployeeID`, `Full_Name`, `Birthday`, `Telephone_Number`, `Marital_Status`, `BranchID`) VALUES ('1', 'John Wick', '02/05/1970', '0708416648', 'single', '3');
INSERT INTO `employeedb`.`employeehr` (`EmployeeID`, `Full_Name`, `Birthday`, `Telephone_Number`, `Marital_Status`, `BranchID`) VALUES ('2', 'Will Smith', '25/09/1972', '0781515155', 'married', '1');
INSERT INTO `employeedb`.`employeehr` (`EmployeeID`, `Full_Name`, `Birthday`, `Telephone_Number`, `Marital_Status`, `BranchID`) VALUES ('3', 'Nikola Tesla', '04/11/1952', '0666615458', 'married', '2');