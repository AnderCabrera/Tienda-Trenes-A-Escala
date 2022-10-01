use tienda_linea;

call agregar_cliente('Ander', 'Cabrera', 'Zona 7', '12345678', 'aCabrera@gmail.com');
call agregar_cliente('Juan', 'Perez', 'Zona 1', '12345678', 'jPerez@gmail.com');
call agregar_cliente('Pedro', 'Gomez', 'Zona 2', '12345678', 'pGomez@gmail.com');
call agregar_cliente('Maria', 'Rodriguez', 'Zona 3', '12345678', 'mRodriguez@gmail.com');
call agregar_cliente('Luis', 'Gonzalez', 'Zona 4', '12345678', 'lGonzales@gmail.com');
call agregar_cliente('Jose', 'Martinez', 'Zona 5', '12345678', 'jMartinez@gmail.com');
call agregar_cliente('Ana', 'Lopez', 'Zona 6', '12345678', 'aLopez@gmail.com');
call agregar_cliente('Carlos', 'Gutierrez', 'Zona 7', '12345678', 'cGutierrez@gmail.com');
call agregar_cliente('Rosa', 'Hernandez', 'Zona 8', '12345678', 'rHernandez@gmail.com');
call agregar_cliente('Luisa', 'Diaz', 'Zona 9', '12345678', 'lDiaz@gmail.com');

call agregar_usuario(1, 'aCabrera', '12345678', TRUE, TRUE);
call agregar_usuario(2, 'jPerez', '12345678', TRUE, FALSE);
call agregar_usuario(3, 'pGomez', '12345678', TRUE, FALSE);
call agregar_usuario(4, 'mRodriguez', '12345678', TRUE, FALSE);
call agregar_usuario(5, 'lGonzalez', '12345678', TRUE, FALSE);
call agregar_usuario(6, 'jMartinez', '12345678', TRUE, FALSE);
call agregar_usuario(7, 'aLopez', '12345678', TRUE, FALSE);
call agregar_usuario(8, 'cGutierrez', '12345678', TRUE, FALSE);
call agregar_usuario(9, 'rHernandez', '12345678', TRUE, FALSE);
call agregar_usuario(10, 'lDiaz', '12345678', TRUE, FALSE);

call agregar_producto('Arnold', 'HN4296', 'N', 1000);
call agregar_producto('Vigier Cement', 'FM848905', 'N', 4500);
call agregar_producto('Dampflok', 'RO70202', 'HO', 26000);
call agregar_producto('Cement', 'FM848905', 'N', 4500);
call agregar_producto('Deutsche', 'RO71205', 'HO', 35000);
call agregar_producto('Siemens', 'RO71937', 'HO', 17500);
call agregar_producto('Ty2', 'RO72063', 'HO', 24067);
call agregar_producto('ONTC', 'RO72067', 'HO', 37041);
call agregar_producto('Velaro', 'RO72095', 'HO', 34510);
call agregar_producto('Regiojet', 'RO73217', 'HO', 20831);
