create database toga;

use toga;

CREATE TABLE `toga`.`user` (
  `id` INT NOT NULL,
  `username` VARCHAR(100) NULL,
  `password` VARCHAR(100) NULL,
  `age` INT NULL,
  PRIMARY KEY (`id`)
);