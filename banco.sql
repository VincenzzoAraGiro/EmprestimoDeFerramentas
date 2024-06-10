USE db_emprestimos;

INSERT INTO ferramentas 
(nome, marca, custo_aquisicao, status) 
VALUES ('Serra', 'Makita', 499.99, 0), 
('Furadeira', 'Black in Becker', 456.50, 0);

INSERT INTO amigos 
(nome, telefone) 
VALUES ('Eduardo', '(16) 9834-5562'),
 ('Maria', '(96) 9995-3220');

 INSERT INTO emprestimos 
(id_amigo, data_emprestimo, data_devolucao, status)
 VALUES (1, '2024-06-10', '2024-06-23', 1), 
(2, '2024-06-15', '2024-07-15', 1); 

INSERT INTO ferramentas_emprestadas 
(id_emprestimo, id_ferramenta) 
VALUES 
(1, 1), (2, 2);