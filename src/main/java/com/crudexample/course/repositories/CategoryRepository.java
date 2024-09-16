package com.crudexample.course.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.crudexample.course.entities.Category;

public interface CategoryRepository extends JpaRepository<Category, Long>{
	
}
