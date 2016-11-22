/* 
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
/**
 * Author:  campitos
 * Created: Oct 7, 2016
 */
create table departamento(id integer primary key auto_increment, 
nombre varchar(30));



create table empleado(id integer primary key auto_increment,
id_depto integer, nombre varchar(40), sueldo float,
foreign key(id_depto) references departamento(id));

select * from departamento;
select * from empleado;

create table estacionamiento (id integer primary key auto_increment, tiempo timestamp);
create table cliente (id integer primary key auto_increment, id_estacionamiento integer, pago float,
foreign key(id_estacionamiento) references estacionamiento(id));

create table mensaje(id integer primary key auto_increment, titulo varchar(30),
                     cuerpo varchar(30));

drop table cliente;
select * from estacionamiento;
select * from cliente;
select * from mensaje;


