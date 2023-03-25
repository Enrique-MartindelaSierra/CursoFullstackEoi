package com.enrique.springboot.backend.mvc.controllers;

import java.time.LocalDate;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestController;

import com.enrique.springboot.backend.mvc.models.entity.Cliente;
import com.enrique.springboot.backend.mvc.models.services.IclienteService;

@CrossOrigin(origins={"*"}) // permite a cualquier aplicacion acceder a los datos
@RestController
@RequestMapping("/api")
public class ClienteRestController {
	
	@Autowired
	private IclienteService clienteService;
	
	@GetMapping("/clientes") //json de todos los clientes
	public List<Cliente> index(){
		return clienteService.findAll();
	}
	
	@GetMapping("/clientes/{id}") //json de un cliente
	public Cliente show(@PathVariable Long id){
		return clienteService.findById(id);
	}
	
	@DeleteMapping("/clientes/{id}")
	public void delete(@PathVariable Long id) {
		clienteService.delete(id);
	}
	
	@PostMapping("/clientes") //inserta un cliente
	@ResponseStatus(HttpStatus.CREATED)
	public Cliente create(@RequestBody Cliente cliente){
		cliente.setCreateAt(LocalDate.now()); // le pongo la fecha de creacion de hoy
		return clienteService.save(cliente);
	}
	
	@PutMapping("/clientes/{id}") //inserta un cliente
	@ResponseStatus(HttpStatus.CREATED)
	public Cliente update(@RequestBody Cliente cliente, @PathVariable Long id){
		Cliente clienteActualizar=clienteService.findById(id);
		clienteActualizar.setNombre(cliente.getNombre());
		clienteActualizar.setApellido(cliente.getApellido());
		clienteActualizar.setEmail(cliente.getEmail());
		return clienteService.save(clienteActualizar);
	}
	
	
}
