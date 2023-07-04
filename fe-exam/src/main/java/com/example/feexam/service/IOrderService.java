package com.example.feexam.service;

import com.example.feexam.model.Orders;

import java.util.List;

public interface IOrderService {
    List<Orders> getAll();
    void delete(Integer id);
}
