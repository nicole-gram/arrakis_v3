DROP SCHEMA IF EXISTS `bonds`;
CREATE SCHEMA `bonds`;
use bonds;

CREATE TABLE `book` (
  `id` int NOT NULL AUTO_INCREMENT,
  `name` varchar(255) NOT NULL,
  PRIMARY KEY (`id`)
);

CREATE TABLE `client` (
  `id` int NOT NULL AUTO_INCREMENT,
  `name` varchar(255) NOT NULL,
  `email` varchar(255) NOT NULL,
  `role` varchar(255) NOT NULL,
  PRIMARY KEY (`id`)
);

CREATE TABLE `counterparty` (
  `id` int NOT NULL AUTO_INCREMENT,
  `name` varchar(255) NOT NULL,
  PRIMARY KEY (`id`)
);

CREATE TABLE `book_client` (
  `book_id` int NOT NULL,
  `client_id` int NOT NULL,
  CONSTRAINT `FK1_book_id` FOREIGN KEY (`book_id`) REFERENCES `book` (`id`),
  CONSTRAINT `FK_client_id` FOREIGN KEY (`client_id`) REFERENCES `client` (`id`)
);

CREATE TABLE `security` (
  `id` int NOT NULL AUTO_INCREMENT,
  `isin` varchar(50) DEFAULT NULL,
  `cusip` varchar(50) DEFAULT NULL,
  `issuer_name` varchar(255) NOT NULL,
  `maturity_date` datetime NOT NULL,
  `coupon` float NOT NULL,
  `type` varchar(255) NOT NULL,
  `face_value` float NOT NULL,
  `currency` varchar(10) NOT NULL,
  `status` varchar(32) DEFAULT NULL,
  PRIMARY KEY (`id`)
);

CREATE TABLE `trades` (
  `id` int NOT NULL AUTO_INCREMENT,
  `book_id` int NOT NULL,
  `security_id` int NOT NULL,
  `counterparty_id` int NOT NULL,
  `currency` varchar(10) NOT NULL,
  `status` varchar(32) NOT NULL,
  `quantity` int NOT NULL,
  `unit_price` float NOT NULL,
  `buy_sell` varchar(32) NOT NULL,
  `trade_date` datetime NOT NULL,
  `settlement_date` datetime NOT NULL,
  PRIMARY KEY (`id`),
  CONSTRAINT `FK_security_id` FOREIGN KEY (`security_id`) REFERENCES `security` (`id`),
  CONSTRAINT `FK_counterparty_id` FOREIGN KEY (`counterparty_id`) REFERENCES `counterparty` (`id`),
  CONSTRAINT `FK_book_id` FOREIGN KEY (`book_id`) REFERENCES `book` (`id`)
);

ALTER TABLE book_client ADD PRIMARY KEY(book_id, client_id);
