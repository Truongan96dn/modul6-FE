package com.example.feexam.controller;

import com.example.feexam.model.Orders;
import com.example.feexam.service.IOrderService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@CrossOrigin("*")
@RequestMapping("/api/admin/orders")

public class OrdersRestController {
    @Autowired
    private IOrderService iOrderService;
    @GetMapping("")
    public ResponseEntity<List<Orders>> getList(){
        return new ResponseEntity<>(iOrderService.getAll(), HttpStatus.OK);
    }
    @DeleteMapping("/{id}")
    public void deleteOrder (@PathVariable("id") Integer id) {
        iOrderService.delete(id);
    }
}
