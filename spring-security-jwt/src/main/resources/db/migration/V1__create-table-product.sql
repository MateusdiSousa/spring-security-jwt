CREATE TABLE product(
    id VARCHAR(36) PRIMARY KEY UNIQUE NOT NULL,
    name VARCHAR(50),
    stock INT,
    price DECIMAL(8,2)
);