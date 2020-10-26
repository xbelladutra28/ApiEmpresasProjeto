package com.projeto.empresas.api.services;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.projeto.empresas.api.entity.Usuario;
import com.projeto.empresas.api.repository.UsuarioDAO;

@Service
public class UsuarioService {

	@Autowired
	private UsuarioDAO dao;
	
	
	public Optional<Usuario> findOne(Long id){
		return dao.findById(id);
	}
	
	public List<Usuario> findAll(){
		return dao.findAll();
	}
	
}
