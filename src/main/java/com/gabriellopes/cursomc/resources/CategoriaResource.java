package com.gabriellopes.cursomc.resources;

import java.util.ArrayList;
import java.util.List;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.gabriellopes.cursomc.domain.Categoria;

@RestController
@RequestMapping(value= "/categorias")
public class CategoriaResource {
	
	@RequestMapping(method = RequestMethod.GET)
	public List<Categoria> Teste() {
		
		Categoria cat1 = new Categoria(1, "informatica");
		Categoria cat2 = new Categoria(2, "escritorio");

		List<Categoria> listaCategorias = new ArrayList<>();
		listaCategorias.add(cat1);
		listaCategorias.add(cat2);		
		return listaCategorias;
	}
	

}
