CREATE TABLE user(
    id BIGINT PRIMARY KEY AUTO_INCREMENT,
    username VARCHAR(20) NOT NULL unique,
    password VARCHAR(255) NOT NULL,
    email VARCHAR(255) NOT NULL unique,
    phone VARCHAR(20) NOT NULL,
);
