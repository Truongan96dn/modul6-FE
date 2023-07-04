package com.example.feexam.repository;

import com.example.feexam.model.Orders;
import com.example.feexam.model.Product;
import org.springframework.data.jpa.repository.JpaRepository;

public interface IProductRepo extends JpaRepository<Product,Integer> {
}
