package com.projeto.empresas.api.resources;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.projeto.empresas.api.entity.Usuario;
import com.projeto.empresas.api.services.UsuarioService;

@RestController
@RequestMapping(value="/api/v1/users/auth")
public class UsuarioResource {
	
	@Autowired
	private UsuarioService service;
	
	
	
	@GetMapping(value="/{id}")
	public Optional<Usuario> findOne(@PathVariable Long id){
		Optional<Usuario> usu = service.findOne(id);
		return usu;
	}
	
	@GetMapping
	public List<Usuario> findAll(){
		List<Usuario> listaUsers = service.findAll();
		return listaUsers;
	}
	
	
	
	

}
