CREATE TABLE public.contact (
 id SERIAL UNIQUE PRIMARY KEY,
 name VARCHAR (50) NOT NULL,
 surename VARCHAR (50) NOT NULL,
 email VARCHAR (50) NOT NULL,
 phone VARCHAR (50) NOT NULL
);
ALTER TABLE public.contact OWNER TO admin;
