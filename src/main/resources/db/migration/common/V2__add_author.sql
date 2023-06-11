DROP TABLE IF EXISTS author;
DROP TABLE IF EXISTS author_seq;

CREATE TABLE author
(
    id         BIGINT NOT NULL,
    first_name VARCHAR(255),
    last_name  VARCHAR(255),
    author_id  BIGINT,
    PRIMARY KEY (id)
) engine = InnoDB;

CREATE TABLE author_seq
(
    next_val BIGINT
) engine = InnoDB;

INSERT INTO author_seq
VALUES (1);