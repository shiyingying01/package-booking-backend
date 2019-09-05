CREATE TABLE `packager` (
  `id` varchar(20) NOT NULL,
  `receiver` varchar(20) DEFAULT NULL,
  `phone` varchar(11) DEFAULT NULL,
  `weight` varchar(11) DEFAULT NULL,
  `status`  varchar(33) DEFAULT NULL,
  `getTime` varchar(33) DEFAULT NULL,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;