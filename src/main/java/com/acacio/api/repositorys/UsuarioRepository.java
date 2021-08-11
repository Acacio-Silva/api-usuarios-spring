package com.acacio.api.repositorys;

import org.springframework.data.jpa.repository.JpaRepository;

import com.acacio.api.domain.Usuario;

public interface UsuarioRepository extends JpaRepository<Usuario, Integer>{

}
