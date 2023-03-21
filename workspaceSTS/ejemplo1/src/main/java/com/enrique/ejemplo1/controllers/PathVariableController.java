package com.enrique.ejemplo1.controllers;

import java.util.Map;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/variables")
public class PathVariableController {
	
	@GetMapping({"/index","/","","/home"})
	public String index(Map<String,Object> map) {
		map.put("titulo", "programa de prueba");
		map.put("contenidoh1", "Contenido del H1 en variables");
		return "variables/index";
	}
	
	@GetMapping({"/string/{texto}"})
	public String ver(@PathVariable String texto, Map<String,Object> map) {
		map.put("titulo", "ejemplo variablrd");
		map.put("contenidoh1", "Contenido del path variable" + texto);
		return "variables/ver";
	}
	@GetMapping({"/string/{texto}/{numero}"})
	public String ver(@PathVariable String texto,@PathVariable int numero, Map<String,Object> map) {
		map.put("titulo", "ejemplo variablrd");
		map.put("contenidoh1", "Contenido del path variable" + texto + " con numero valor"+numero);
		return "variables/ver";
	}

}
