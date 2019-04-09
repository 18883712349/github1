package com.gf.service.impl;

import com.gf.dao.IOrdersDao;
import com.gf.domain.Orders;
import com.gf.service.IOrdersServices;
import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Service
@Transactional
public class IOrdersServicesImpl implements IOrdersServices {

    @Autowired
    private IOrdersDao iOrdersDao;

    //未分页
    /*@Override
    public List<Orders> findAll() throws Exception {
        return iOrdersDao.findAll();
    }*/

    @Override
    public List<Orders> findAll(int page,int size) throws Exception {
        //参数pageNum是页码值，size是每页显示条数
        PageHelper.startPage(page, size);
        return iOrdersDao.findAll();
    }

    @Override
    public Orders findById(String ordersId) throws Exception {
        return iOrdersDao.findById(ordersId);
    }
}
