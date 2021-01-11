CREATE TABLE `product_detail` (
  `product_id` int(11) NOT NULL,
  `product_desc` varchar(1000) DEFAULT NULL,
  `cost` double NOT NULL,
  `product_name` varchar(100) NOT NULL,
  `category_id` int(11) NOT NULL,
  PRIMARY KEY (`product_id`),
  KEY `frk_catagory_id_idx` (`category_id`),
  CONSTRAINT `frk_catagory_id` FOREIGN KEY (`category_id`) REFERENCES `product_category` (`product_id`) ON DELETE NO ACTION ON UPDATE NO ACTION
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

  
  
  CREATE TABLE `product_category` (
  `product_id` int(11) NOT NULL,
  `type` varchar(50) NOT NULL,
  `type_id` int(10) NOT NULL,
  PRIMARY KEY (`product_id`)
) ENGINE=InnoDB DEFAULT CHARSET=latin1;
