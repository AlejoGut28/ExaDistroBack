package com.edu.upeu.entity;

import java.io.Serializable;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

@Entity
@Table(name="producto")
public class Producto implements Serializable{
	
	private static final long  serialVersionUID = 1L;
@Id
@GeneratedValue(strategy = GenerationType.IDENTITY)
private Long idproducto;
private String nomprod;
private Double precio;
private int cantidad;
@ManyToOne
@JoinColumn(name = "idcategoria")
Categoria idcategoria;
public Long getIdproducto() {
	return idproducto;
}
public void setIdproducto(Long idproducto) {
	this.idproducto = idproducto;
}
public String getNomprod() {
	return nomprod;
}
public void setNomprod(String nomprod) {
	this.nomprod = nomprod;
}
public Double getPrecio() {
	return precio;
}
public void setPrecio(Double precio) {
	this.precio = precio;
}
public int getCantidad() {
	return cantidad;
}
public void setCantidad(int cantidad) {
	this.cantidad = cantidad;
}
public Categoria getIdcategoria() {
	return idcategoria;
}
public void setIdcategoria(Categoria idcategoria) {
	this.idcategoria = idcategoria;
}



}
