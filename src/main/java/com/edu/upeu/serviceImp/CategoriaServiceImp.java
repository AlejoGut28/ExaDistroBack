package com.edu.upeu.serviceImp;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.edu.upeu.dao.CategoriaDao;
import com.edu.upeu.entity.Categoria;
import com.edu.upeu.service.CategoriaService;

@Service
public class CategoriaServiceImp implements CategoriaService{
	
	@Autowired
	private CategoriaDao categoriaDao;

	@Override
	public List<Categoria> findAll() {
		return (List<Categoria>)  categoriaDao.findAll();
	}

	@Override
	public Categoria findById(Long id) {
		// TODO Auto-generated method stub
		return categoriaDao.findById(id).orElse(null);
	}

	@Override
	public Categoria save(Categoria categoria) {
		// TODO Auto-generated method stub
		return categoriaDao.save(categoria);
	}

	@Override
	public void delete(Long id) {
		// TODO Auto-generated method stub
		categoriaDao.deleteById(id);
	} 

}
