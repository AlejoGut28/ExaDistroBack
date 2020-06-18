package com.edu.upeu.dao;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.edu.upeu.entity.Producto;

@Repository
public interface ProductoDao extends CrudRepository<Producto, Long>{

}
