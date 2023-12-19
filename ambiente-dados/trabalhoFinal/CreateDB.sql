CREATE SCHEMA IF NOT EXISTS mydb DEFAULT CHARACTER SET utf8 ;
USE mydb ;

CREATE TABLE IF NOT EXISTS mydb.Cidade (
  idCidade INT NOT NULL,
  Nome VARCHAR(45) NOT NULL,
  PRIMARY KEY (idCidade))

CREATE TABLE IF NOT EXISTS mydb.Viagem (
  idViagem INT NOT NULL,
  Nome VARCHAR(45) NOT NULL,
  Data_Inicial DATE NOT NULL,
  Data_Final DATE NOT NULL,
  Cidade_idCidade INT NOT NULL,
  PRIMARY KEY (idViagem, Cidade_idCidade),
  INDEX fk_Viagem_Cidade_idx (Cidade_idCidade ASC) VISIBLE
);

ALTER TABLE mydb.Viagem
ADD CONSTRAINT fk_Viagem_Cidade
FOREIGN KEY (Cidade_idCidade)
REFERENCES mydb.Cidade (idCidade)
ON DELETE NO ACTION
ON UPDATE NO ACTION;


CREATE TABLE IF NOT EXISTS mydb.Despesas (
  idDespesas INT NOT NULL,
  Tipo_Despesa VARCHAR(45) NOT NULL,
  Data_Aquisicao DATE NOT NULL,
  Data_Hora_Ultilizacao DATETIME(2) NOT NULL,
  Link_Online VARCHAR(45) NOT NULL,
  Arquivo VARCHAR(45) NOT NULL,
  Viagem_idViagem INT NOT NULL,
  Viagem_Cidade_idCidade INT NOT NULL,
  Preco DECIMAL(10,2) NOT NULL,
  PRIMARY KEY (idDespesas, Viagem_idViagem, Viagem_Cidade_idCidade, Preco),
  INDEX fk_Despesas_Viagem1_idx (Viagem_idViagem ASC, Viagem_Cidade_idCidade ASC) VISIBLE
);

ALTER TABLE mydb.Despesas
ADD CONSTRAINT fk_Despesas_Viagem1
FOREIGN KEY (Viagem_idViagem, Viagem_Cidade_idCidade)
REFERENCES mydb.Viagem (idViagem, Cidade_idCidade)
ON DELETE NO ACTION
ON UPDATE NO ACTION;

CREATE TABLE IF NOT EXISTS mydb.Pontos_Turisticos (
  idPontos_Turisticos INT NOT NULL,
  Nome VARCHAR(45) NOT NULL,
  Tipo VARCHAR(45) NOT NULL,
  Horario_Atendimento TIME NOT NULL,
  Preco_Entrada DECIMAL(2) NOT NULL,
  Suporte_Necessidades_Epeciais VARCHAR(45) NOT NULL,
  Posicao_GoogleMaps VARCHAR(45) NOT NULL,
  Faixa_Etaria INT NOT NULL,
  Cidade_idCidade INT NOT NULL,
  PRIMARY KEY (idPontos_Turisticos, Cidade_idCidade),
  INDEX fk_Pontos_Turisticos_Cidade1_idx (Cidade_idCidade ASC) VISIBLE
);

ALTER TABLE mydb.Pontos_Turisticos
ADD CONSTRAINT fk_Pontos_Turisticos_Cidade1
FOREIGN KEY (Cidade_idCidade)
REFERENCES mydb.Cidade (idCidade)
ON DELETE NO ACTION
ON UPDATE NO ACTION;


CREATE TABLE IF NOT EXISTS mydb.Pessoas (
  idPessoas INT NOT NULL,
  Nome VARCHAR(45) NOT NULL,
  Sexo VARCHAR(45) NULL,
  Data_Nascimento DATE NOT NULL,
  Necessidade_Especial VARCHAR(45) NOT NULL,
  Rua VARCHAR(45) NOT NULL,
  Numero VARCHAR(45) NOT NULL,
  Complemento VARCHAR(45) NOT NULL,
  Bairro VARCHAR(45) NOT NULL,
  PRIMARY KEY (idPessoas))

CREATE TABLE IF NOT EXISTS mydb.Agenda (
  idAgenda INT NOT NULL,
  Dia DATE NOT NULL,
  Hora_Inicio TIME NOT NULL,
  Hora_FIm TIME NOT NULL,
  Programacao VARCHAR(45) NOT NULL,
  Viagem_idViagem INT NOT NULL,
  Viagem_Cidade_idCidade INT NOT NULL,
  PRIMARY KEY (idAgenda, Viagem_idViagem, Viagem_Cidade_idCidade),
  INDEX fk_Agenda_Viagem1_idx (Viagem_idViagem ASC, Viagem_Cidade_idCidade ASC) VISIBLE
);

ALTER TABLE mydb.Agenda
ADD CONSTRAINT fk_Agenda_Viagem1
FOREIGN KEY (Viagem_idViagem, Viagem_Cidade_idCidade)
REFERENCES mydb.Viagem (idViagem, Cidade_idCidade)
ON DELETE NO ACTION
ON UPDATE NO ACTION;

CREATE TABLE IF NOT EXISTS mydb.Telefone (
  Telefone INT NOT NULL,
  Pessoas_idPessoas INT NOT NULL,
  PRIMARY KEY (Telefone, Pessoas_idPessoas)
);

ALTER TABLE mydb.Telefone
ADD CONSTRAINT fk_Telefone_Pessoas1
FOREIGN KEY (Pessoas_idPessoas)
REFERENCES mydb.Pessoas (idPessoas)
ON DELETE NO ACTION
ON UPDATE NO ACTION;

CREATE TABLE IF NOT EXISTS mydb.Email (
  Email VARCHAR(45) CHARACTER SET 'big5' NOT NULL,
  Pessoas_idPessoas INT NOT NULL,
  PRIMARY KEY (Pessoas_idPessoas, Email)
);

ALTER TABLE mydb.Email
ADD CONSTRAINT fk_Email_Pessoas1
FOREIGN KEY (Pessoas_idPessoas)
REFERENCES mydb.Pessoas (idPessoas)
ON DELETE NO ACTION
ON UPDATE NO ACTION;

CREATE TABLE IF NOT EXISTS mydb.Viagem_Pessoas (
  Pessoas_idPessoas INT NOT NULL,
  Viagem_idViagem INT NOT NULL,
  Viagem_Cidade_idCidade INT NOT NULL,
  Quantidade VARCHAR(45) NOT NULL,
  PRIMARY KEY (Pessoas_idPessoas, Viagem_idViagem, Viagem_Cidade_idCidade),
  INDEX fk_Viagem_Pessoas_Viagem1_idx (Viagem_idViagem ASC, Viagem_Cidade_idCidade ASC) VISIBLE
);

ALTER TABLE mydb.Viagem_Pessoas
ADD CONSTRAINT fk_Viagem_Pessoas_Pessoas1
FOREIGN KEY (Pessoas_idPessoas)
REFERENCES mydb.Pessoas (idPessoas)
ON DELETE NO ACTION
ON UPDATE NO ACTION;

ALTER TABLE mydb.Viagem_Pessoas
ADD CONSTRAINT fk_Viagem_Pessoas_Viagem1
FOREIGN KEY (Viagem_idViagem, Viagem_Cidade_idCidade)
REFERENCES mydb.Viagem (idViagem, Cidade_idCidade)
ON DELETE NO ACTION
ON UPDATE NO ACTION;

CREATE TABLE IF NOT EXISTS mydb.Email_Contato (
  Despesas_idDespesas INT NOT NULL,
  Despesas_Viagem_idViagem INT NOT NULL,
  Despesas_Viagem_Cidade_idCidade INT NOT NULL,
  Email_Contato VARCHAR(45) NOT NULL,
  PRIMARY KEY (Despesas_idDespesas, Despesas_Viagem_idViagem, Despesas_Viagem_Cidade_idCidade)
);

ALTER TABLE mydb.Email_Contato
ADD CONSTRAINT fk_Email_Contato_Despesas1
FOREIGN KEY (Despesas_idDespesas, Despesas_Viagem_idViagem, Despesas_Viagem_Cidade_idCidade)
REFERENCES mydb.Despesas (idDespesas, Viagem_idViagem, Viagem_Cidade_idCidade)
ON DELETE NO ACTION
ON UPDATE NO ACTION;


CREATE TABLE IF NOT EXISTS mydb.Telefone_Contato (
  Despesas_idDespesas INT NOT NULL,
  Despesas_Viagem_idViagem INT NOT NULL,
  Despesas_Viagem_Cidade_idCidade INT NOT NULL,
  Telefon_Contato INT NOT NULL,
  PRIMARY KEY (Despesas_idDespesas, Despesas_Viagem_idViagem, Despesas_Viagem_Cidade_idCidade)
);

ALTER TABLE mydb.Telefone_Contato
ADD CONSTRAINT fk_Telefone_Contato_Despesas1
FOREIGN KEY (Despesas_idDespesas, Despesas_Viagem_idViagem, Despesas_Viagem_Cidade_idCidade)
REFERENCES mydb.Despesas (idDespesas, Viagem_idViagem, Viagem_Cidade_idCidade)
ON DELETE NO ACTION
ON UPDATE NO ACTION;