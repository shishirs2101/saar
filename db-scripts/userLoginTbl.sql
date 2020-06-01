CREATE TABLE `ecom`.`user_details` (
  `id` INT NOT NULL,
  `name` VARCHAR(45) NULL,
  `emailId` VARCHAR(45) NOT NULL,
  `pri_contact_no` INT NULL,
  `sec_contact_no` INT NULL,
  `dob` DATE NULL,
  `address` VARCHAR(1000) NULL,
  PRIMARY KEY (`id`),
  UNIQUE INDEX `user_emailId_UNIQUE` (`emailId` ASC),
  UNIQUE INDEX `pr_contact_no_UNIQUE` (`pr_contact_no` ASC));
  
  
  CREATE TABLE `ecom`.`user_credentails` (
  `id` INT NOT NULL,
  `name` VARCHAR(45) NULL,
  `password` VARCHAR(45) NOT NULL,
  PRIMARY KEY (`id`),
  UNIQUE INDEX `password_UNIQUE` (`password` ASC));
