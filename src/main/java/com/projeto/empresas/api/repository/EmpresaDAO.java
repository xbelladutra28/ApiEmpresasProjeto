package com.projeto.empresas.api.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import com.projeto.empresas.api.entity.Empresa;

@Repository
public interface EmpresaDAO extends JpaRepository<Empresa, Long>{

	
	 @Query("FROM Empresa WHERE 1 = 1 AND ( lower(name) LIKE lower(:name) OR :name = '-1' ) AND ( lower(enterprise_types) LIKE lower(:enterprise_types) OR :enterprise_types = '-1' ) ORDER BY name")
	  List<Empresa> findByFilter(String enterprise_types, String name);
}
