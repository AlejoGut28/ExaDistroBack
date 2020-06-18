package com.edu.upeu.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestController;

import com.edu.upeu.entity.Producto;
import com.edu.upeu.service.ProductoService;

@RequestMapping("/api")
@RestController
public class ProductoController {
	
	@Autowired
	private ProductoService productoService;
	
	@GetMapping("/productos")
	public List<Producto> readAll(){
		return (List<Producto>) productoService.findAll();
	}
	
	@GetMapping("/productos/{id}")
	public Producto read(@PathVariable Long id) {
		return productoService.findById(id);
	}
	
	@PostMapping("/saveproc")
	@ResponseStatus(HttpStatus.CREATED)
	public Producto create(@RequestBody Producto producto) {
		return productoService.save(producto);	
	}
	
	@PutMapping("/editproc/{id}")
	public Producto update(@RequestBody Producto producto, @PathVariable Long id) {
		Producto edit_producto = productoService.findById(id);
	    edit_producto.setCantidad(producto.getCantidad());
	    edit_producto.setNomprod(producto.getNomprod());
	    edit_producto.setPrecio(producto.getPrecio());
	    edit_producto.setIdproducto(producto.getIdproducto());
	    return productoService.save(edit_producto);
	}
	
	@DeleteMapping("/deleteproc/{id}")
	public void delete(@PathVariable Long id) {
		System.out.println(id);
		productoService.delete(id);
	}

}
