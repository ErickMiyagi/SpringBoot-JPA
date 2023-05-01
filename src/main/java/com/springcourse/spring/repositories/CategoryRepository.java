package com.springcourse.spring.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.springcourse.spring.entities.Category;

public interface CategoryRepository extends JpaRepository<Category, Long>{
	
}
