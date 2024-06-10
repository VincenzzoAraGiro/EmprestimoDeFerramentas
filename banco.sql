-- Cria a DataBase chamada db_emprestimos
CREATE DATABASE db_emprestimos;

-- Entrar na database db_emprestimos
USE db_emprestimos;
-- Cria a tabela de salvamento de dados de Ferramentas
CREATE TABLE ferramentas (
    id_ferramenta INT AUTO_INCREMENT PRIMARY KEY,
    nome VARCHAR(255),
    marca VARCHAR(255),
    custo_aquisicao DECIMAL(10, 2),
    status BOOLEAN NOT NULL DEFAULT FALSE
);

-- Cria a tabela de salvamento de dados de Amigos
CREATE TABLE amigos (
    id_amigo INT AUTO_INCREMENT PRIMARY KEY,
    nome VARCHAR(255),
    telefone VARCHAR(20)
);

-- Cria a tabela de salvamento de dados de Empréstimos
CREATE TABLE emprestimos (
    id_emprestimo INT AUTO_INCREMENT PRIMARY KEY,
    id_amigo INT,
    data_emprestimo DATE,
    data_devolucao DATE,
    status INT NOT NULL,
    FOREIGN KEY (id_ferramenta) REFERENCES ferramentas(id_ferramenta),
    FOREIGN KEY (id_amigo) REFERENCES amigos(id_amigo)
);

-- Cria a tabela de salvamento de dados de Ferramentas ja Emprestadas
CREATE TABLE ferramentas_emprestadas (
    id_emprestimo INT NOT NULL,
    id_ferramenta INT NOT NULL,
    FOREIGN KEY (id_emprestimo) REFERENCES emprestimos(id_emprestimo),
    FOREIGN KEY (id_ferramenta) REFERENCES ferramentas(id_ferramenta)
);

-- Usa a DataBase db_emprestimos
USE db_emprestimos;

-- Insere informações na tabela de Ferramentas
INSERT INTO ferramentas 
(nome, marca, custo_aquisicao, status) 
VALUES ('Serra', 'Makita', 499.99, 0), 
('Furadeira', 'Black in Becker', 456.50, 0);

-- Insere informações na tabela de Amigos
INSERT INTO amigos 
(nome, telefone) 
VALUES ('Eduardo', '(16) 9834-5562'),
 ('Maria', '(96) 9995-3220');

-- Insere informações na tabela de Empréstimos
 INSERT INTO emprestimos 
(id_amigo, data_emprestimo, data_devolucao, status)
 VALUES (1, '2024-06-10', '2024-06-23', 1), 
(2, '2024-06-15', '2024-07-15', 1); 

-- Insere informações na tabela de Ferramentas ja Emprestadas
INSERT INTO ferramentas_emprestadas 
(id_emprestimo, id_ferramenta) 
VALUES 
(1, 1), (2, 2);
