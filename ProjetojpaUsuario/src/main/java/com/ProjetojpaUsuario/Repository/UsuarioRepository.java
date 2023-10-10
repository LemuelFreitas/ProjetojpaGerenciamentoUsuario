package com.ProjetojpaUsuario.Repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.ProjetojpaUsuario.entities.Usuario;

public interface UsuarioRepository extends JpaRepository<Usuario, Long> {
	
	// Nenhuma implementação é necessária. Spring Data JPA cuidará disso.
}