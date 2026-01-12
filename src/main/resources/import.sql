INSERT INTO roles (id, role_name, status, created_at, updated_at, deleted_at) VALUE (1, "junior dev", "invalid", NOW(), NOW(), Null);
INSERT INTO roles (id, role_name, status, created_at, updated_at, deleted_at) VALUE (2, "admin", "invalid", NOW(), NOW(), Null);
INSERT INTO roles (id, role_name, status, created_at, updated_at, deleted_at) VALUE (3, "senior dev", "invalid", NOW(), NOW(), Null);
INSERT INTO roles (id, role_name, status, created_at, updated_at, deleted_at) VALUE (4, "team lead", "invalid", NOW(), NOW(), Null);
INSERT INTO roles (id, role_name, status, created_at, updated_at, deleted_at) VALUE (5, "manager", "invalid", NOW(), NOW(), Null);


-- INSERT INTO user (id, role_id,  username, password, first_name, last_name, email, session_key, is_active) VALUE (1, 1, "username1", "password1", "samplename1", "lastname1", "sample@gmail.com", NULL, true);
-- INSERT INTO user (id, role_id,  username, password, first_name, last_name, email, session_key, is_active) VALUE (2, 2, "username2", "password12", "samplename12", "lastname12", "sample@gmail.com", NULL, true);
-- INSERT INTO user (id, role_id,  username, password, first_name, last_name, email, session_key, is_active) VALUE (3, 3, "username3", "password13", "samplename13", "lastname13", "sample@gmail.com", NULL, true);
-- INSERT INTO user (id, role_id,  username, password, first_name, last_name, email, session_key, is_active) VALUE (4, 4, "username4", "password14", "samplename14", "lastname14", "sample@gmail.com", NULL, true);
-- INSERT INTO user (id, role_id, username, password, first_name, last_name, email, session_key, is_active) VALUE (5, 5, "username5", "password15", "samplename15", "lastname15", "sample@gmail.com", NULL, true);
-- INSERT INTO user (id, role_id, username, password, first_name, last_name, email, session_key, is_active) VALUE (6, 1, "username6", "password16", "samplename16", "lastname16", "sample@gmail.com", NULL, true);
-- INSERT INTO user (id, role_id,  username, password, first_name, last_name, email, session_key, is_active) VALUE (7, 2, "username7", "password17", "samplename18", "lastname17", "sample@gmail.com", NULL, true);
-- INSERT INTO user (id, role_id, username, password, first_name, last_name, email, session_key, is_active) VALUE (8, 3, "username8", "password18", "samplename19", "lastname18", "sample@gmail.com", NULL, true);
-- INSERT INTO user (id, role_id, username, password, first_name, last_name, email, session_key, is_active) VALUE (9, 4, "username9", "password19", "samplename10", "lastname19", "sample@gmail.com", NULL, true);
-- INSERT INTO user (id, role_id, username, password, first_name, last_name, email, session_key, is_active) VALUE (10, 5, "username10", "password10", "samplename11", "lastname10", "sample@gmail.com", NULL, true);
-- INSERT INTO user (id, role_id, username, password, first_name, last_name, email, session_key, is_active) VALUE (11, 2, "username11", "password11", "samplename12", "lastname11", "sample@gmail.com", NULL, true);


-- ================================
-- USERS DATA (TABLE: users)
-- ================================

INSERT INTO users (id, role_id, username, password, first_name, last_name, contact_no, address, email, is_active, created_at, updated_at, deleted_at) VALUES (1, 1, 'username1', 'password1', 'samplename1', 'lastname1', '09234123412', '10. p zamora st. sta. lucia novaliches qc', 'sample11@gmail.com', false, NOW(), NOW(), null);

INSERT INTO users (id, role_id, username, password, first_name, last_name, contact_no, address, email, is_active, created_at, updated_at, deleted_at) VALUES (2, 2, 'username2', 'password12', 'samplename12', 'lastname12', '09231423123', '10. p zamora st. sta. lucia novaliches qc', 'sample12@gmail.com', false, NOW(), NOW(), null);

INSERT INTO users (id, role_id, username, password, first_name, last_name, contact_no, address, email, is_active, created_at, updated_at, deleted_at) VALUES (3, 3, 'username3', 'password13', 'samplename13', 'lastname13', '02-412134', '10. p zamora st. sta. lucia novaliches qc', 'sample13@gmail.com', true, NOW(), NOW(), null);

INSERT INTO users (id, role_id, username, password, first_name, last_name, contact_no, address, email, is_active, created_at, updated_at, deleted_at) VALUES (4, 4, 'username4', 'password14', 'samplename14', 'lastname14', '09123245621', '10. p zamora st. sta. lucia novaliches qc', 'sample14@gmail.com', false, NOW(), NOW(), null);

INSERT INTO users (id, role_id, username, password, first_name, last_name, contact_no, address, email, is_active, created_at, updated_at, deleted_at) VALUES (5, 5, 'username5', 'password15', 'samplename15', 'lastname15', '02-421322', '10. p zamora st. sta. lucia novaliches qc', 'sample15@gmail.com', true, NOW(), NOW(), null);
