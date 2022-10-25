-- SEED DE NOVOS USUÁRIOS
INSERT INTO tb_user (name, email, password) VALUES ('Heinrich Ficker', 'hficker@gmail.com', '$2a$10$eACCYoNOHEqXve8aIWT8Nu3PkMXWBaOxJ9aORUYzfMQCbVBIhZ8tG');
INSERT INTO tb_user (name, email, password) VALUES ('Jacob Stoll', 'jstoll@gmail.com', '$2a$10$eACCYoNOHEqXve8aIWT8Nu3PkMXWBaOxJ9aORUYzfMQCbVBIhZ8tG');
INSERT INTO tb_user (name, email, password) VALUES ('Anna Müller', 'anamuller@gmail.com', '$2a$10$eACCYoNOHEqXve8aIWT8Nu3PkMXWBaOxJ9aORUYzfMQCbVBIhZ8tG');
-- SEED DE NOVOS ROLES
INSERT INTO tb_role (authority) VALUES ('ROLE_OPERATOR');
INSERT INTO tb_role (authority) VALUES ('ROLE_FARMER');
INSERT INTO tb_role (authority) VALUES ('ROLE_ADMIN');
-- SEED DO RELACIONAMENTO USER ROLE
INSERT INTO tb_user_role (user_id, role_id) VALUES (1, 1);
INSERT INTO tb_user_role (user_id, role_id) VALUES (2, 2);
INSERT INTO tb_user_role (user_id, role_id) VALUES (3, 3);
-- SEED DE NOVAS FAZENDAS
INSERT INTO tb_farm(name, city) VALUES ('Fazenda Nova Piratininga', 'São Miguel do Araguaia');
INSERT INTO tb_farm(name, city) VALUES ('Fazenda Roncador', 'Querência');
INSERT INTO tb_farm(name, city) VALUES ('Fazenda São Marcelo', 'Tangará da Serra');
INSERT INTO tb_farm(name, city) VALUES ('Fazenda Conforto', 'Nova Crixás');
INSERT INTO tb_farm(name, city) VALUES ('Fazenda São Francisco', 'Gama');

-- SEED DO RELACIONAMENTO USER FARM
INSERT INTO tb_user_farm (user_id, farm_id) VALUES (1, 1);
INSERT INTO tb_user_farm (user_id, farm_id) VALUES (1, 4);
INSERT INTO tb_user_farm (user_id, farm_id) VALUES (2, 2);
INSERT INTO tb_user_farm (user_id, farm_id) VALUES (2, 5);
INSERT INTO tb_user_farm (user_id, farm_id) VALUES (3, 3);
INSERT INTO tb_user_farm (user_id, farm_id) VALUES (3, 1);

