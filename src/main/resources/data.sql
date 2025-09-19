-- Insertar marcas sin duplicados
INSERT IGNORE INTO users (username, password, name, last_name, email, telephone)
VALUES ('saul', '123456', 'Saul', 'Esquivel', 'saul@test.com', 987654321);

INSERT IGNORE INTO users (username, password, name, last_name, email, telephone)
VALUES ('maria', 'abc123', 'Maria', 'Lopez', 'maria@test.com', 912345678);

INSERT IGNORE INTO users (username, password, name, last_name, email, telephone)
VALUES ('carlos', 'pass2025', 'Carlos', 'Ramirez', 'carlos@test.com', 998877665);

INSERT IGNORE INTO users (username, password, name, last_name, email, telephone)
VALUES ('ana', 'qwerty', 'Ana', 'Martinez', 'ana@test.com', 911223344);

INSERT IGNORE INTO users (username, password, name, last_name, email, telephone)
VALUES ('jose', 'secret', 'Jose', 'Perez', 'jose@test.com', 900112233);
