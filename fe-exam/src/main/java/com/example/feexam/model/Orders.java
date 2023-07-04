package com.example.feexam.model;

import javax.persistence.*;
import java.time.LocalDate;

@Entity
public class Orders {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;

    private String orderCode;
    @ManyToOne
    @JoinColumn(name = "product_id")
    private Product product;
    private LocalDate buyDate;
    private Double price;
    private Integer quantity;
    private Double total;
    @Column(name = "is_delete")
    private boolean isDelete;

    public Orders() {
    }

    public boolean isDelete() {
        return isDelete;
    }

    public void setDelete(boolean delete) {
        isDelete = delete;
    }

    public Orders(Integer id, String orderCode, Product product, LocalDate buyDate, Double price, Integer quantity, Double total, boolean isDelete) {
        this.id = id;
        this.orderCode = orderCode;
        this.product = product;
        this.buyDate = buyDate;
        this.price = price;
        this.quantity = quantity;
        this.total = total;
        this.isDelete = isDelete;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getOrderCode() {
        return orderCode;
    }

    public void setOrderCode(String orderCode) {
        this.orderCode = orderCode;
    }

    public Product getProduct() {
        return product;
    }

    public void setProduct(Product product) {
        this.product = product;
    }

    public LocalDate getBuyDate() {
        return buyDate;
    }

    public void setBuyDate(LocalDate buyDate) {
        this.buyDate = buyDate;
    }

    public Double getPrice() {
        return price;
    }

    public void setPrice(Double price) {
        this.price = price;
    }

    public Integer getQuantity() {
        return quantity;
    }

    public void setQuantity(Integer quantity) {
        this.quantity = quantity;
    }

    public Double getTotal() {
        return total;
    }

    public void setTotal(Double total) {
        this.total = total;
    }
}
