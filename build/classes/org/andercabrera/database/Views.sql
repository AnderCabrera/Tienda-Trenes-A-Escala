use tienda_linea;

-- Clientes
CREATE VIEW mostrar_clientes AS
SELECT id_cliente, nombre, apellido, direccion, telefono, email
FROM tbl_clientes;

-- Querys
SELECT * FROM mostrar_clientes;

-- Usuarios
CREATE VIEW mostrar_usuarios AS
SELECT id_usuario, id_cliente, usuario, contrasena, estado_activo, administrador
FROM tbl_usuarios;

CREATE VIEW mostrar_contrasenas AS
SELECT id_usuario, usuario, contrasena
FROM tbl_usuarios;

-- Querys
SELECT * FROM mostrar_usuarios;
SELECT * FROM mostrar_contrasenas;

-- Productos
CREATE VIEW mostrar_productos AS
SELECT id_producto, marca, modelo, escala, precio
FROM tbl_productos;

-- Querys
SELECT * FROM mostrar_productos;

-- Ventas
CREATE VIEW mostrar_ventas AS
SELECT id_venta, id_cliente, fecha_compra
FROM tbl_ventas;

-- Querys
SELECT * FROM mostrar_ventas;

-- Detalle de ventas
CREATE VIEW mostrar_detalle_ventas AS
SELECT id_detalle_venta, id_venta, id_producto, cantidad_producto
FROM tbl_detalle_venta;

-- Querys
SELECT * FROM mostrar_detalle_ventas;
