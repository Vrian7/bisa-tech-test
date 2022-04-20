package com.bisa.product_order.runtime.mapper;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

import com.bisa.product_order.product_order.domain.model.Product;
import com.bisa.product_order.runtime.data.ProductSource;

/**
 *
 * @author brian.barrera
 */
public class ProductMapper {
    public static void mapperToProduct(ProductSource from, Product to) {
        to.setName(from.getName());
        to.setProductId(from.getProductId());
    }

    public static Product mapperToProduct(ProductSource from) {
        if (from == null) {
            return null;
        }
        Product to = new Product();
        mapperToProduct(from, to);
        return to;
    }

    public static List<Product> mapperToProductList(List<ProductSource> fromList) {
        if (fromList == null || fromList.size() == 0) {
            return new ArrayList<Product>();
        }
        return fromList
                .stream()
                .map(p -> mapperToProduct(p))
                .collect(Collectors.toList());
    }

    public static void mapperToProductSource(Product from, ProductSource to) {
        to.setName(from.getName());
        to.setProductId(from.getProductId());
    }

    public static ProductSource mapperToProductSource(Product from) {
        if (from == null) {
            return null;
        }
        ProductSource to = new ProductSource();
        mapperToProductSource(from, to);
        return to;
    }

    public static List<ProductSource> mapperToProductSourceList(List<Product> fromList) {
        if (fromList == null || fromList.size() == 0) {
            return new ArrayList<ProductSource>();
        }
        return fromList
                .stream()
                .map(p -> mapperToProductSource(p))
                .collect(Collectors.toList());
    }
}
