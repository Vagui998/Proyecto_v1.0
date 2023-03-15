drop table if exists tool_city;
drop table if exists city;
drop table if exists tool;
drop table if exists brand;
drop table if exists user;
drop table if exists account_permission;
drop table if exists permission;
drop table if exists account_type;

CREATE TABLE account_type (
    id INT PRIMARY KEY AUTO_INCREMENT,
    name VARCHAR(64) NOT NULL
);

CREATE TABLE permission (
    id INT PRIMARY KEY AUTO_INCREMENT,
    name VARCHAR(64) NOT NULL
);

CREATE TABLE account_permission (
    account_type_id INT,
    permission_id INT,
    PRIMARY KEY (account_type_id, permission_id),
    FOREIGN KEY (account_type_id) REFERENCES account_type(id),
    FOREIGN KEY (permission_id) REFERENCES permission(id)
);

CREATE TABLE user (
    id INT PRIMARY KEY AUTO_INCREMENT,
    name VARCHAR(64) NOT NULL,
    pass VARCHAR(32) NOT NULL,
    acc_type_id INT NOT NULL,
    FOREIGN KEY (acc_type_id) REFERENCES account_type(id)
);

CREATE TABLE brand (
    id INT PRIMARY KEY AUTO_INCREMENT,
    name VARCHAR(200) NOT NULL,
    image_url VARCHAR(500)
);




CREATE TABLE tool (
    id INT PRIMARY KEY AUTO_INCREMENT,
    name VARCHAR(200) NOT NULL,
    description VARCHAR(3000),
    image_url VARCHAR(500),
    marca_id INT,
    precio DOUBLE(10,2),
    FOREIGN KEY (marca_id) REFERENCES brand(id)
);



CREATE TABLE city (
    id INT PRIMARY KEY AUTO_INCREMENT,
    name VARCHAR(200) NOT NULL
);



CREATE TABLE tool_city (
    tool_id INT,
    city_id INT,
    cantidad INT,
    PRIMARY KEY (tool_id, city_id),
    FOREIGN KEY (tool_id) REFERENCES tool(id),
    FOREIGN KEY (city_id) REFERENCES city(id)
);


INSERT INTO account_type (name) 
VALUES
    ('SuperAdmin'),
    ('Admin'),
    ('User');

INSERT INTO permission (name)
VALUES
    ('create'),
    ('read'),
    ('update'),
    ('delete');

INSERT INTO account_permission(account_type_id, permission_id)
VALUES
    (1,1),
    (1,2),
    (1,3),
    (1,4),
    (2,1),
    (2,2),
    (3,2);

INSERT INTO user (name, pass, acc_type_id)
VALUES
    ('TopAdmin', '1234', 1),
    ('LowAdmin', '5678', 2),
    ('EndUser', '9012', 3);


INSERT INTO brand (name, image_url) 
VALUES
  ('DeWalt', 'http://testimg.com/dewalt.png'),
  ('Caterpillar', 'http://img.com/Caterpillar.jpg'),
  ('Makita', 'http://img.com/Makita.jpg');

INSERT INTO tool (id, name, description, image_url, marca_id, precio) 
VALUES
    (1, 'Llave Inglesa', 'Llave universal ajustable', 'http://www.testImage.com/12345', 1, 9.67),
    (2, 'Martillo L', 'Martillo tamaño industrial', 'http://www.testImage.com/54321', 2, 19.89),
    (3, 'Destornillador', 'Destornillador Estrella Universal', 'http://www.testImage.com/15', 3, 29.91);

INSERT INTO city (name) 
VALUES
  ('Cali'),
  ('Medellin'),
  ('Bogota');

INSERT INTO tool_city (tool_id, city_id, cantidad) 
VALUES
  (1, 1, 10),
  (1, 2, 5),
  (2, 1, 3),
  (2, 3, 8),
  (3, 2, 12),
  (3, 3, 6);



