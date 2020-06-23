package com.dami.orders.dao;

import com.dami.orders.bean.orders;

public interface OrdersMapper {
    orders selectOrderByUid(int uid);

    int insertOrders(orders or);

    int updateOrders(orders or);

    int updateOrderState(int i, String orders_number);
}
