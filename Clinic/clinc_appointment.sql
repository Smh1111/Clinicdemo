-- MySQL Workbench Forward Engineering

SET @OLD_UNIQUE_CHECKS=@@UNIQUE_CHECKS, UNIQUE_CHECKS=0;
SET @OLD_FOREIGN_KEY_CHECKS=@@FOREIGN_KEY_CHECKS, FOREIGN_KEY_CHECKS=0;
SET @OLD_SQL_MODE=@@SQL_MODE, SQL_MODE='ONLY_FULL_GROUP_BY,STRICT_TRANS_TABLES,NO_ZERO_IN_DATE,NO_ZERO_DATE,ERROR_FOR_DIVISION_BY_ZERO,NO_ENGINE_SUBSTITUTION';

-- -----------------------------------------------------
-- Schema clinic_appointment
-- -----------------------------------------------------

-- -----------------------------------------------------
-- Schema clinic_appointment
-- -----------------------------------------------------
CREATE SCHEMA IF NOT EXISTS `clinic_appointment` DEFAULT CHARACTER SET utf8 ;
USE `clinic_appointment` ;

-- -----------------------------------------------------
-- Table `clinic_appointment`.`patient`
-- -----------------------------------------------------
CREATE TABLE IF NOT EXISTS `clinic_appointment`.`patient` (
  `patient_id` INT NOT NULL auto_increment,
  `name` VARCHAR(255) NOT NULL,
  `phone_number` VARCHAR(100) NOT NULL,
  `dob` DATETIME NOT NULL,
  `gender` VARCHAR(6) NOT NULL,
  `address` VARCHAR(255) NOT NULL,
  PRIMARY KEY (`patient_id`))
ENGINE = InnoDB;


-- -----------------------------------------------------
-- Table `clinic_appointment`.`appointment`
-- -----------------------------------------------------
CREATE TABLE IF NOT EXISTS `clinic_appointment`.`appointment` (
  `appointment_id` INT NOT NULL auto_increment,
  `patient_id` INT NOT NULL,
  `doctor_id` INT NOT NULL,
  `booking_no` INT(3) NULL,
  `date_time` TIMESTAMP NULL,
  `last_updated` TIMESTAMP NOT NULL DEFAULT CURRENT_TIMESTAMP,
  PRIMARY KEY (`appointment_id`))
ENGINE = InnoDB;


-- -----------------------------------------------------
-- Table `clinic_appointment`.`department`
-- -----------------------------------------------------
CREATE TABLE IF NOT EXISTS `clinic_appointment`.`department` (
  `department_id` INT NOT NULL AUTO_INCREMENT,
  `department_name` VARCHAR(255) NULL,
  PRIMARY KEY (`department_id`))
ENGINE = InnoDB;


-- -----------------------------------------------------
-- Table `clinic_appointment`.`doctor`
-- -----------------------------------------------------
CREATE TABLE IF NOT EXISTS `clinic_appointment`.`doctor` (
  `doctor_id` TINYINT UNSIGNED NOT NULL AUTO_INCREMENT,
  `doctor_name` VARCHAR(255) NOT NULL,
  `phone_no` VARCHAR(100) NOT NULL,
  `doctor_nrc` VARCHAR(45) NOT NULL,
  `department_id` TINYINT UNSIGNED NOT NULL,
  `gender` VARCHAR(6) NOT NULL,
  `address` VARCHAR(255) NULL,
  PRIMARY KEY (`doctor_id`))
ENGINE = InnoDB;


SET SQL_MODE=@OLD_SQL_MODE;
SET FOREIGN_KEY_CHECKS=@OLD_FOREIGN_KEY_CHECKS;
SET UNIQUE_CHECKS=@OLD_UNIQUE_CHECKS;
