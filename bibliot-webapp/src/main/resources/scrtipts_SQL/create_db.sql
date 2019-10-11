drop database if exists bibliot;
drop role if exists bibliot;
-- create the requested bibliot user

create user bibliot createdb createuser password 'admin';

-- create a bibliot database
create database bibliot owner bibliot;

-- creation table work
create table T_WORK(
W_ID SERIAL,
W_TITLE VARCHAR(100) NOT NULL,
W_AUTHOR VARCHAR(50) NOT NULL,
W_PUBLICATION_DATE DATE NOT NULL,
W_DESCRIPTION VARCHAR(255) NOT NULL,

PRIMARY KEY(W_ID) -- Définition de la clé primaire de la table
)

