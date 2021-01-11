CREATE TABLE `user_details` (
  `name` varchar(45) DEFAULT NULL,
  `email_id` varchar(45) NOT NULL,
  `pri_contact_no` varchar(10) DEFAULT NULL,
  `sec_contact_no` varchar(10) DEFAULT NULL,
  `dob` date DEFAULT NULL,
  `address` varchar(1000) DEFAULT NULL,
  `password` varchar(4000) NOT NULL,
  `enabled` tinyint(1) NOT NULL DEFAULT '1',
  `role_id` varchar(50) NOT NULL,
  PRIMARY KEY (`email_id`),
  UNIQUE KEY `user_emailId_UNIQUE` (`email_id`),
  UNIQUE KEY `pr_contact_no_UNIQUE` (`pri_contact_no`),
  KEY `frk_role_id_idx` (`role_id`),
  CONSTRAINT `frk_role_id` FOREIGN KEY (`role_id`) REFERENCES `authorities` (`email_id`) ON DELETE NO ACTION ON UPDATE NO ACTION
) ENGINE=InnoDB DEFAULT CHARSET=latin1;


CREATE TABLE `authorities` (
  `email_id` varchar(50) NOT NULL,
  `authority` varchar(50) NOT NULL,
  PRIMARY KEY (`email_id`),
  KEY `frk_email_id_idx` (`email_id`)
) ENGINE=InnoDB DEFAULT CHARSET=latin1;



