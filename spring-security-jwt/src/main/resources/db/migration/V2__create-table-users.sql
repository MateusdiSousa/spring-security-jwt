CREATE TABLE users (
    id VARCHAR(36) PRIMARY KEY UNIQUE NOT NULL,
    email VARCHAR(200) UNIQUE NOT NULL,
    password VARCHAR(36) NOT NULL,
    role VARCHAR(5) NOT NULL
);