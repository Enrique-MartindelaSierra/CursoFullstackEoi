package com.enrique.springboot.backend.mvc.models.dao;

import org.springframework.data.repository.CrudRepository;

import com.enrique.springboot.backend.mvc.models.entity.Cliente;

public interface IclienteDao extends CrudRepository<Cliente, Long> {
	
	
	
	
}
