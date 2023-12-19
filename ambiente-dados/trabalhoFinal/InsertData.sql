-- Inserindo dados na tabela Cidade
INSERT INTO mydb.Cidade (idCidade, Nome) VALUES
(1, 'Veneza'),
(2, 'Paris'),
(3, 'Salvador');

-- Inserindo dados na tabela Viagem
INSERT INTO mydb.Viagem (idViagem, Nome, Data_Inicial, Data_Final, Cidade_idCidade) VALUES
(1, 'Viagem para Veneza', '2023-01-01', '2023-01-10', 1),
(2, 'Viagem para Paris', '2023-02-01', '2023-02-15', 2),
(3, 'Viagem para Salvador', '2023-03-01', '2023-03-20', 3);

-- Inserindo dados na tabela Despesas
INSERT INTO mydb.Despesas (idDespesas, Tipo_Despesa, Data_Aquisicao, Data_Hora_Ultilizacao, Link_Online, Arquivo, Viagem_idViagem, Viagem_Cidade_idCidade, Preco) VALUES
(1, 'Alimentação', '2023-01-02', '2023-01-02 12:30:00', 'link1', 'arquivo1', 1, 1, 50.00),
(2, 'Hospedagem', '2023-01-03', '2023-01-03 20:00:00', 'link2', 'arquivo2', 1, 1, 120.00),
(3, 'Transporte', '2023-01-04', '2023-01-04 08:00:00', 'link3', 'arquivo3', 1, 1, 80.00);

-- Inserindo dados na tabela Pontos_Turisticos
INSERT INTO mydb.Pontos_Turisticos (idPontos_Turisticos, Nome, Tipo, Horario_Atendimento, Preco_Entrada, Suporte_Necessidades_Epeciais, Posicao_GoogleMaps, Faixa_Etaria, Cidade_idCidade) VALUES
(1, 'Ponto1', 'Museu', '09:00:00', 20.00, 'Sim', 'posicao1', 12, 1),
(2, 'Ponto2', 'Parque', '10:00:00', 0.00, 'Não', 'posicao2', 16, 2),
(3, 'Ponto3', 'Teatro', '15:00:00', 30.00, 'Sim', 'posicao3', 18, 3);

-- Inserindo dados na tabela Pessoas
INSERT INTO mydb.Pessoas (idPessoas, Nome, Sexo, Data_Nascimento, Necessidade_Especial, Rua, Numero, Complemento, Bairro) VALUES
(1, 'Pessoa1', 'Feminino', '1990-01-15', 'Nenhuma', 'Rua A', '123', 'Apto 1', 'Bairro1'),
(2, 'Pessoa2', 'Masculino', '1985-05-20', 'Cadeirante', 'Rua B', '456', 'Casa 2', 'Bairro2'),
(3, 'Pessoa3', 'Feminino', '1992-08-10', 'Nenhuma', 'Rua C', '789', 'Sobrado 3', 'Bairro3');

-- Inserindo dados na tabela Agenda
INSERT INTO mydb.Agenda (idAgenda, Dia, Hora_Inicio, Hora_FIm, Programacao, Viagem_idViagem, Viagem_Cidade_idCidade) VALUES
(1, '2023-01-05', '09:00:00', '12:00:00', 'Museu', 1, 1),
(2, '2023-02-05', '14:00:00', '17:00:00', 'Zoologico', 2, 2),
(3, '2023-03-05', '10:00:00', '13:00:00', 'Teatro', 3, 3);

-- Inserindo dados na tabela Telefone
INSERT INTO mydb.Telefone (Telefone, Pessoas_idPessoas) VALUES
(11112222, 1),
(33334444, 2),
(55556666, 3);

-- Inserindo dados na tabela Email
INSERT INTO mydb.Email (Email, Pessoas_idPessoas) VALUES
('email1@email.com', 1),
('email2@email.com', 2),
('email3@email.com', 3);

-- Inserindo dados na tabela Viagem_Pessoas
INSERT INTO mydb.Viagem_Pessoas (Pessoas_idPessoas, Viagem_idViagem, Viagem_Cidade_idCidade, Quantidade) VALUES
(1, 1, 1, '1'),
(2, 1, 1, '2'),
(3, 1, 1, '1'),
(2, 2, 2, '3'),
(3, 2, 2, '2'),
(1, 3, 3, '1'),
(2, 3, 3, '2'),
(3, 3, 3, '1');

-- Inserindo dados na tabela Email_Contato
INSERT INTO mydb.Email_Contato (Despesas_idDespesas, Despesas_Viagem_idViagem, Despesas_Viagem_Cidade_idCidade, Email_Contato) VALUES
(1, 1, 1, 'contato1@email.com'),
(2, 2, 2, 'contato2@email.com'),
(3, 3, 3, 'contato3@email.com');

-- Inserindo dados na tabela Telefone_Contato
INSERT INTO mydb.Telefone_Contato (Despesas_idDespesas, Despesas_Viagem_idViagem, Despesas_Viagem_Cidade_idCidade, Telefon_Contato) VALUES
(1, 1, 1, 99998888),
(2, 2, 2, 77776666),
(3, 3, 3, 55554444);
