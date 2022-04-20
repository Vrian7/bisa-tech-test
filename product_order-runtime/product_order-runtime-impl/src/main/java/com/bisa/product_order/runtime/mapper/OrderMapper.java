package com.bisa.product_order.runtime.mapper;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

import com.bisa.product_order.product_order.domain.model.Order;
import com.bisa.product_order.runtime.data.OrderSource;

/**
 *
 * @author brian.barrera
 */
public class OrderMapper {
    public static void mapperToOrder(OrderSource from, Order to) {
        to.setOrderId(from.getOrderId());
        to.setDate(from.getDate());
        to.setDescription(from.getDescription());
    }

    public static Order mapperToOrder(OrderSource from) {
        if (from == null) {
            return null;
        }
        Order to = new Order();
        mapperToOrder(from, to);
        return to;
    }

    public static List<Order> mapperToOrderList(List<OrderSource> fromList) {
        if (fromList == null || fromList.size() == 0) {
            return new ArrayList<Order>();
        }
        return fromList
                .stream()
                .map(p -> mapperToOrder(p))
                .collect(Collectors.toList());
    }

    public static void mapperToOrderSource(Order from, OrderSource to) {
        to.setOrderId(from.getOrderId());
        to.setDate(from.getDate());
        to.setDescription(from.getDescription());
    }

    public static OrderSource mapperToOrderSource(Order from) {
        if (from == null) {
            return null;
        }
        OrderSource to = new OrderSource();
        mapperToOrderSource(from, to);
        return to;
    }

    public static List<OrderSource> mapperToOrderSourceList(List<Order> fromList) {
        if (fromList == null || fromList.size() == 0) {
            return new ArrayList<OrderSource>();
        }
        return fromList
                .stream()
                .map(p -> mapperToOrderSource(p))
                .collect(Collectors.toList());
    }
}
