package com.projeto.empresas.api.services;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.projeto.empresas.api.entity.Empresa;
import com.projeto.empresas.api.repository.EmpresaDAO;

@Service
public class EmpresaService {

	@Autowired
	private EmpresaDAO dao;
	
	public Optional<Empresa> findOne(Long id) {
	Optional<Empresa> emp = dao.findById(id);
	return emp;
	}
	
	public List<Empresa> findAll(){
         return  dao.findAll();
         
	}
	
	public List<Empresa> findByFilter(String enterprise_types, String name) {
		return dao.findByFilter(enterprise_types, name);
	}

	
}
