CREATE SCHEMA IF NOT EXISTS material_sch AUTHORIZATION aidsys_user;

CREATE TABLE IF NOT EXISTS material_sch.materials
(
    id           uuid PRIMARY KEY NOT NULL,
    category     varchar(50)      NOT NULL,
    name         varchar(50),
    description  varchar(100),
    pic_url      varchar(500),
    created_date timestamp        NOT NULL,
    updated_date timestamp        NOT NULL,
    version      integer          NOT NULL
);

CREATE INDEX IF NOT EXISTS idx_application_id on material_sch.materials (id);
CREATE INDEX IF NOT EXISTS idx_type on material_sch.materials (category);