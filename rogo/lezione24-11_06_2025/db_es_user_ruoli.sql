-- MySQL Workbench Forward Engineering

SET @OLD_UNIQUE_CHECKS=@@UNIQUE_CHECKS, UNIQUE_CHECKS=0;
SET @OLD_FOREIGN_KEY_CHECKS=@@FOREIGN_KEY_CHECKS, FOREIGN_KEY_CHECKS=0;
SET @OLD_SQL_MODE=@@SQL_MODE, SQL_MODE='ONLY_FULL_GROUP_BY,STRICT_TRANS_TABLES,NO_ZERO_IN_DATE,NO_ZERO_DATE,ERROR_FOR_DIVISION_BY_ZERO,NO_ENGINE_SUBSTITUTION';

-- -----------------------------------------------------
-- Schema mydb
-- -----------------------------------------------------
SHOW WARNINGS;
-- -----------------------------------------------------
-- Schema skillfactory_lezione23_1
-- -----------------------------------------------------

-- -----------------------------------------------------
-- Schema skillfactory_lezione23_1
-- -----------------------------------------------------
CREATE SCHEMA IF NOT EXISTS `skillfactory_lezione23_1` DEFAULT CHARACTER SET utf8mb4 COLLATE utf8mb4_0900_ai_ci ;
SHOW WARNINGS;
USE `skillfactory_lezione23_1` ;

-- -----------------------------------------------------
-- Table `skillfactory_lezione23_1`.`ruoli`
-- -----------------------------------------------------
CREATE TABLE IF NOT EXISTS `skillfactory_lezione23_1`.`ruoli` (
  `id` INT NOT NULL AUTO_INCREMENT,
  `ruolo` ENUM('ADMIN', 'GUEST') NULL DEFAULT NULL,
  PRIMARY KEY (`id`))
ENGINE = InnoDB
AUTO_INCREMENT = 4
DEFAULT CHARACTER SET = utf8mb4
COLLATE = utf8mb4_0900_ai_ci;

SHOW WARNINGS;

-- -----------------------------------------------------
-- Table `skillfactory_lezione23_1`.`utenti`
-- -----------------------------------------------------
CREATE TABLE IF NOT EXISTS `skillfactory_lezione23_1`.`utenti` (
  `id` INT NOT NULL AUTO_INCREMENT,
  `nome` VARCHAR(45) NOT NULL,
  `cognome` VARCHAR(45) NOT NULL,
  `id_ruolo` INT NULL DEFAULT NULL,
  `stipendio` DECIMAL(7,2) NOT NULL,
  `citta` VARCHAR(10) NOT NULL,
  PRIMARY KEY (`id`),
  INDEX `fk_utenti_ruoli_idx` (`id_ruolo` ASC) VISIBLE,
  CONSTRAINT `fk_utenti_ruoli`
    FOREIGN KEY (`id_ruolo`)
    REFERENCES `skillfactory_lezione23_1`.`ruoli` (`id`))
ENGINE = InnoDB
AUTO_INCREMENT = 8
DEFAULT CHARACTER SET = utf8mb4
COLLATE = utf8mb4_0900_ai_ci;

SHOW WARNINGS;
USE `skillfactory_lezione23_1` ;

-- -----------------------------------------------------
-- Placeholder table for view `skillfactory_lezione23_1`.`v_utenti_ruoli`
-- -----------------------------------------------------
CREATE TABLE IF NOT EXISTS `skillfactory_lezione23_1`.`v_utenti_ruoli` (`id` INT, `nome` INT, `cognome` INT, `ruolo` INT);
SHOW WARNINGS;

-- -----------------------------------------------------
-- View `skillfactory_lezione23_1`.`v_utenti_ruoli`
-- -----------------------------------------------------
DROP TABLE IF EXISTS `skillfactory_lezione23_1`.`v_utenti_ruoli`;
SHOW WARNINGS;
USE `skillfactory_lezione23_1`;
CREATE  OR REPLACE ALGORITHM=UNDEFINED DEFINER=`root`@`localhost` SQL SECURITY DEFINER VIEW `skillfactory_lezione23_1`.`v_utenti_ruoli` AS select `u`.`id` AS `id`,`u`.`nome` AS `nome`,`u`.`cognome` AS `cognome`,`r`.`ruolo` AS `ruolo` from (`skillfactory_lezione23_1`.`utenti` `u` join `skillfactory_lezione23_1`.`ruoli` `r` on((`r`.`id` = `u`.`id_ruolo`)));
SHOW WARNINGS;

SET SQL_MODE=@OLD_SQL_MODE;
SET FOREIGN_KEY_CHECKS=@OLD_FOREIGN_KEY_CHECKS;
SET UNIQUE_CHECKS=@OLD_UNIQUE_CHECKS;
