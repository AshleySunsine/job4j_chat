CREATE TABLE IF NOT EXISTS message
(
    id SERIAL,
    content character varying(255) COLLATE pg_catalog."default",
    room_id integer NOT NULL,
    "timestamp" timestamp without time zone,
    sender_id integer,
    CONSTRAINT message_pkey PRIMARY KEY (id)
);

CREATE TABLE IF NOT EXISTS person
(
    id serial,
    login character varying(255) COLLATE pg_catalog."default",
    password character varying(255) COLLATE pg_catalog."default",
    person_name character varying(255) COLLATE pg_catalog."default",
    CONSTRAINT person_pkey PRIMARY KEY (id)
);

CREATE TABLE IF NOT EXISTS role
(
    id serial,
    role character varying(255) COLLATE pg_catalog."default",
    CONSTRAINT role_pkey PRIMARY KEY (id)
);

CREATE TABLE IF NOT EXISTS room
(
    id serial,
    creator_id integer NOT NULL,
    theme_of_room character varying(255) COLLATE pg_catalog."default",
    CONSTRAINT room_pkey PRIMARY KEY (id)
);

CREATE TABLE IF NOT EXISTS room_participants
(
    room_id integer NOT NULL,
    participants_id integer NOT NULL
);

