create database terracraft;
\c terracraft;

create table Utilisateur(
    id_utilisateur SERIAL PRIMARY KEY,
    email varchar(50),
    nom_utilisateur varchar(40),
    mdp varchar(30)
);

insert into Utilisateur(email, nom_Utilisateur, mdp) values ('irintsoa@gmail.com','Irintsoa','1234');

create table terrain(
    id_Terrain serial primary key,
    nom_terrain varchar(100),
    type_sol varchar(50),
    nb_Parcelle int,
    superficie double precision,
    longitude_terrain int,
    latitude_terrain int,
    photo_terrain varchar(100)
)

INSERT INTO terrain (nom_Terrain, type_Sol, nb_Parcelle, superficie, longitude_Terrain, latitude_Terrain, photo_Terrain)
VALUES ('Ferme de la Vallee', 'Argilo-limoneux', 5, 120.5, 45, -75, 'terrain1.jpg');

create table culture(
    id_Culture serial primary key,
    nom_Culture varchar (200),
    type_Culture varchar(100),
    temps_Culture timestamp,
    rendement int
    );


INSERT INTO culture (nom_Culture, type_Culture, temps_Culture, rendement)
VALUES ('Pommes', 'Fruits', '2024-01-26 08:00:00', 300);

create table parcelle(
    id_Parcelle serial primary key,
    id_Culture int,
    foreign key (id_Culture) references Culture (id_Culture),
    type_Sol_Parcelle varchar(50),
    longitude_Parcelle int,
    latitude_Parcelle int
    );

INSERT INTO parcelle (id_Culture, type_Sol_Parcelle, longitude_Parcelle, latitude_Parcelle)
VALUES (1, 'Argileux', 40, -75 );