CREATE EXTENSION IF NOT EXISTS pgcrypto;
SELECT gen_random_uuid();
CREATE SCHEMA "auth_admin";

CREATE TABLE auth_admin."user"
(
id UUID PRIMARY KEY DEFAULT gen_random_uuid(),
name VARCHAR
);

INSERT INTO auth_admin."user" (name) VALUES ('dan');