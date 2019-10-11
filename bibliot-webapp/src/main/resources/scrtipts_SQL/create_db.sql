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
);

INSERT INTO T_WORK (W_ID, W_TITLE, W_AUTHOR, W_PUBLICATION_DATE, W_DESCRIPTION) VALUES

(1, 'Vacances dans le comas', 'Frederic Beigbeder', '1994-01-01 00:00:00', 'Roman'),
(2, '99 Francs', 'Frederic Beigbeder', '2000-01-01 00:00:00', 'Roman'),
(3, 'Windows on the world', 'Frederic Beigbeder', '2003-01-01 00:00:00', 'Roman'),
(4, 'Un roman francais', 'Frederic Beigbeder', '2009-01-01 00:00:00', 'Roman'),
(5, 'Une vie sans fin', 'Frederic Beigbeder', '2018-01-01 00:00:00', 'Roman'),
(6, 'Harry Potter et le coupe de feu', 'JK Rowling', '2000-01-01 00:00:00', 'Fantastique'),
(7, 'Harry Potter et lordre du phoenix', 'JK Rowling', '2003-01-01 00:00:00', 'Fantastique'),
(8, 'Harry Potter et les reliques de la mort', 'JK Rowling', '2009-01-01 00:00:00', 'Fantastique'),
(9, 'Insomnie', 'Stephen King', '1994-01-01 00:00:00', 'Fiction'),
(10, 'Sleaping Beauties', 'Stephen King', '2018-01-01 00:00:00', 'Fiction');


-- creation table user
create table T_USER(
U_ID SERIAL,
U_USERNAME VARCHAR(100) NOT NULL,
U_PASSWORD VARCHAR(50) NOT NULL,

PRIMARY KEY(U_ID) -- Définition de la clé primaire de la table
);

INSERT INTO T_USER (U_ID, U_USERNAME, U_PASSWORD) VALUES

(1, 'clement', 'CLEMENT'),
(2, 'serge', 'SERGE'),
(3, 'oscar', 'OSCAR');

-- creation table member
create table T_MEMBER(
M_NAME VARCHAR(50) NOT NULL,
M_MAIL VARCHAR(100) NOT NULL,

PRIMARY KEY(M_NAME) -- Définition de la clé primaire de la table // A VERIF
);

INSERT INTO T_MEMBER (M_NAME, M_MAIL) VALUES

('clement', 'clem.biotteau@gmail.com'),
('serge', 'serge.biotteau@gmail.com'),
('oscar', 'oscar.biotteau@gmail.com');

-- creation table library
create table T_LIBRARY(
L_ID SERIAL,
L_NAME VARCHAR(100) NOT NULL,
L_CITY VARCHAR(100) NOT NULL,

PRIMARY KEY(L_ID) -- Définition de la clé primaire de la table
);

-- creation table borrow
create table T_BORROW(
B_ID SERIAL,
B_STATUS VARCHAR(100) NOT NULL,
B_START_BORROW_DATE DATE NOT NULL,
B_END_BORROW_DATE DATE NOT NULL,
B_EXTENDED BOOLEAN NOT NULL,
B_WORK_TITLE VARCHAR(100) NOT NULL,

PRIMARY KEY(B_ID) -- Définition de la clé primaire de la table
);

-- creation table book
create table T_BOOK(
BOOK_ID SERIAL,
BOOK_AVAILABLE BOOLEAN NOT NULL,

 PRIMARY KEY(BOOK_ID) -- Définition de la clé primaire de la table
);

INSERT INTO T_BOOK (BOOK_ID, BOOK_AVAILABLE) VALUES
(1, b'0'),
(2, b'0'),
(3, b'0'),
(4, b'1'),
(5, b'1'),
(6, b'1'),
(7, b'0'),
(8, b'1'),
(9, b'1'),
(10, b'1');

