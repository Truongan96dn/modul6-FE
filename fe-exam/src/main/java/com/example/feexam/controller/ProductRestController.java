package com.example.feexam.controller;

import com.example.feexam.model.Orders;
import com.example.feexam.model.Product;
import com.example.feexam.repository.IProductRepo;
import com.example.feexam.service.IOrderService;
import com.example.feexam.service.IProductService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@CrossOrigin("*")
@RequestMapping("/api/admin/product")
public class ProductRestController {
    @Autowired
    private IProductService iProductService;
    @GetMapping("")
    public ResponseEntity<List<Product>> getList(){
        return new ResponseEntity<>(iProductService.getAll(), HttpStatus.OK);
    }
}
