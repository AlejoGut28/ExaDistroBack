package com.edu.upeu.service;

import java.util.List;

import com.edu.upeu.entity.Producto;

public interface ProductoService {
	
	public List<Producto> findAll();
    public Producto findById(Long id);
    public Producto save(Producto producto);
    public void delete(Long id);
}
