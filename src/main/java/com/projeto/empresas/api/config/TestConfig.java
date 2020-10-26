package com.projeto.empresas.api.config;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Profile;

import com.projeto.empresas.api.services.DBService;
import com.sun.el.parser.ParseException;

@Configuration
@Profile("test")
public class TestConfig {

	
	@Autowired
	private DBService dbService;
	
	@Bean
	public Boolean instantiateDB() throws ParseException{
		dbService.instantiateDB();
		return true;	
	}
}
