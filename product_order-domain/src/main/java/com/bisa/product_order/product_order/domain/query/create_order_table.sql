/* 
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Other/SQLTemplate.sql to edit this template
 */
/**
 * Author:  brian.barrera
 * Created: Apr 14, 2022
 */

CREATE TABLE public."order" (
	order_id serial NOT NULL,
	date_ date NULL,
	description varchar NULL,
	CONSTRAINT order_pk PRIMARY KEY (order_id)
);
