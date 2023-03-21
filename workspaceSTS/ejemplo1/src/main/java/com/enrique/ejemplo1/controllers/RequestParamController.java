package com.enrique.ejemplo1.controllers;

import java.util.Map;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
@RequestMapping("/params")
public class RequestParamController {

	
	@GetMapping({"/index","/","","/home"})
	public String index(Map<String,Object> map) {
		map.put("titulo", "programa de prueba");
		map.put("contenidoh1", "Contenido del H1 en param");
		return "params/index";
	}

	@GetMapping({"/string"})
	public String ver(@RequestParam(name="texto",required=false, defaultValue="texto por defecto") String texto, Map<String,Object> map) {
		map.put("titulo", "programa de prueba");
		map.put("contenidoh1", "Contenido del H1 en param"+ texto);
		return "params/string";
	}
	@GetMapping({"/dosp"})
	public String dosp(@RequestParam String param1, @RequestParam String param2,  Map<String,Object> map) {
		map.put("titulo", "programa de prueba");
		map.put("contenidoh1", "Contenido del H1 en param"+ param1 +"y el segundo" + param2);
		return "params/dosp";
	}
}

