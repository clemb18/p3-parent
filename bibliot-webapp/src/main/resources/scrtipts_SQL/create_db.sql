drop database if exists bibliot;
drop role if exists bibliot;
-- create the requested bibliot user

create user bibliot createdb createuser password 'admin';

-- create a bibliot database
create database bibliot owner bibliot;

-- creation table work
create table T_WORK
(
    W_ID               SERIAL,
    W_TITLE            VARCHAR(100) NOT NULL,
    W_AUTHOR           VARCHAR(50)  NOT NULL,
    W_PUBLICATION_DATE DATE         NOT NULL,
    W_DESCRIPTION      VARCHAR(255) NOT NULL,
    PRIMARY KEY (W_ID) -- Définition de la clé primaire de la table
);

INSERT INTO T_WORK (W_TITLE, W_AUTHOR, W_PUBLICATION_DATE, W_DESCRIPTION)
VALUES ('Vacances dans le comas', 'Frederic Beigbeder', '1994-01-01 00:00:00', 'Roman'),
       ('99 Francs', 'Frederic Beigbeder', '2000-01-01 00:00:00', 'Roman'),
       ('Windows on the world', 'Frederic Beigbeder', '2003-01-01 00:00:00', 'Roman'),
       ('Un roman francais', 'Frederic Beigbeder', '2009-01-01 00:00:00', 'Roman'),
       ('Une vie sans fin', 'Frederic Beigbeder', '2018-01-01 00:00:00', 'Roman'),
       ('Harry Potter et le coupe de feu', 'JK Rowling', '2000-01-01 00:00:00', 'Fantastique'),
       ('Harry Potter et lordre du phoenix', 'JK Rowling', '2003-01-01 00:00:00', 'Fantastique'),
       ('Harry Potter et les reliques de la mort', 'JK Rowling', '2009-01-01 00:00:00', 'Fantastique'),
       ('Insomnie', 'Stephen King', '1994-01-01 00:00:00', 'Fiction'),
       ('Sleaping Beauties', 'Stephen King', '2018-01-01 00:00:00', 'Fiction');


-- creation table user
create table T_USER
(
    U_ID       SERIAL,
    U_USERNAME VARCHAR(100) NOT NULL,
    U_PASSWORD VARCHAR(50)  NOT NULL,
    U_NAME VARCHAR(100) NOT NULL,
    U_FIRST_NAME VARCHAR(100)  NOT NULL,
    PRIMARY KEY (U_ID) -- Définition de la clé primaire de la table
);

INSERT INTO T_USER (U_USERNAME, U_PASSWORD, U_NAME, U_FIRST_NAME)
VALUES ('clement', 'CLEMENT', 'clement', 'biotteau'),
       ('serge', 'SERGE', 'serge', 'biotteau'),
       ('oscar', 'OSCAR','oscar', 'biotteau');

-- creation table member
create table T_MEMBER
(
    M_NAME VARCHAR(50)  NOT NULL,
    M_MAIL VARCHAR(100) NOT NULL,
    PRIMARY KEY (M_NAME, M_MAIL) -- Définition de la clé primaire de la table
);

INSERT INTO T_MEMBER (M_NAME, M_MAIL)
VALUES ('clement', 'clem.biotteau@gmail.com'),
       ('serge', 'serge.biotteau@gmail.com'),
       ('oscar', 'oscar.biotteau@gmail.com');

-- creation table library
create table T_LIBRARY
(
    L_ID   SERIAL,
    L_NAME VARCHAR(100) NOT NULL,
    L_CITY VARCHAR(100) NOT NULL,
    PRIMARY KEY (L_ID) -- Définition de la clé primaire de la table
);

-- creation table borrow
create table T_BORROW
(
    B_ID                SERIAL,
    B_STATUS            VARCHAR(100) NOT NULL,
    B_START_BORROW_DATE DATE         NOT NULL,
    B_END_BORROW_DATE   DATE         NOT NULL,
    B_EXTENDED          BOOLEAN      NOT NULL,
    B_WORK_TITLE        VARCHAR(100) NOT NULL,
    PRIMARY KEY (B_ID) -- Définition de la clé primaire de la table
);

-- creation table book
create table T_BOOK
(
    BOOK_ID        SERIAL,
    BOOK_AVAILABLE BOOLEAN NOT NULL,

    PRIMARY KEY (BOOK_ID) -- Définition de la clé primaire de la table
);

INSERT INTO T_BOOK (BOOK_AVAILABLE)
VALUES ('false'),
       ('false'),
       ('false'),
       ('false'),
       ('true'),
       ('true'),
       ('true'),
       ('true'),
       ('true'),
       ('true');

-- creation table work_book
create table T_WORK_BOOK
(
    BOOK_ID        SERIAL,
    

    PRIMARY KEY (BOOK_ID) -- Définition de la clé primaire de la table
);

INSERT INTO T_BOOK (BOOK_AVAILABLE)
VALUES ('false'),
       ('false'),
       ('false'),
       ('false'),
       ('true'),
       ('true'),
       ('true'),
       ('true'),
       ('true'),
       ('true');


