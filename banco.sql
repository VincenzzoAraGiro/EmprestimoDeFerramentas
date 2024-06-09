USE db_emprestimos;

CREATE TABLE IF NOT EXISTS ferramentas (
    id_ferramenta INT AUTO_INCREMENT PRIMARY KEY,
    nome VARCHAR(255),
    marca VARCHAR(255),
    custo_aquisicao DECIMAL(10, 2),
    INDEX(nome),
    status BOOLEAN NOT NULL DEFAULT FALSE
);

CREATE TABLE IF NOT EXISTS amigos (
    id_amigo INT AUTO_INCREMENT PRIMARY KEY,
    nome VARCHAR(255) NOT NULL,
    telefone VARCHAR(20),
    INDEX(nome)
);

CREATE TABLE IF NOT EXISTS emprestimos (
    id_emprestimo INT AUTO_INCREMENT PRIMARY KEY,
	nome_amigo VARCHAR(255) NOT NULL,
    nome_ferramenta VARCHAR(255) NOT NULL,
    data_emprestimo DATE,
    data_devolucao DATE,
    status BOOLEAN NOT NULL DEFAULT FALSE,
    FOREIGN KEY (nome_amigo) REFERENCES amigos(nome),
    FOREIGN KEY (nome_ferramenta) REFERENCES ferramentas(nome)
);

CREATE TABLE ferramentas_emprestadas (
    id_emprestimo INT NOT NULL,
    id_ferramenta INT NOT NULL,
    FOREIGN KEY (id_emprestimo) REFERENCES emprestimos(id_emprestimo),
    FOREIGN KEY (id_ferramenta) REFERENCES ferramentas(id_ferramenta)
);