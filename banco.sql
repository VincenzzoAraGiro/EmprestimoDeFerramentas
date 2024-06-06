CREATE DATABASE IF NOT EXISTS db_emprestimos;

USE db_emprestimos;

# Cria a tabela Amigo.
  
CREATE TABLE Amigo (
    id_amigo INT AUTO_INCREMENT PRIMARY KEY,
    nome VARCHAR(100),
    telefone VARCHAR(20)
);

# Cria a tabela Ferramenta.
  
CREATE TABLE Ferramenta (
    id_ferramenta INT AUTO_INCREMENT PRIMARY KEY,
    nome VARCHAR(100),
    marca VARCHAR(100),
    custo_aquisicao DECIMAL(10, 2)
);

# Cria a tabela de Empréstimos.

CREATE TABLE Emprestimo (
    id_emprestimo INT AUTO_INCREMENT PRIMARY KEY,
    id_amigo INT,
    id_ferramenta INT,
    data_emprestimo DATE,
    data_devolucao DATE,
    FOREIGN KEY (id_amigo) REFERENCES Amigo(id_amigo),
    FOREIGN KEY (id_ferramenta) REFERENCES Ferramenta(id_ferramenta)
);

# Cria a tabela de Ferramentas que ja foram emprestadas.

CREATE TABLE ferramenta_emprestadas (
    id_emprestimo INT NOT NULL,
    id_ferramenta INT NOT NULL,
    FOREIGN KEY (id_emprestimo) REFERENCES emprestimo(id_emprestimo),
    FOREIGN KEY (id_ferramenta) REFERENCES ferramenta(id_ferramenta)
);
