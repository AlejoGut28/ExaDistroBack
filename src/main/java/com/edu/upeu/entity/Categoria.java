package com.edu.upeu.entity;

import java.io.Serializable;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="categoria")
public class Categoria implements Serializable{
	
	private static final long  serialVersionUID = 1L;
@Id
@GeneratedValue(strategy = GenerationType.IDENTITY)
private Long idcategoria;
private String nomcat;


public Long getIdcategoria() {
	return idcategoria;
}
public void setIdcategoria(Long idcategoria) {
	this.idcategoria = idcategoria;
}
public String getNomcat() {
	return nomcat;
}
public void setNomcat(String nomcat) {
	this.nomcat = nomcat;
}

}
