package com.shoppingCart.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import com.shoppingCart.dto.OrderDetail;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;

import javax.transaction.Transactional;

public interface OrderDetailRepository extends JpaRepository<OrderDetail, Integer>{
	List<OrderDetail> findAll();
    OrderDetail findById(int id);
    OrderDetail save(OrderDetail productImage);

    @Query(value = "update Order_Detail set deleted = 1 where order_detail_id = ?1", nativeQuery = true)
    @Modifying
    @Transactional
    void delete(int id);
}
