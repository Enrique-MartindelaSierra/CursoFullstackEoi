package com.enrique.ejemplo1.controllers;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import com.enrique.ejemplo1.entities.Usuario;

@Controller
@RequestMapping("/app")
public class IndexController {

//	@GetMapping({"/index","/","","/home"})
//	public String index(Model model) {
//		model.addAttribute("titulo", "programa de prueba");
//		return "index";
//	}
	
	@GetMapping({"/index","/","","/home"})
	public String index(Map<String,Object> map) {
		map.put("titulo", "programa de prueba");
		map.put("contenidoh1", "Contenido del H1");
		return "index";
	}
	
	
	@GetMapping({"/index2"})
	public String index2(Map<String,Object> map) {
		map.put("titulo", "otra prueba");
		map.put("contenidoh2", "Contenido del H2");
		return "index2";
	}
	
	
	@GetMapping({"/perfil"})
	public String perfil(Model model) {
		model.addAttribute("titulo", "perfil del usuario");
		model.addAttribute("usuario",new Usuario("Enrique","Martín de la Sierra", "enriquemdlse22@gmail.com"));
		return "perfil";
	}
	@GetMapping({"/list"})
	public String list(Model model) {
		List<Usuario> usuarios = new ArrayList<Usuario>();
		model.addAttribute("titulo", "perfil del usuario");
		usuarios.add(new Usuario("Enrique","Martín de la Sierra", "enriquemdlse22@gmail.com"));
		usuarios.add(new Usuario("fran","Martín de la Sierra", "blablabla.com"));
		usuarios.add(new Usuario("david","Martín de la Sierra", "bliblibli.com"));

		model.addAttribute("titulo", "Lista de usuarios");
		model.addAttribute("usuarios",usuarios);
		return "list";
	}
	
	
}
