-- MySQL Workbench Forward Engineering

SET @OLD_UNIQUE_CHECKS=@@UNIQUE_CHECKS, UNIQUE_CHECKS=0;
SET @OLD_FOREIGN_KEY_CHECKS=@@FOREIGN_KEY_CHECKS, FOREIGN_KEY_CHECKS=0;
SET @OLD_SQL_MODE=@@SQL_MODE, SQL_MODE='ONLY_FULL_GROUP_BY,STRICT_TRANS_TABLES,NO_ZERO_IN_DATE,NO_ZERO_DATE,ERROR_FOR_DIVISION_BY_ZERO,NO_ENGINE_SUBSTITUTION';

-- -----------------------------------------------------
-- Schema skillfactory_lezione22_2
-- -----------------------------------------------------

-- -----------------------------------------------------
-- Schema skillfactory_lezione22_2
-- -----------------------------------------------------
CREATE SCHEMA IF NOT EXISTS `skillfactory_lezione22_2` DEFAULT CHARACTER SET utf8mb4 COLLATE utf8mb4_0900_ai_ci ;
SHOW WARNINGS;
USE `skillfactory_lezione22_2` ;

-- -----------------------------------------------------
-- Table `skillfactory_lezione22_2`.`persone`
-- -----------------------------------------------------
CREATE TABLE IF NOT EXISTS `skillfactory_lezione22_2`.`persone` (
  `id` INT NOT NULL AUTO_INCREMENT,
  `codice_fiscale` VARCHAR(45) NOT NULL,
  `nome` VARCHAR(45) NOT NULL,
  `cognome` VARCHAR(45) NOT NULL,
  `luogo_di_nascita` VARCHAR(45) NOT NULL,
  `data_di_nascita` DATE NOT NULL,
  `sesso` ENUM('maschio', 'femmina', 'altro') NOT NULL,
  PRIMARY KEY (`id`),
  UNIQUE INDEX `codice_fiscale_UNIQUE` (`codice_fiscale` ASC) VISIBLE)
ENGINE = InnoDB;

SHOW WARNINGS;

-- -----------------------------------------------------
-- Table `skillfactory_lezione22_2`.`titoli_di_studio`
-- -----------------------------------------------------
CREATE TABLE IF NOT EXISTS `skillfactory_lezione22_2`.`titoli_di_studio` (
  `id` INT NOT NULL AUTO_INCREMENT,
  `titolo` VARCHAR(45) NOT NULL,
  PRIMARY KEY (`id`))
ENGINE = InnoDB;

SHOW WARNINGS;

-- -----------------------------------------------------
-- Table `skillfactory_lezione22_2`.`contatti`
-- -----------------------------------------------------
CREATE TABLE IF NOT EXISTS `skillfactory_lezione22_2`.`contatti` (
  `id` INT NOT NULL AUTO_INCREMENT,
  `contatto` VARCHAR(45) NOT NULL,
  `tipo_contatto` VARCHAR(45) NOT NULL,
  `id_persona` INT NOT NULL,
  PRIMARY KEY (`id`),
  UNIQUE INDEX `contatto_UNIQUE` (`contatto` ASC) VISIBLE,
  INDEX `fk_contatto_peronsa_idx` (`id_persona` ASC) VISIBLE,
  CONSTRAINT `fk_contatto_peronsa`
    FOREIGN KEY (`id_persona`)
    REFERENCES `skillfactory_lezione22_2`.`persone` (`id`)
    ON DELETE CASCADE
    ON UPDATE CASCADE)
ENGINE = InnoDB;

SHOW WARNINGS;

-- -----------------------------------------------------
-- Table `skillfactory_lezione22_2`.`cross_p_tds`
-- -----------------------------------------------------
CREATE TABLE IF NOT EXISTS `skillfactory_lezione22_2`.`cross_p_tds` (
  `id` INT NOT NULL AUTO_INCREMENT,
  `id_persona` INT NULL,
  `id_titolo_di_studio` INT NULL,
  PRIMARY KEY (`id`),
  INDEX `fk_perone_tds_idx` (`id_persona` ASC) VISIBLE,
  INDEX `fk_corss_tds_idx` (`id_titolo_di_studio` ASC) VISIBLE,
  CONSTRAINT `fk_cross_persone`
    FOREIGN KEY (`id_persona`)
    REFERENCES `skillfactory_lezione22_2`.`persone` (`id`)
    ON DELETE NO ACTION
    ON UPDATE NO ACTION,
  CONSTRAINT `fk_corss_tds`
    FOREIGN KEY (`id_titolo_di_studio`)
    REFERENCES `skillfactory_lezione22_2`.`titoli_di_studio` (`id`)
    ON DELETE NO ACTION
    ON UPDATE NO ACTION)
ENGINE = InnoDB;

SHOW WARNINGS;
USE `skillfactory_lezione22_2` ;

-- -----------------------------------------------------
-- Placeholder table for view `skillfactory_lezione22_2`.`v_gino`
-- -----------------------------------------------------
CREATE TABLE IF NOT EXISTS `skillfactory_lezione22_2`.`v_gino` (`nome` INT, `cognome` INT, `luogo_di_nascita` INT, `data_di_nascita` INT, `sesso` INT, `codice_fiscale` INT, `titolo_di_studio` INT, `contatto` INT, `tipo_contatto` INT, `eta` INT);
SHOW WARNINGS;

-- -----------------------------------------------------
-- View `skillfactory_lezione22_2`.`v_gino`
-- -----------------------------------------------------
DROP TABLE IF EXISTS `skillfactory_lezione22_2`.`v_gino`;
SHOW WARNINGS;
USE `skillfactory_lezione22_2`;
CREATE OR REPLACE VIEW v_gino AS
	SELECT p.nome nome, p.cognome cognome, p.luogo_di_nascita luogo_di_nascita, 
			p.data_di_nascita data_di_nascita, p.sesso sesso, p.codice_fiscale codice_fiscale,
            tds.titolo titolo_di_studio, c.contatto contatto, c.tipo_contatto tipo_contatto, 
            FLOOR(DATEDIFF(CURDATE(), p.data_di_nascita)/365) eta
    FROM persone p
    JOIN cross_p_tds cptds ON p.id = cptds.id_persona
    JOIN titoli_di_studio tds ON cptds.id_titolo_di_studio = tds.id
    JOIN contatti c ON p.id = c.id_persona;
SHOW WARNINGS;

SET SQL_MODE=@OLD_SQL_MODE;
SET FOREIGN_KEY_CHECKS=@OLD_FOREIGN_KEY_CHECKS;
SET UNIQUE_CHECKS=@OLD_UNIQUE_CHECKS;
