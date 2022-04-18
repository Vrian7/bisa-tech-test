/* 
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Other/SQLTemplate.sql to edit this template
 */
/**
 * Author:  brian.barrera
 * Created: Apr 14, 2022
 */

CREATE TABLE public.product_order (
	product_order_id serial NOT NULL,
	product_id int8 NULL,
	order_id int8 NULL,
	CONSTRAINT product_order_fk FOREIGN KEY (product_id) REFERENCES public.product(product_id),
	CONSTRAINT product_order_fk_1 FOREIGN KEY (product_id) REFERENCES public.product(product_id)
);
