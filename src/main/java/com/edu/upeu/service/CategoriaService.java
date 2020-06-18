package com.edu.upeu.service;

import java.util.List;

import com.edu.upeu.entity.Categoria;

public interface CategoriaService {
	
	public List<Categoria> findAll();
	public Categoria findById(Long id);
	public Categoria save(Categoria categoria);
	public void delete(Long id);

}
