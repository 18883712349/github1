package com.gf.service;

import com.gf.domain.Orders;

import java.util.List;

public interface IOrdersServices {

    //未分页
//    List<Orders> findAll() throws Exception;

    //分页
    List<Orders> findAll(int page,int size) throws Exception;

    Orders findById(String ordersId) throws Exception;
}
