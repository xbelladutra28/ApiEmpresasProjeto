package com.projeto.empresas.api.resources;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.projeto.empresas.api.entity.Empresa;
import com.projeto.empresas.api.services.EmpresaService;

@RestController
@RequestMapping(value="/api/v1/enterprises")
public class EmpresaResource {

	@Autowired
	private EmpresaService service;
	
	@GetMapping(value="/{id}")
	public Optional<Empresa> findOne(@PathVariable Long id){
		Optional<Empresa> emp = service.findOne(id);
		return emp;
		
	}
	
	@GetMapping(value="/show")
	public List<Empresa> findAll(){
		List<Empresa> lista = service.findAll();
		return lista;
	}
	
	
	  @GetMapping(value="/{enterprise_types}/{name}")
		public List<Empresa> findByFilter(@PathVariable String enterprise_types, @PathVariable String name) {
			return service.findByFilter(enterprise_types, name);
		}
	
	
}
