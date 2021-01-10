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
	
	@GetMapping("api/prueba")
	public List<Cliente> obtenerCliente(){
		List<Cliente> listaClientes=new ArrayList<>();
		Cliente c=new Cliente();
		c.setId(1);
		c.setNombre("Franco");
		c.setApellido("Hasper");
		c.setCodigo_estado(2);
		c.setCodigo_razon_social(2);
		c.setCodigo_tipo_cliente(2);
		
		Cliente c1=new Cliente();
		c1.setId(2);
		c1.setNombre("Gabriel");
		c1.setApellido("Moraes");
		c1.setCodigo_estado(1);
		c1.setCodigo_razon_social(1);
		c1.setCodigo_tipo_cliente(1);
		
		listaClientes.add(c);
		listaClientes.add(c1);
		
		return listaClientes;
		
	}
	
	
	@PostMapping("api/clientes")
	public Cliente guardarCliente(@RequestBody Cliente cliente) {
		System.out.println(cliente);
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
