package com.projeto.empresas.api.services;

import java.util.Arrays;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.projeto.empresas.api.entity.Empresa;
import com.projeto.empresas.api.entity.Usuario;
import com.projeto.empresas.api.repository.EmpresaDAO;
import com.projeto.empresas.api.repository.UsuarioDAO;
import com.sun.el.parser.ParseException;

@Service
public class DBService {

	@Autowired
	private EmpresaDAO enterpriseRepository;
	
	@Autowired
	private UsuarioDAO userRepository;
	
	//instancia o banco de dados 
	public void instantiateDB() throws ParseException{
		
		Usuario usu1 = new Usuario(null,"joka", "1243");
		Usuario usu2 = new Usuario(null, "owner","222" );
		
		userRepository.saveAll(Arrays.asList(usu1, usu2));
		
		Empresa emp1 = new Empresa(null, "123.456.256/0002-05", "Bella Pizza", "Rua Barbosa 1333", "alimenticio" );
		Empresa emp2 = new Empresa(null, "500.456.456/0008-09", "Zezinho Estiloso", "Rua Presidente Dutra 121", "vestuario");
		Empresa emp3 = new Empresa(null, "400.586.452/0009-08", "Pedro Lamana Ig", "Rua Dom Pedro I, 1212", "Consultoria");
		
		enterpriseRepository.saveAll(Arrays.asList(emp1, emp2, emp3));
		
	}
}
