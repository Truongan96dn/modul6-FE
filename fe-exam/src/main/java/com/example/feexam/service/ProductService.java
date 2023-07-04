package com.example.feexam.service;

import com.example.feexam.model.Product;
import com.example.feexam.repository.IProductRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ProductService implements IProductService{
    @Autowired
    private IProductRepo iProductRepo;

    @Override
    public List<Product> getAll() {
        return iProductRepo.findAll();
    }
}
