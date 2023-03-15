drop table if exists tool;

create table tool (
    id int primary key auto_increment,
    name varchar(200) not null,
    description varchar(3000),
    image_url varchar(500)
);

insert into tool
values
(
    1, 'Llave Inglesa', 'Llave universal ajustable', 'http:www.testImage.com/12345'
),
(
    2, 'Martillo L', 'Martillo tamaño industrial', 'http:www.testImage.com/54321'
),
(
    3, 'Destornillador', 'Destornillador Estrella Universal', 'http:www.testImage.com/15'
);