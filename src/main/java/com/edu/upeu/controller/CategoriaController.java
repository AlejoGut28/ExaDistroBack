package com.edu.upeu.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestController;

import com.edu.upeu.entity.Categoria;
import com.edu.upeu.service.CategoriaService;

@CrossOrigin(origins = "http://localhost:4200")
@RequestMapping("/api")
@RestController
public class CategoriaController {
	
	@Autowired
	private CategoriaService categoriaService;
	@GetMapping("/categoria")
	public List<Categoria> readAll(){
		return categoriaService.findAll();
	}
	
	 @GetMapping("/categoria/{id}")
	 public Categoria read(@PathVariable Long id) {
		 return categoriaService.findById(id);
	 }
	 
	 @PostMapping("/savecat")
	 @ResponseStatus(HttpStatus.CREATED)
	 public Categoria create(@RequestBody Categoria categoria) {
		 return categoriaService.save(categoria);
	 }
	 
	 @PutMapping("/editcat/{id}")
	 public Categoria update(@RequestBody Categoria categoria, @PathVariable Long id) {
		 Categoria edit_Categoria = categoriaService.findById(id);
		 edit_Categoria.setNomcat(categoria.getNomcat());
		 return categoriaService.save(edit_Categoria);
	 }
	 
	 @DeleteMapping("/deletecat/{id}")
	 public void delete(@PathVariable Long id) {
		 categoriaService.delete(id);
		 System.out.println("Categoria eliminada");
	 }

}
