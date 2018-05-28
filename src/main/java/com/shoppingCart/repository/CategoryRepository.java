package com.shoppingCart.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import com.shoppingCart.dto.Category;

public interface CategoryRepository extends JpaRepository<Category, Integer>{
	List<Category> findAll();
}
