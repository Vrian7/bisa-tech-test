package com.bisa.product_order.product_order.api.mapper;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

import com.bisa.product_order.api.data.ProductData;
import com.bisa.product_order.runtime.data.ProductSource;

public class ProductMapper {
    public static void mapperToProductData(ProductSource from, ProductData to) {
        to.setName(from.getName());
        to.setCode(from.getProductId());
    }

    public static ProductData mapperToProductData(ProductSource from) {
        if (from == null) {
            return null;
        }
        ProductData to = new ProductData();
        mapperToProductData(from, to);
        return to;
    }

    public static List<ProductData> mapperToProductDataList(List<ProductSource> fromList) {
        if (fromList == null || fromList.size() == 0) {
            return new ArrayList<ProductData>();
        }
        return fromList
                .stream()
                .map(p -> mapperToProductData(p))
                .collect(Collectors.toList());
    }

    public static void mapperToProductSource(ProductData from, ProductSource to) {
        to.setName(from.getName());
        to.setProductId(from.getCode());
    }

    public static ProductSource mapperToProductSource(ProductData from) {
        if (from == null) {
            return null;
        }
        ProductSource to = new ProductSource();
        mapperToProductSource(from, to);
        return to;
    }

    public static List<ProductSource> mapperToProductSourceList(List<ProductData> fromList) {
        if (fromList == null || fromList.size() == 0) {
            return new ArrayList<ProductSource>();
        }
        return fromList
                .stream()
                .map(p -> mapperToProductSource(p))
                .collect(Collectors.toList());
    }
}
