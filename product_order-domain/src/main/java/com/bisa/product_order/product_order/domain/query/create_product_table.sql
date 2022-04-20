/* 
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Other/SQLTemplate.sql to edit this template
 */
/**
 * Author:  brian.barrera
 * Created: Apr 14, 2022
 */

CREATE TABLE public.product (
	product_id serial NOT NULL,
	description varchar NULL,
	CONSTRAINT product_pk PRIMARY KEY (product_id)
);
