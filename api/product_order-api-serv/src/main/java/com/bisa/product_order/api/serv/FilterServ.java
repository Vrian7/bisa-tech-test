/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.bisa.product_order.api.serv;

import com.bisa.product_order.api.data.OrderData;
import com.bisa.product_order.api.data.ProductData;
import java.util.List;

/**
 *
 * @author brian.barrera
 */
public interface FilterServ {
    String NAME = "FilterServ";
    List<ProductData> searchByOrder(OrderData orderData);

    List<OrderData> searchByProduct(ProductData productData);

    List<ProductData> search(String filter);

}
