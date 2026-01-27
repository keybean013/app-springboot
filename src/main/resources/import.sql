

INSERT INTO roles (id, public_id, role_name, status, created_at, updated_at, deleted_at) VALUE (1, UUID(), "junior dev", "INVALID", NOW(), NOW(), Null);
INSERT INTO roles (id, public_id, role_name, status, created_at, updated_at, deleted_at) VALUE (2, UUID(), "admin", "INVALID", NOW(), NOW(), Null);
INSERT INTO roles (id, public_id, role_name, status, created_at, updated_at, deleted_at) VALUE (3, UUID(), "senior dev", "INVALID", NOW(), NOW(), Null);
INSERT INTO roles (id, public_id, role_name, status, created_at, updated_at, deleted_at) VALUE (4, UUID(), "team lead", "INVALID", NOW(), NOW(), Null);
INSERT INTO roles (id, public_id, role_name, status, created_at, updated_at, deleted_at) VALUE (5, UUID(), "manager", "INVALID", NOW(), NOW(), Null);


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
-- USERS DATA (TABLE: users) null,
-- ================================

INSERT INTO users (id, public_id, role_id, username, password, first_name, last_name, contact_no, address, email, is_active, session_key, created_at, updated_at, deleted_at) VALUES (1, UUID(), 1, 'username1', 'password1', 'samplename1', 'lastname1', '09234123412', '10. p zamora st. sta. lucia novaliches qc', 'sample11@gmail.com', false, null, NOW(), NOW(), null);

INSERT INTO users (id, public_id, role_id, username, password, first_name, last_name, contact_no, address, email, is_active, session_key, created_at, updated_at, deleted_at) VALUES (2, UUID(), 2, 'username2', 'password12', 'samplename12', 'lastname12', '09231423123', '10. p zamora st. sta. lucia novaliches qc', 'sample12@gmail.com', false, null, NOW(), NOW(), null);

INSERT INTO users (id, public_id, role_id, username, password, first_name, last_name, contact_no, address, email, is_active, session_key, created_at, updated_at, deleted_at) VALUES (3, UUID(), 3, 'username3', 'password13', 'samplename13', 'lastname13', '02-412134', '10. p zamora st. sta. lucia novaliches qc', 'sample13@gmail.com', true, null, NOW(), NOW(), null);

INSERT INTO users (id, public_id, role_id, username, password, first_name, last_name, contact_no, address, email, is_active, session_key, created_at, updated_at, deleted_at) VALUES (4, UUID(), 4, 'username4', 'password14', 'samplename14', 'lastname14', '09123245621', '10. p zamora st. sta. lucia novaliches qc', 'sample14@gmail.com', false, null, NOW(), NOW(), null);

INSERT INTO users (id, public_id, role_id, username, password, first_name, last_name, contact_no, address, email, is_active, session_key, created_at, updated_at, deleted_at) VALUES (5, UUID(), 5, 'username5', 'password15', 'samplename15', 'lastname15', '02-421322', '10. p zamora st. sta. lucia novaliches qc', 'sample15@gmail.com', true, null, NOW(), NOW(), null);
