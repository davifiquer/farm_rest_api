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
INSERT INTO tb_stall(sector, farm_id) VALUES ('Norte', 5);
INSERT INTO tb_stall(sector, farm_id) VALUES ('Sul', 5);
INSERT INTO tb_stall(sector, farm_id) VALUES ('Leste', 5);
INSERT INTO tb_stall(sector, farm_id) VALUES ('Oeste', 5);
INSERT INTO tb_stall(sector, farm_id) VALUES ('Norte', 5);
INSERT INTO tb_stall(sector, farm_id) VALUES ('Sul', 5);
-- SEED DOS BOVINOS
INSERT INTO tb_cattle(identifier, weight, breed, daily_milk_prod, user_id, farm_id, stall_id) VALUES ('SF20220101', 25.1, 'Nelore', 5.1, 2, 5, 17);
INSERT INTO tb_cattle(identifier, weight, breed, daily_milk_prod, user_id, farm_id, stall_id) VALUES ('SF20220102', 25.0, 'Nelore', 6.7, 2, 5, 18);
INSERT INTO tb_cattle(identifier, weight, breed, daily_milk_prod, user_id, farm_id, stall_id) VALUES ('SF20220103', 24.2, 'Nelore', 0.0, 2, 5, 19);
INSERT INTO tb_cattle(identifier, weight, breed, daily_milk_prod, user_id, farm_id, stall_id) VALUES ('SF20220104', 25.7, 'Nelore', 0.0, 2, 5, 20);
INSERT INTO tb_cattle(identifier, weight, breed, daily_milk_prod, user_id, farm_id, stall_id) VALUES ('SF20220105', 25.9, 'Nelore', 0.0, 2, 5, 21);
INSERT INTO tb_cattle(identifier, weight, breed, daily_milk_prod, user_id, farm_id, stall_id) VALUES ('SF20220106', 22.3, 'Guzerá', 7.0, 2, 5, 22);
INSERT INTO tb_cattle(identifier, weight, breed, daily_milk_prod, user_id, farm_id, stall_id) VALUES ('SF20220107', 24.7, 'Guzerá', 6.5, 2, 5, 23);
INSERT INTO tb_cattle(identifier, weight, breed, daily_milk_prod, user_id, farm_id, stall_id) VALUES ('SF20220108', 26.1, 'Guzerá', 7.7, 2, 5, 24);
INSERT INTO tb_cattle(identifier, weight, breed, daily_milk_prod, user_id, farm_id, stall_id) VALUES ('SF20220109', 27.0, 'Guzerá', 4.5, 2, 5, 25);
INSERT INTO tb_cattle(identifier, weight, breed, daily_milk_prod, user_id, farm_id, stall_id) VALUES ('SF20220110', 23.8, 'Guzerá', 5.5, 2, 5, 26);
-- SEED DAS VACINAS
INSERT INTO tb_vaccine(date, name, cattle_id) VALUES (TIMESTAMP WITH TIME ZONE '2022-10-20T03:00:00Z', 'Febre Aftosa', 1);
INSERT INTO tb_vaccine(date, name, cattle_id) VALUES (TIMESTAMP WITH TIME ZONE '2022-10-20T03:00:00Z', 'Febre Aftosa', 2);
INSERT INTO tb_vaccine(date, name, cattle_id) VALUES (TIMESTAMP WITH TIME ZONE '2022-10-20T03:00:00Z', 'Febre Aftosa', 3);
INSERT INTO tb_vaccine(date, name, cattle_id) VALUES (TIMESTAMP WITH TIME ZONE '2022-10-20T03:00:00Z', 'Febre Aftosa', 4);
INSERT INTO tb_vaccine(date, name, cattle_id) VALUES (TIMESTAMP WITH TIME ZONE '2022-10-20T03:00:00Z', 'Febre Aftosa', 5);
INSERT INTO tb_vaccine(date, name, cattle_id) VALUES (TIMESTAMP WITH TIME ZONE '2022-10-20T03:00:00Z', 'Raiva bovina', 6);
INSERT INTO tb_vaccine(date, name, cattle_id) VALUES (TIMESTAMP WITH TIME ZONE '2022-10-20T03:00:00Z', 'Raiva bovina', 7);
INSERT INTO tb_vaccine(date, name, cattle_id) VALUES (TIMESTAMP WITH TIME ZONE '2022-10-20T03:00:00Z', 'Raiva bovina', 8);
INSERT INTO tb_vaccine(date, name, cattle_id) VALUES (TIMESTAMP WITH TIME ZONE '2022-10-20T03:00:00Z', 'Raiva bovina', 9);
INSERT INTO tb_vaccine(date, name, cattle_id) VALUES (TIMESTAMP WITH TIME ZONE '2022-10-20T03:00:00Z', 'Raiva bovina', 10);






































