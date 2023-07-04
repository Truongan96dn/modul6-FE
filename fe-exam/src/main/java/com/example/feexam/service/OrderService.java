package com.example.feexam.service;

import com.example.feexam.model.Orders;
import com.example.feexam.repository.IOrderRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
@Service

public class OrderService implements IOrderService{
    @Autowired
    private IOrderRepo iOrderRepo;
    @Override
    public List<Orders> getAll() {
        return iOrderRepo.getAllOrder();
    }

    @Override
    public void delete(Integer id) {
        iOrderRepo.deleteOrder(id);
    }
}
