package com.edrocha.cursomc.resources;

import java.util.ArrayList;
import java.util.List;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.edrocha.cursomc.domain.Categoria;

@RestController
@RequestMapping(value ="/categorias")
public class CategoriaResource {
	
	@RequestMapping(method=RequestMethod.GET)
	public List<Categoria> listar() {
		Categoria ca1 = new Categoria(1,"Informatica");
		Categoria ca2 = new Categoria(1,"Escritório");
		
		List<Categoria> lista = new ArrayList<>();
		lista.add(ca1);
		lista.add(ca2);
		
		
		return lista;
	}

}
