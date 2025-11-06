-- Datos de prueba para productos con las nuevas imágenes

-- CORTES DE CABELLO
INSERT INTO productos (nombre, descripcion, precio, categoria, imagen, create_at) VALUES 
('Corte Afro', 'Corte de cabello afro con estilo natural y volumen', 35000, 'Cortes', 'corte_afro.png', CURRENT_TIMESTAMP),
('Corte Buzz Cut', 'Corte muy corto y uniforme, estilo militar', 25000, 'Cortes', 'corte_buzzcut.png', CURRENT_TIMESTAMP),
('Corte Cresta Punk', 'Corte rebelde estilo punk con cresta central', 40000, 'Cortes', 'corte_cresta_punk.png', CURRENT_TIMESTAMP),
('Corte Flequillo Texturizado', 'Corte moderno con flequillo texturizado', 38000, 'Cortes', 'corte_flequillo_texturizado.png', CURRENT_TIMESTAMP),
('Corte Mullet', 'Corte clásico mullet, corto adelante y largo atrás', 42000, 'Cortes', 'corte_mullet.png', CURRENT_TIMESTAMP),
('Corte Quiff', 'Corte elegante con volumen en la parte frontal', 45000, 'Cortes', 'corte_quiff.png', CURRENT_TIMESTAMP),
('Corte Rastas', 'Peinado de rastas profesional', 80000, 'Cortes', 'corte_rastas.png', CURRENT_TIMESTAMP),
('Corte Slicked Back', 'Corte peinado hacia atrás con gel', 35000, 'Cortes', 'corte_slicked_back.png', CURRENT_TIMESTAMP);

-- BIGOTE Y BARBA
INSERT INTO productos (nombre, descripcion, precio, categoria, imagen, create_at) VALUES 
('Bigote Fino', 'Arreglo y diseño de bigote fino elegante', 20000, 'Bigote y Barba', 'bigoteBarba_bigoteFino.png', CURRENT_TIMESTAMP),
('Barba Leñador', 'Barba completa estilo leñador con arreglo', 35000, 'Bigote y Barba', 'bigoteBarba_barba_leñador.png', CURRENT_TIMESTAMP);

-- COMBOS
INSERT INTO productos (nombre, descripcion, precio, categoria, imagen, create_at) VALUES 
('Combo Cresta + Barba Leñador', 'Combinación de corte cresta con barba leñador', 65000, 'Combos', 'combo_cresta_leñador.png', CURRENT_TIMESTAMP);

-- PRODUCTOS
INSERT INTO productos (nombre, descripcion, precio, categoria, imagen, create_at) VALUES 
('Shampoo Premium', 'Shampoo profesional para todo tipo de cabello', 25000, 'Productos', 'producto_shampoo.png', CURRENT_TIMESTAMP);

-- TRATAMIENTOS
INSERT INTO productos (nombre, descripcion, precio, categoria, imagen, create_at) VALUES 
('Tratamiento Capilar', 'Tratamiento profundo para fortalecimiento capilar', 55000, 'Tratamientos', 'tratamiento_capilar.png', CURRENT_TIMESTAMP);

-- PRODUCTO DE EJEMPLO CON IMAGEN POR DEFECTO
INSERT INTO productos (nombre, descripcion, precio, categoria, imagen, create_at) VALUES 
('Servicio Personalizado', 'Servicio personalizado según las necesidades del cliente', 50000, 'Productos', 'default_product.jpg', CURRENT_TIMESTAMP);