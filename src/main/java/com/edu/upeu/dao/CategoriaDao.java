package com.edu.upeu.dao;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.edu.upeu.entity.Categoria;

@Repository
public interface CategoriaDao extends CrudRepository<Categoria, Long>{

}
