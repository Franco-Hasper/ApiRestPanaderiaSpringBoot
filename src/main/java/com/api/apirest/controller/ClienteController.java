package com.api.apirest.controller;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.api.apirest.model.Cliente;

@RestController
public class ClienteController {

	@Autowired
	private ClienteService clienteService;
	
	@PostMapping("api/clientes")
	public Cliente guardarCliente(@RequestBody Cliente cliente) {
		clienteService.guardar(cliente);
		return cliente;
	}
	
	@GetMapping("api/clientes")
	public List<Cliente> obtener(){
		return clienteService.obtenerTodos();
	}
	
	@GetMapping("api/clientes/{id}")
	public Cliente obtenerCliente(@PathVariable("id")Integer id) {
		return clienteService.obtenerCliente(id);
	}
	@PutMapping("api/clientes")
	public void actualizarCliente(@RequestBody Cliente cliente) {
		clienteService.actualizar(cliente);
	}
	@DeleteMapping("api/clientes/{id}")
	public void eliminar(@PathVariable("id")Integer id) {
		clienteService.eliminar(id);
	}
	
}
