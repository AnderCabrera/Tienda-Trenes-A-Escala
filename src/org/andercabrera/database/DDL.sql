CREATE DATABASE tienda_linea;
USE tienda_linea;

CREATE TABLE IF NOT EXISTS tbl_clientes (
    id_cliente  INT         NOT NULL AUTO_INCREMENT, 
    nombre      VARCHAR(30) NOT NULL,
    apellido    VARCHAR(30) NOT NULL, 
    direccion   VARCHAR(12) NOT NULL, 
    telefono    VARCHAR(30) NOT NULL, 
    email       VARCHAR(70) NOT NULL,
    PRIMARY KEY (id_cliente)
);  

CREATE TABLE IF NOT EXISTS tbl_usuarios (
    id_usuario     INT  	   NOT NULL AUTO_INCREMENT,
    id_cliente	   INT 		   NOT NULL,
    usuario        VARCHAR(30) NOT NULL,
    contrasena     VARCHAR(30) NOT NULL,
    estado_activo  BOOLEAN 	   NOT NULL,
    administrador  BOOLEAN 	   NOT NULL,
    PRIMARY KEY (id_usuario),
    FOREIGN KEY (id_cliente) REFERENCES tbl_clientes(id_cliente)
);  

CREATE TABLE IF NOT EXISTS tbl_productos (
    id_producto    INT         NOT NULL AUTO_INCREMENT,
    marca          VARCHAR(30) NOT NULL,
    modelo 	       VARCHAR(30) NOT NULL,
    escala 	       VARCHAR(30) NOT NULL,
    precio 	       INT         NOT NULL,
    PRIMARY KEY (id_producto)
);

CREATE TABLE IF NOT EXISTS tbl_ventas (
    id_venta 	  INT  NOT NULL AUTO_INCREMENT,
    id_cliente 	  INT  NOT NULL,
    fecha_compra  DATE NOT NULL,
    PRIMARY KEY (id_venta),
    FOREIGN KEY (id_cliente) REFERENCES tbl_clientes (id_cliente)
);

CREATE TABLE IF NOT EXISTS tbl_detalle_venta (
    id_detalle_venta  INT    NOT NULL AUTO_INCREMENT,
    id_venta          INT    NOT NULL,
    id_producto       INT    NOT NULL,
    cantidad_producto INT    NOT NULL,
    PRIMARY KEY (id_detalle_venta),
    FOREIGN KEY (id_venta) REFERENCES tbl_ventas(id_venta),
    FOREIGN KEY (id_producto) REFERENCES tbl_productos(id_producto)
);
