package com.api.apirest.controller;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.api.apirest.model.Cliente;

@Repository
public interface ClienteRepository extends JpaRepository<Cliente,Integer>{

}
