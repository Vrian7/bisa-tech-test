package com.bisa.product_order.product_order.api.mapper;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

import com.bisa.product_order.api.data.OrderData;
import com.bisa.product_order.runtime.data.OrderSource;

public class OrderMapper {
    public static void mapperToOrderData(OrderSource from, OrderData to) {
        to.setCode(from.getOrderId());
        to.setDate(from.getDate());
        to.setDescription(from.getDescription());
    }

    public static OrderData mapperToOrderData(OrderSource from) {
        if (from == null) {
            return null;
        }
        OrderData to = new OrderData();
        mapperToOrderData(from, to);
        return to;
    }

    public static List<OrderData> mapperToOrderDataList(List<OrderSource> fromList) {
        if (fromList == null || fromList.size() == 0) {
            return new ArrayList<OrderData>();
        }
        return fromList
                .stream()
                .map(p -> mapperToOrderData(p))
                .collect(Collectors.toList());
    }

    public static void mapperToOrderSource(OrderData from, OrderSource to) {
        to.setOrderId(from.getCode());
        to.setDate(from.getDate());
        to.setDescription(from.getDescription());
    }

    public static OrderSource mapperToOrderSource(OrderData from) {
        if (from == null) {
            return null;
        }
        OrderSource to = new OrderSource();
        mapperToOrderSource(from, to);
        return to;
    }

    public static List<OrderSource> mapperToOrderSourceList(List<OrderData> fromList) {
        if (fromList == null || fromList.size() == 0) {
            return new ArrayList<OrderSource>();
        }
        return fromList
                .stream()
                .map(p -> mapperToOrderSource(p))
                .collect(Collectors.toList());
    }
}
