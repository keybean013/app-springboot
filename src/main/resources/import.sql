INSERT INTO role (id, created, role_name, status, updated) VALUE (1, "nov 6", "developer", "valid", "nov 6");
INSERT INTO role (id, created, role_name, status, updated) VALUE (2, "nov 6", "staff", "valid", "nov 6");
INSERT INTO role (id, created, role_name, status, updated) VALUE (3, "nov 6", "developer", "valid", "nov 6");
INSERT INTO role (id, created, role_name, status, updated) VALUE (4, "nov 6", "staff", "valid", "nov 6");
INSERT INTO role (id, created, role_name, status, updated) VALUE (5, "nov 6", "staff", "valid", "nov 6");


INSERT INTO user (id, role_id,  username, password, first_name, last_name, email, session_key, is_active) VALUE (1, 1, "username1", "password1", "samplename1", "lastname1", "sample@gmail.com", NULL, true);
INSERT INTO user (id, role_id,  username, password, first_name, last_name, email, session_key, is_active) VALUE (2, 2, "username2", "password12", "samplename12", "lastname12", "sample@gmail.com", NULL, true);
INSERT INTO user (id, role_id,  username, password, first_name, last_name, email, session_key, is_active) VALUE (3, 3, "username3", "password13", "samplename13", "lastname13", "sample@gmail.com", NULL, true);
INSERT INTO user (id, role_id,  username, password, first_name, last_name, email, session_key, is_active) VALUE (4, 4, "username4", "password14", "samplename14", "lastname14", "sample@gmail.com", NULL, true);
INSERT INTO user (id, role_id, username, password, first_name, last_name, email, session_key, is_active) VALUE (5, 5, "username5", "password15", "samplename15", "lastname15", "sample@gmail.com", NULL, true);
INSERT INTO user (id, role_id, username, password, first_name, last_name, email, session_key, is_active) VALUE (6, 1, "username6", "password16", "samplename16", "lastname16", "sample@gmail.com", NULL, true);
INSERT INTO user (id, role_id,  username, password, first_name, last_name, email, session_key, is_active) VALUE (7, 2, "username7", "password17", "samplename18", "lastname17", "sample@gmail.com", NULL, true);
INSERT INTO user (id, role_id, username, password, first_name, last_name, email, session_key, is_active) VALUE (8, 3, "username8", "password18", "samplename19", "lastname18", "sample@gmail.com", NULL, true);
INSERT INTO user (id, role_id, username, password, first_name, last_name, email, session_key, is_active) VALUE (9, 4, "username9", "password19", "samplename10", "lastname19", "sample@gmail.com", NULL, true);
INSERT INTO user (id, role_id, username, password, first_name, last_name, email, session_key, is_active) VALUE (10, 5, "username10", "password10", "samplename11", "lastname10", "sample@gmail.com", NULL, true);
INSERT INTO user (id, role_id, username, password, first_name, last_name, email, session_key, is_active) VALUE (11, 2, "username11", "password11", "samplename12", "lastname11", "sample@gmail.com", NULL, true);
