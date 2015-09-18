CREATE TABLE employees (
     id serial PRIMARY KEY,
     name VARCHAR(255) NOT NULL,
     position VARCHAR(255),
     department VARCHAR(255) NOT NULL,
     email VARCHAR(255),
     age INT,
);