package com.dami.orders.service;

import com.dami.orders.bean.orders;
import com.dami.orders.dao.OrdersMapper;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;

@Service
public class ordersService {
    @Resource
    OrdersMapper od;
    public orders selectOrderByUid(int uid) {
        // TODO Auto-generated method stub
        return od.selectOrderByUid(uid);
    }
    public boolean insertOrders(orders or) {
        // TODO Auto-generated method stub
        return od.insertOrders(or)==1;
    }
    public boolean updateOrders(orders or) {
        // TODO Auto-generated method stub
        return od.updateOrders(or)==1;
    }
    public boolean updateOrderState(int i, String orders_number) {
        // TODO Auto-generated method stub
        return od.updateOrderState(i, orders_number)>0;
    }
}
