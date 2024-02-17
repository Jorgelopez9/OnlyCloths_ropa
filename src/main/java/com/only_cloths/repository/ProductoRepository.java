package com.only_cloths.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.only_cloths.model.Producto;

@Repository
public interface ProductoRepository extends JpaRepository<Producto, Integer>{
	
}
