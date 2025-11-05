INSERT INTO role (id, created, role_name, status, updated) VALUES (1,'Nov 04, 2025', 'manager', 'deleted', 'Nov 04, 2025');
INSERT INTO role (id, created, role_name, status, updated) VALUES (2,'Nov 04, 2025', 'manager', 'invalid', 'Nov 04, 2025');
INSERT INTO role (id, created, role_name, status, updated) VALUES (3,'Nov 04, 2025', 'developer', 'invalid', 'Nov 04, 2025');
INSERT INTO role (id, created, role_name, status, updated) VALUES (4,'Nov 04, 2025', 'senior developer', 'active', 'Nov 04, 2025');
INSERT INTO role (id, created, role_name, status, updated) VALUES (5,'Nov 04, 2025', 'team leader', 'lock', 'Nov 04, 2025');
INSERT INTO role (id, created, role_name, status, updated) VALUES (6,'Nov 04, 2025', 'manager', 'active', 'Nov 04, 2025');
INSERT INTO role (id, created, role_name, status, updated) VALUES (7,'Nov 04, 2025', 'junior developer', 'active', 'Nov 04, 2025');
INSERT INTO role (id, created, role_name, status, updated) VALUES (8,'Nov 04, 2025', 'junior developer', 'active', 'Nov 04, 2025');
INSERT INTO role (id, created, role_name, status, updated) VALUES (9,'Nov 04, 2025', 'data analyst', 'active', 'Nov 04, 2025');
INSERT INTO role (id, created, role_name, status, updated) VALUES (10,'Nov 04, 2025', 'assistant accountant', 'deleted', 'Nov 04, 2025');


INSERT INTO user (id, role_id, is_active, password, username, session_key) VALUES (1, 1, true, '$2a$10$hd7eH5mhzk4M2IR5fyOEe.LWvAi7SskPfRylAJJ6AL/PhrrKfcuTm', 'solutionsresource1', NULL);
INSERT INTO user (id, role_id, is_active, password, username, session_key) VALUES (2, 10, true, '$2a$10$hd7eH5mhzk4M2IR5fyOEe.LWvAi7SskPfRylAJJ6AL/PhrrKfcuTm', 'solutionsresource2', NULL);
INSERT INTO user (id, role_id, is_active, password, username, session_key) VALUES (3, 3, true, '$2a$10$hd7eH5mhzk4M2IR5fyOEe.LWvAi7SskPfRylAJJ6AL/PhrrKfcuTm', 'solutionsresource3', NULL);
INSERT INTO user (id, role_id, is_active, password, username, session_key) VALUES (4, 8, true, '$2a$10$hd7eH5mhzk4M2IR5fyOEe.LWvAi7SskPfRylAJJ6AL/PhrrKfcuTm', 'solutionsresource4', NULL);
INSERT INTO user (id, role_id, is_active, password, username, session_key) VALUES (5, 2, true, '$2a$10$hd7eH5mhzk4M2IR5fyOEe.LWvAi7SskPfRylAJJ6AL/PhrrKfcuTm', 'solutionsresource5', NULL);
INSERT INTO user (id, role_id, is_active, password, username, session_key) VALUES (6, 7, true, '$2a$10$hd7eH5mhzk4M2IR5fyOEe.LWvAi7SskPfRylAJJ6AL/PhrrKfcuTm', 'solutionsresource6', NULL);
INSERT INTO user (id, role_id, is_active, password, username, session_key) VALUES (7, 5, true, '$2a$10$hd7eH5mhzk4M2IR5fyOEe.LWvAi7SskPfRylAJJ6AL/PhrrKfcuTm', 'solutionsresource7', NULL);
INSERT INTO user (id, role_id, is_active, password, username, session_key) VALUES (8, 3, true, '$2a$10$hd7eH5mhzk4M2IR5fyOEe.LWvAi7SskPfRylAJJ6AL/PhrrKfcuTm', 'solutionsresource8', NULL);
INSERT INTO user (id, role_id, is_active, password, username, session_key) VALUES (9, 2, true, '$2a$10$hd7eH5mhzk4M2IR5fyOEe.LWvAi7SskPfRylAJJ6AL/PhrrKfcuTm', 'solutionsresource9', NULL);
INSERT INTO user (id, role_id, is_active, password, username, session_key) VALUES (10,3,false, '$2a$10$hd7eH5mhzk4M2IR5fyOEe.LWvAi7SskPfRylAJJ6AL/PhrrKfcuTm', 'solutionsresource10', NULL);




