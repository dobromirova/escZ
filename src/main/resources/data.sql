--INSERT INTO users (id, email, password, username)
--VALUES (3, 'test@mail.com', '123456789', 'monkey123');


--INSERT INTO grades (id, grade)
--VALUES
    --(1, '4a'),
    --(2, '4b'),
    --(3, '4c'),
    --(4, '5a'),
    --(5, '5b'),
    --(6, '5c'),
    --(7, '6a'),
    --(8, '6a+'),
    --(9, '6b'),
    --(10, '6b+'),
    --(11, '6c'),
    --(12, '6c+'),
    --(13, '7a'),
    --(14, '7a+'),
    --(15, '7b'),
    --(16, '7b+'),
    --(17, '7c'),
    --(18, '7c+');


--INSERT INTO routes (id, name, description, gpx_coordinates, user_id, grade_id)
--VALUES (1, 'Per ací Mixel no passa', 'Montesa es un pueblo situado a los pies de una pequeña colina, coronada por las ruinas de un castillo medieval que goza de unas privilegiadas vistas de todo el valle. Se trata de una pequeña zona con bastantes vías de escalada sobre curiosas formaciones de roca caliza anaranjada con una fricción y adherencia muy especial. El aparcamiento se encuentra al lado de las ruinas del castillo, y un paseo de 5 minutos te llevará a la zona de escalada. Las vías suelen tener entre 10 y 20 metros de altura. El gran número de vías fáciles ha popularizado esta zona entre los escaladores principiantes y las familias, sobre todo durante los fines de semana de invierno. El tipo de roca es muy diferente del resto de zonas de escalada, y sólo por eso ya merece la pena una visita.',
--    '<?xml version="1.0" encoding="UTF-8"?> <gpx version="1.1" creator="Montesa" xmlns="http://www.topografix.com/GPX/1/1" xmlns:xsi="http://www.w3.org/2001/XMLSchema-instance" xsi:schemaLocation="http://www.topografix.com/GPX/1/1 http://www.topografix.com/GPX/1/1/gpx.xsd"> <trk> <name>La Mola de Montesa</name> <trkseg> <trkpt lat="38.951275" lon="-0.656894"/></trkseg></trk></gpx>',
--    3, 5);


INSERT INTO pictures(title, url, user_id, route_id)
VALUES('Montesa', 'https://www.valenciaclimb.com/area-montesa-10/', 3, 1);

INSERT INTO comments(created, text_content, user_id, route_id)
VALUES('2026-09-07 06:35:50', X'457874726120636F6F6C20726F75746521', 3, 1);