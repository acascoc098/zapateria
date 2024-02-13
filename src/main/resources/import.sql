INSERT INTO `categoria` (`id`, `nombre`, `padre_id`) VALUES (1,	'mujer',	NULL);
INSERT INTO `categoria` (`id`, `nombre`, `padre_id`) VALUES (2,	'hombre',	NULL);
INSERT INTO `categoria` (`id`, `nombre`, `padre_id`) VALUES (3,	'deportivo',	NULL);
INSERT INTO `categoria` (`id`, `nombre`, `padre_id`) VALUES (4,	'montania',	3);
INSERT INTO `categoria` (`id`, `nombre`, `padre_id`) VALUES (5,	'tenis',	3);
INSERT INTO `categoria` (`id`, `nombre`, `padre_id`) VALUES (6,	'running',	3);
INSERT INTO `categoria` (`id`, `nombre`, `padre_id`) VALUES (7,	'trail running',	6);

INSERT INTO `localidad` (`cp`, `nombre`, `provincia`) VALUES (23003,	'Jaén',	'Jaén');
INSERT INTO `localidad` (`cp`, `nombre`, `provincia`) VALUES (23009,	'Jaén',	'Jaén');
INSERT INTO `localidad` (`cp`, `nombre`, `provincia`) VALUES (23440,	'Baeza',	'Jaén');

INSERT INTO `direccion` (`id`, `nombre_via`, `numero`, `planta`, `tipo_via`, `localidad_cp`) VALUES (1,	'de la Estación',	'44',	'0',	'Paseo',	23003);
INSERT INTO `direccion` (`id`, `nombre_via`, `numero`, `planta`, `tipo_via`, `localidad_cp`) VALUES (2,	'San Pablo',	'123',	'12',	'Calle',	23440);

INSERT INTO `rol` (`id`, `nombre`) VALUES (1,	'admin');
INSERT INTO `rol` (`id`, `nombre`) VALUES  (2,	'cliente');

INSERT INTO `telefono` (`numero`, `codigo_pais`) VALUES (123456789,	34);
INSERT INTO `telefono` (`numero`, `codigo_pais`) VALUES (555123456,	34);

INSERT INTO `usuario` (`id`, `apellido`, `email`, `nombre`, `password`, `username`, `direccion_id`, `telefono_numero`) VALUES (1,	'Martín',	'pepe@sincorreo.com',	'Pepe',	'Secreto_123',	'pepe',	1,	555123456);
INSERT INTO `usuario` (`id`, `apellido`, `email`, `nombre`, `password`, `username`, `direccion_id`, `telefono_numero`) VALUES (2,	'Sin Miedo',	'obijuan@sincorreo.es',	'Juan',	'Secreto_123',	'obijuan',	2,	123456789);

INSERT INTO `usuario_roles` (`usuario_id`, `roles_id`) VALUES (1,	1);
INSERT INTO `usuario_roles` (`usuario_id`, `roles_id`) VALUES (2,	2);

INSERT INTO `producto` (`id`, `descripcion`, `nombre`, `precio`) VALUES (1,	'Con suela reforzada y gel para amortiguar la zancada',	'Asics Gel-Venture 9',	80);
INSERT INTO `producto` (`id`, `descripcion`, `nombre`, `precio`) VALUES (2,	'Suela ultracómoda de foam.',	'Skechers Mark Nason',	100);

INSERT INTO `producto_categorias` (`producto_id`, `categorias_id`) VALUES (1,	3);
INSERT INTO `producto_categorias` (`producto_id`, `categorias_id`) VALUES (1,	6);
INSERT INTO `producto_categorias` (`producto_id`, `categorias_id`) VALUES (1,	7);
INSERT INTO `producto_categorias` (`producto_id`, `categorias_id`) VALUES (2,	2);

INSERT INTO `pedido` (`id`, `fecha`, `cliente_id`, `direccion_id`, `operario_id`, `telefono_numero`, `descuento`) VALUES (2,	'2024-02-08',	2,	2,	1,	123456789,	5);

INSERT INTO `producto_pedido` (`id`, `cantidad`, `precio`, `pedido_id`, `producto_id`) VALUES (2,	1,	80,	2,	1);
