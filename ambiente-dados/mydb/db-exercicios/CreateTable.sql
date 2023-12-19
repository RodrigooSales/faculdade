-- MySQL Workbench Forward Engineering

SET @OLD_UNIQUE_CHECKS=@@UNIQUE_CHECKS, UNIQUE_CHECKS=0;
SET @OLD_FOREIGN_KEY_CHECKS=@@FOREIGN_KEY_CHECKS, FOREIGN_KEY_CHECKS=0;
SET @OLD_SQL_MODE=@@SQL_MODE, SQL_MODE='ONLY_FULL_GROUP_BY,STRICT_TRANS_TABLES,NO_ZERO_IN_DATE,NO_ZERO_DATE,ERROR_FOR_DIVISION_BY_ZERO,NO_ENGINE_SUBSTITUTION';

-- -----------------------------------------------------
-- Schema Exercicios
-- -----------------------------------------------------

-- -----------------------------------------------------
-- Schema Exercicios
-- -----------------------------------------------------
CREATE SCHEMA IF NOT EXISTS `Exercicios` DEFAULT CHARACTER SET utf8 ;
USE `Exercicios` ;

-- -----------------------------------------------------
-- Table `Exercicios`.`Usuario`
-- -----------------------------------------------------
CREATE TABLE IF NOT EXISTS `Exercicios`.`Usuario` (
  `idUsuario` INT NOT NULL,
  `Nome` VARCHAR(45) NOT NULL,
  `Logradouro` VARCHAR(45) NULL,
  `Número` VARCHAR(45) NULL,
  `Bairro` VARCHAR(45) NULL,
  `CEP` VARCHAR(8) NULL,
  `UF` VARCHAR(2) NULL,
  `DataNascimento` DATETIME NULL,
  PRIMARY KEY (`idUsuario`))
ENGINE = InnoDB;


-- -----------------------------------------------------
-- Table `Exercicios`.`TipoConta`
-- -----------------------------------------------------
CREATE TABLE IF NOT EXISTS `Exercicios`.`TipoConta` (
  `idTipoConta` INT NOT NULL,
  `Descrição` VARCHAR(45) NULL,
  PRIMARY KEY (`idTipoConta`))
ENGINE = InnoDB;


-- -----------------------------------------------------
-- Table `Exercicios`.`Contas`
-- -----------------------------------------------------
CREATE TABLE IF NOT EXISTS `Exercicios`.`Contas` (
  `idConta` INT NOT NULL,
  `Descricao` VARCHAR(45) NULL,
  `TipoConta_idTipoConta` INT NOT NULL,
  `Usuario_idUsuario` INT NOT NULL,
  `SaldoInicial` DECIMAL(18,2) NOT NULL DEFAULT 0,
  PRIMARY KEY (`idConta`),
  INDEX `fk_Contas_TipoConta_idx` (`TipoConta_idTipoConta` ASC) VISIBLE,
  INDEX `fk_Contas_Usuario1_idx` (`Usuario_idUsuario` ASC) VISIBLE,
  CONSTRAINT `fk_Contas_TipoConta`
    FOREIGN KEY (`TipoConta_idTipoConta`)
    REFERENCES `Exercicios`.`TipoConta` (`idTipoConta`)
    ON DELETE NO ACTION
    ON UPDATE NO ACTION,
  CONSTRAINT `fk_Contas_Usuario1`
    FOREIGN KEY (`Usuario_idUsuario`)
    REFERENCES `Exercicios`.`Usuario` (`idUsuario`)
    ON DELETE NO ACTION
    ON UPDATE NO ACTION)
ENGINE = InnoDB;


-- -----------------------------------------------------
-- Table `Exercicios`.`TipoMovimento`
-- -----------------------------------------------------
CREATE TABLE IF NOT EXISTS `Exercicios`.`TipoMovimento` (
  `idTipoMovimento` INT NOT NULL,
  `DescMovimentacao` VARCHAR(45) NOT NULL,
  PRIMARY KEY (`idTipoMovimento`))
ENGINE = InnoDB;


-- -----------------------------------------------------
-- Table `Exercicios`.`Categoria`
-- -----------------------------------------------------
CREATE TABLE IF NOT EXISTS `Exercicios`.`Categoria` (
  `idCategoria` INT NOT NULL,
  `DescCategoria` VARCHAR(45) NOT NULL,
  PRIMARY KEY (`idCategoria`))
ENGINE = InnoDB;


-- -----------------------------------------------------
-- Table `Exercicios`.`Movimentacao`
-- -----------------------------------------------------
CREATE TABLE IF NOT EXISTS `Exercicios`.`Movimentacao` (
  `idMovimentacao` INT NOT NULL,
  `DataMovimentacao` DATETIME NOT NULL,
  `Descricao` VARCHAR(45) NULL,
  `TipoMovimento_idTipoMovimento` INT NOT NULL,
  `Categoria_idCategoria` INT NOT NULL,
  `Contas_idConta` INT NOT NULL,
  `Valor` DECIMAL(18,2) NOT NULL DEFAULT 0,
  PRIMARY KEY (`idMovimentacao`),
  INDEX `fk_Movimentacao_TipoMovimento1_idx` (`TipoMovimento_idTipoMovimento` ASC) VISIBLE,
  INDEX `fk_Movimentacao_Categoria1_idx` (`Categoria_idCategoria` ASC) VISIBLE,
  INDEX `fk_Movimentacao_Contas1_idx` (`Contas_idConta` ASC) VISIBLE,
  CONSTRAINT `fk_Movimentacao_TipoMovimento1`
    FOREIGN KEY (`TipoMovimento_idTipoMovimento`)
    REFERENCES `Exercicios`.`TipoMovimento` (`idTipoMovimento`)
    ON DELETE NO ACTION
    ON UPDATE NO ACTION,
  CONSTRAINT `fk_Movimentacao_Categoria1`
    FOREIGN KEY (`Categoria_idCategoria`)
    REFERENCES `Exercicios`.`Categoria` (`idCategoria`)
    ON DELETE NO ACTION
    ON UPDATE NO ACTION,
  CONSTRAINT `fk_Movimentacao_Contas1`
    FOREIGN KEY (`Contas_idConta`)
    REFERENCES `Exercicios`.`Contas` (`idConta`)
    ON DELETE NO ACTION
    ON UPDATE NO ACTION)
ENGINE = InnoDB;


SET SQL_MODE=@OLD_SQL_MODE;
SET FOREIGN_KEY_CHECKS=@OLD_FOREIGN_KEY_CHECKS;
SET UNIQUE_CHECKS=@OLD_UNIQUE_CHECKS;