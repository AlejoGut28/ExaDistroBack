package com.edu.upeu.service;

import com.edu.upeu.entity.Usuario;

public interface IUsuarioService {
	
	public Usuario findByUsername(String username);

}
