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
SELECT * FROM tbl_ventas;

-- Querys
SELECT * FROM mostrar_ventas;

-- Historial clientes
create view historial_clientes as  
select
c.id_cliente,
c.nombre,
c.apellido,
p.id_producto,
p.marca,
p.precio,
v.cantidad_producto,
v.dinero_total,
v.fecha_compra
from tbl_clientes c
inner join tbl_ventas v
on c.id_cliente = v.id_cliente
inner join tbl_productos p
on v.id_producto = p.id_producto;

select * from historial_clientes;

call historial_cliente(1);