-- owner: postgres , password: 123
-- Glassfish 4.0
-- JDK 1.8
-- JEE 7

CREATE DATABASE store;

CREATE TABLE cliente
(
id_cliente SERIAL,
nombres varchar NOT NULL,
apellidos varchar NOT NULL,
CONSTRAINT id_cliente_pk PRIMARY KEY (id_cliente)
);
 
CREATE TABLE orden
(
id_orden SERIAL,
id_producto integer NOT NULL,
id_cliente integer NOT NULL,
cantidad integer NOT NULL, 
fecha date NOT NULL,
CONSTRAINT id_orden_pk PRIMARY KEY (id_orden)
);

CREATE TABLE producto
(
id_producto SERIAL,
nombre varchar NOT NULL,
descripcion varchar NOT NULL,
precio numeric NOT NULL,
CONSTRAINT id_producto_pk PRIMARY KEY (id_producto)
);

ALTER TABLE orden
ADD CONSTRAINT "id_producto_fk" 
    FOREIGN KEY ("id_producto")
    REFERENCES producto("id_producto")
    ON DELETE NO ACTION
    ON UPDATE NO ACTION;

ALTER TABLE orden
ADD CONSTRAINT "id_cliente_fk" 
    FOREIGN KEY ("id_cliente")
    REFERENCES cliente("id_cliente")
    ON DELETE NO ACTION
    ON UPDATE NO ACTION;
	
	
