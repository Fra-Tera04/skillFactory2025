-- MySQL Workbench Forward Engineering

SET @OLD_UNIQUE_CHECKS=@@UNIQUE_CHECKS, UNIQUE_CHECKS=0;
SET @OLD_FOREIGN_KEY_CHECKS=@@FOREIGN_KEY_CHECKS, FOREIGN_KEY_CHECKS=0;
SET @OLD_SQL_MODE=@@SQL_MODE, SQL_MODE='ONLY_FULL_GROUP_BY,STRICT_TRANS_TABLES,NO_ZERO_IN_DATE,NO_ZERO_DATE,ERROR_FOR_DIVISION_BY_ZERO,NO_ENGINE_SUBSTITUTION';

-- -----------------------------------------------------
-- Schema skillbook_23_2
-- -----------------------------------------------------

-- -----------------------------------------------------
-- Schema skillbook_23_2
-- -----------------------------------------------------
CREATE SCHEMA IF NOT EXISTS `skillbook_23_2` DEFAULT CHARACTER SET utf8mb4 COLLATE utf8mb4_0900_ai_ci ;
SHOW WARNINGS;
-- -----------------------------------------------------
-- Schema skillbook_23_2
-- -----------------------------------------------------

-- -----------------------------------------------------
-- Schema skillbook_23_2
-- -----------------------------------------------------
CREATE SCHEMA IF NOT EXISTS `skillbook_23_2` DEFAULT CHARACTER SET utf8mb4 COLLATE utf8mb4_0900_ai_ci ;
SHOW WARNINGS;
USE `skillbook_23_2` ;

-- -----------------------------------------------------
-- Table `skillbook_23_2`.`ruoli`
-- -----------------------------------------------------
CREATE TABLE IF NOT EXISTS `skillbook_23_2`.`ruoli` (
  `id` INT NOT NULL AUTO_INCREMENT,
  `ruolo` ENUM('Docente', 'Studente', 'Collaboratore') NOT NULL,
  PRIMARY KEY (`id`))
ENGINE = InnoDB;

SHOW WARNINGS;

-- -----------------------------------------------------
-- Table `skillbook_23_2`.`utenti`
-- -----------------------------------------------------
CREATE TABLE IF NOT EXISTS `skillbook_23_2`.`utenti` (
  `id` INT NOT NULL AUTO_INCREMENT,
  `nome` VARCHAR(45) NOT NULL,
  `cognome` VARCHAR(45) NOT NULL,
  `id_ruolo` INT NULL,
  PRIMARY KEY (`id`),
  INDEX `fk_ruoli_idx` (`id_ruolo` ASC) VISIBLE,
  CONSTRAINT `fk_ruoli`
    FOREIGN KEY (`id_ruolo`)
    REFERENCES `skillbook_23_2`.`ruoli` (`id`)
    ON DELETE CASCADE
    ON UPDATE CASCADE)
ENGINE = InnoDB;

SHOW WARNINGS;

-- -----------------------------------------------------
-- Table `skillbook_23_2`.`corsi`
-- -----------------------------------------------------
CREATE TABLE IF NOT EXISTS `skillbook_23_2`.`corsi` (
  `id` INT NOT NULL AUTO_INCREMENT,
  `nome` VARCHAR(45) NOT NULL,
  PRIMARY KEY (`id`))
ENGINE = InnoDB;

SHOW WARNINGS;

-- -----------------------------------------------------
-- Table `skillbook_23_2`.`cross_utenti_corsi`
-- -----------------------------------------------------
CREATE TABLE IF NOT EXISTS `skillbook_23_2`.`cross_utenti_corsi` (
  `id` INT NOT NULL AUTO_INCREMENT,
  `id_docente` INT NULL,
  `id_corso` INT NULL,
  PRIMARY KEY (`id`),
  INDEX `fk_cross_utenti_idx` (`id_docente` ASC) VISIBLE,
  INDEX `fk_cross_corsi_idx` (`id_corso` ASC) VISIBLE,
  CONSTRAINT `fk_cross_utenti`
    FOREIGN KEY (`id_docente`)
    REFERENCES `skillbook_23_2`.`utenti` (`id`)
    ON DELETE CASCADE
    ON UPDATE CASCADE,
  CONSTRAINT `fk_cross_corsi`
    FOREIGN KEY (`id_corso`)
    REFERENCES `skillbook_23_2`.`corsi` (`id`)
    ON DELETE CASCADE
    ON UPDATE CASCADE)
ENGINE = InnoDB;

SHOW WARNINGS;
USE `skillbook_23_2` ;
USE `skillbook_23_2` ;

-- -----------------------------------------------------
-- Placeholder table for view `skillbook_23_2`.`v_utenti_ruoli_corsi`
-- -----------------------------------------------------
CREATE TABLE IF NOT EXISTS `skillbook_23_2`.`v_utenti_ruoli_corsi` (`id_docente` INT, `nome` INT, `cognome` INT, `ruolo` INT, `corso` INT);
SHOW WARNINGS;

-- -----------------------------------------------------
-- View `skillbook_23_2`.`v_utenti_ruoli_corsi`
-- -----------------------------------------------------
DROP TABLE IF EXISTS `skillbook_23_2`.`v_utenti_ruoli_corsi`;
SHOW WARNINGS;
USE `skillbook_23_2`;
CREATE OR REPLACE VIEW `v_utenti_ruoli_corsi` AS
	SELECT d.id id_docente, d.nome nome, d.cognome cognome, r.ruolo ruolo, c.nome corso
    FROM utenti d
    JOIN ruoli r ON r.id = d.id_ruolo
    JOIN cross_utenti_corsi cdc ON cdc.id_docente = d.id
    LEFT  JOIN corsi c ON c.id = cdc.id_corso;
SHOW WARNINGS;

SET SQL_MODE=@OLD_SQL_MODE;
SET FOREIGN_KEY_CHECKS=@OLD_FOREIGN_KEY_CHECKS;
SET UNIQUE_CHECKS=@OLD_UNIQUE_CHECKS;
