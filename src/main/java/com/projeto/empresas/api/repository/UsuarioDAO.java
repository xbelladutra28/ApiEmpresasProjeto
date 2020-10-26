package com.projeto.empresas.api.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.projeto.empresas.api.entity.Usuario;

@Repository
public interface UsuarioDAO extends JpaRepository<Usuario, Long>{

   

}
