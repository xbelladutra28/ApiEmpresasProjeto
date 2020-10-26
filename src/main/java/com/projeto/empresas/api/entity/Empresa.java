package com.projeto.empresas.api.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.RequiredArgsConstructor;


@AllArgsConstructor
@RequiredArgsConstructor
@EqualsAndHashCode(callSuper = false)
@Data
@Entity
@Table(name="api_emp_empresa")
public class Empresa{
	
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	@Column(name= "emp_cod_empresa", updatable = false, nullable = false)
	private Long id;

	@Column(name="emp_cnpj_empresa")
	private String cnpj;
	
	@Column(name="emp_nome_empresa")
	private String name;
	
	@Column(name="emp_end_empresa")
	private String address;
	
	@Column(name="emp_tipo_empresa")
	private String enterprise_types;
}
