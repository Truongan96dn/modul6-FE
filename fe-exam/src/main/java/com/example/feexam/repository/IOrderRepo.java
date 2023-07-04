package com.example.feexam.repository;

import com.example.feexam.model.Orders;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import javax.transaction.Transactional;
import java.util.List;

public interface IOrderRepo extends JpaRepository<Orders,Integer> {
    @Query(value = "select * from orders where is_delete = false",nativeQuery = true)
    List<Orders> getAllOrder();

    @Query(value = "update orders set orders.is_delete = true where orders.id=:id",nativeQuery = true)
    @Modifying
    @Transactional
    void deleteOrder(@Param("id") Integer id);
}
