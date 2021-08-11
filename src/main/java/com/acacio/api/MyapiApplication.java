package com.acacio.api;

import java.util.Arrays;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.acacio.api.domain.Usuario;
import com.acacio.api.repositorys.UsuarioRepository;

@SpringBootApplication
public class MyapiApplication implements CommandLineRunner{
	
	@Autowired
	private UsuarioRepository usuarioRepository;
	
	public static void main(String[] args) {
		SpringApplication.run(MyapiApplication.class, args);
	}

	@Override
	public void run(String... args) throws Exception {

		Usuario u1 = new Usuario(null, "acacio", "acacio@gmail.com", "1234");
		Usuario u2 = new Usuario(null, "francisco", "francisco@gmail.com", "1234");
		Usuario u3 = new Usuario(null, "Maria", "Maria@gmail.com", "1234");
		Usuario u4 = new Usuario(null, "Aparecida", "Aparecida@gmail.com", "1234");
		Usuario u5 = new Usuario(null, "Pedro", "Pedro@gmail.com", "1234");
		
		usuarioRepository.saveAll(Arrays.asList(u1,u2, u3, u4, u5));
		
		
	}

}
