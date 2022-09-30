use tienda_linea;
-- -----------------------------------------------------
-- CREATE
-- -----------------------------------------------------

-- Clientes
DELIMITER //
CREATE PROCEDURE agregar_cliente
(
IN  _nombre 		VARCHAR(50),
    _apellido 		VARCHAR(50),
    _direccion	    VARCHAR(100),
    _telefono 		VARCHAR(8),
    _email 			VARCHAR(100)
)
BEGIN
    INSERT INTO tbl_clientes (
        nombre,
        apellido,
        direccion,
        telefono,
        email) 
    VALUES (
        _nombre,
        _apellido,
        _direccion,
        _telefono,
        _email);
END //
DELIMITER ;

-- Usuarios
DELIMITER //
CREATE PROCEDURE agregar_usuario
(
IN  _id_cliente 	INT,
    _usuario 		VARCHAR(50),
    _contrasena 	VARCHAR(50),
    _estado_activo 	BOOLEAN,
    _administrador 	BOOLEAN
)
BEGIN
    INSERT INTO tbl_usuarios (
        id_cliente,
        usuario,
        contrasena,
        estado_activo,
        administrador) 
    VALUES (
        _id_cliente,
        _usuario,
        _contrasena,
        _estado_activo,
        _administrador);
END //
DELIMITER ;

-- Productos

DELIMITER //
CREATE PROCEDURE agregar_producto
(
IN  _marca 	VARCHAR(50),
    _modelo VARCHAR(50),
    _escala VARCHAR(50),
    _precio INT
)
BEGIN
    INSERT INTO tbl_productos (
        marca,
        modelo,
        escala,
        precio) 
    VALUES (
        _marca,
        _modelo,
        _escala,
        _precio);
END //
DELIMITER ;

-- Ventas
DELIMITER //
CREATE PROCEDURE agregar_venta
(
IN  _id_cliente    INT,
    _id_producto   INT,
    _cantidad      INT,
    _total		   INT,
    _fecha_compra  DATE
)
BEGIN
    INSERT INTO tbl_ventas (
        id_cliente,
        id_producto,
        cantidad_producto,
        dinero_total,
        fecha_compra
        )
    VALUES (
        _id_cliente,
        _id_producto,
        _cantidad,
        _total,
        _fecha_compra
        );
END //
DELIMITER ;

-- Historial
DELIMITER //
CREATE PROCEDURE historial_cliente
(
IN  _id_cliente    INT
)
BEGIN
    select 
    v.id_producto,
    p.marca,
    p.precio,
    v.cantidad_producto, 
    v.dinero_total, 
    v.fecha_compra from tbl_ventas v 
    left join tbl_productos p 
    on v.id_producto = p.id_producto where v.id_cliente = _id_cliente;
END //
DELIMITER ;

-- Detalle Venta
DELIMITER //
CREATE PROCEDURE agregar_detalle_venta
(
IN  _id_venta 			  INT,
    _id_producto 		  INT,
    _cantidad_producto 	  INT
)
BEGIN
    INSERT INTO tbl_detalle_venta (
        id_venta,
        id_producto,
        cantidad_producto) 
    VALUES (
        _id_venta,
        _id_producto,
        _cantidad_producto);
END //
DELIMITER ;

-- -----------------------------------------------------
-- UPDATE
-- -----------------------------------------------------

-- Clientes
DELIMITER //
CREATE PROCEDURE actualizar_cliente
(
IN  _id_cliente 	 INT,
    _nombre 		 VARCHAR(50),
    _apellido 		 VARCHAR(50),
    _direccion	     VARCHAR(100),
    _telefono 		 VARCHAR(8),
    _email 			 VARCHAR(100)
)
BEGIN
    UPDATE tbl_clientes SET
        nombre = _nombre,
        apellido = _apellido,
        direccion = _direccion,
        telefono = _telefono,
        email = _email
    WHERE id_cliente = _id_cliente;
END //
DELIMITER ;

-- Usuarios
DELIMITER //
CREATE PROCEDURE actualizar_usuario
(
IN  _id_usuario 	 INT,
    _id_cliente 	 INT,
    _usuario 		 VARCHAR(50),
    _contrasena 	 VARCHAR(50),
    _estado_activo 	 BOOLEAN,
    _administrador 	 BOOLEAN
)
BEGIN
    UPDATE tbl_usuarios SET
        id_cliente = _id_cliente,
        usuario = _usuario,
        contrasena = _contrasena,
        estado_activo = _estado_activo,
        administrador = _administrador
    WHERE id_usuario = _id_usuario;
END //
DELIMITER ;

-- Productos
DELIMITER //
CREATE PROCEDURE actualizar_producto
(
IN  _id_producto 	 INT,
    _marca 			 VARCHAR(50),
    _modelo 		 VARCHAR(50),
    _escala 		 VARCHAR(50),
    _precio 		 INT
)
BEGIN
    UPDATE tbl_productos SET
        marca  = _marca,
        modelo = _modelo,
        escala = _escala,
        precio = _precio
    WHERE id_producto = _id_producto;
END //
DELIMITER ;

-- Ventas

DELIMITER //
CREATE PROCEDURE actualizar_venta
(
IN  _id_venta 		  INT,
    _id_cliente 	  INT,
    _fecha_compra 	  DATE
)
BEGIN
    UPDATE tbl_ventas SET
        id_cliente = _id_cliente,
        fecha_compra = _fecha_compra
    WHERE id_venta = _id_venta;
END //
DELIMITER ;

-- Detalle Venta
DELIMITER //
CREATE PROCEDURE actualizar_detalle_venta
(
IN  _id_detalle_venta 	  INT,
    _id_venta 			  INT,
    _id_producto 		  INT,
    _cantidad_producto 	  INT
)
BEGIN
    UPDATE tbl_detalle_venta SET
        id_venta = _id_venta,
        id_producto = _id_producto,
        cantidad_producto = _cantidad_producto
    WHERE id_detalle_venta = _id_detalle_venta;
END //
DELIMITER ;

--------------------------------------------------------
-- DELETE
--------------------------------------------------------

-- Clientes

DELIMITER //
CREATE PROCEDURE eliminar_cliente
(
IN  _id_cliente  INT
)
BEGIN
    DELETE FROM tbl_clientes
    WHERE id_cliente = _id_cliente;
END //
DELIMITER ;

-- Usuarios

DELIMITER //
CREATE PROCEDURE eliminar_usuario
(
IN  _id_usuario  INT
)
BEGIN
    DELETE FROM tbl_usuarios
    WHERE id_usuario = _id_usuario;
END //
DELIMITER ;

-- Productos

DELIMITER //
CREATE PROCEDURE eliminar_producto
(
IN  _id_producto  INT
)
BEGIN
    DELETE FROM tbl_productos
    WHERE id_producto = _id_producto;
END //
DELIMITER ;

-- Ventas

DELIMITER //
CREATE PROCEDURE eliminar_venta
(
IN  _id_venta  INT
)
BEGIN
    DELETE FROM tbl_ventas
    WHERE id_venta = _id_venta;
END //
DELIMITER ;

-- Detalle Venta

DELIMITER //
CREATE PROCEDURE eliminar_detalle_venta
(
IN  _id_detalle_venta  INT
)
BEGIN
    DELETE FROM tbl_detalle_venta
    WHERE id_detalle_venta = _id_detalle_venta;
END //
DELIMITER ;
