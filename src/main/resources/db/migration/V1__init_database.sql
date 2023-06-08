DROP TABLE IF EXISTS book;
DROP TABLE IF EXISTS book_seq;

CREATE TABLE book
(
    id        BIGINT NOT NULL,
    isbn      VARCHAR(255),
    publisher VARCHAR(255),
    title     VARCHAR(255),
    PRIMARY KEY (id)
) engine = InnoDB;

CREATE TABLE author
(
    id         BIGINT NOT NULL,
    first_name VARCHAR(255),
    last_name  VARCHAR(255),
    author_id  BIGINT,
    PRIMARY KEY (id)
) engine = InnoDB;

CREATE TABLE book_seq
(
    next_val BIGINT
) engine = InnoDB;

CREATE TABLE hibernate_seq
(
    next_val BIGINT
) engine = InnoDB;

INSERT INTO book_seq
VALUES (1);

INSERT INTO hibernate_seq
VALUES (1);