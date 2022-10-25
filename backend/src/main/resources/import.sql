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

-- SEED DAS BAIAS
INSERT INTO tb_stall(sector, farm_id) VALUES ('Norte', 1);
INSERT INTO tb_stall(sector, farm_id) VALUES ('Sul', 1);
INSERT INTO tb_stall(sector, farm_id) VALUES ('Leste', 1);
INSERT INTO tb_stall(sector, farm_id) VALUES ('Oeste', 1);
--
INSERT INTO tb_stall(sector, farm_id) VALUES ('Norte', 2);
INSERT INTO tb_stall(sector, farm_id) VALUES ('Sul', 2);
INSERT INTO tb_stall(sector, farm_id) VALUES ('Leste', 2);
INSERT INTO tb_stall(sector, farm_id) VALUES ('Oeste', 2);
--
INSERT INTO tb_stall(sector, farm_id) VALUES ('Norte', 3);
INSERT INTO tb_stall(sector, farm_id) VALUES ('Sul', 3);
INSERT INTO tb_stall(sector, farm_id) VALUES ('Leste', 3);
INSERT INTO tb_stall(sector, farm_id) VALUES ('Oeste', 3);
--
INSERT INTO tb_stall(sector, farm_id) VALUES ('Norte', 4);
INSERT INTO tb_stall(sector, farm_id) VALUES ('Sul', 4);
INSERT INTO tb_stall(sector, farm_id) VALUES ('Leste', 4);
INSERT INTO tb_stall(sector, farm_id) VALUES ('Oeste', 4);
--
INSERT INTO tb_stall(sector, farm_id) VALUES ('Norte', 5);
INSERT INTO tb_stall(sector, farm_id) VALUES ('Sul', 5);
INSERT INTO tb_stall(sector, farm_id) VALUES ('Leste', 5);
INSERT INTO tb_stall(sector, farm_id) VALUES ('Oeste', 5);


