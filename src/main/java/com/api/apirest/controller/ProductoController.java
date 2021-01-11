package com.api.apirest.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.api.apirest.model.Producto;

@RestController
public class ProductoController {

	@Autowired
	private ProductoService productoService;
	
	@PostMapping("api/productos")
	public Producto producto(@RequestBody Producto producto) {
		productoService.guardar(producto);
		return producto;
	}
	
	@GetMapping("api/productos")
	public List<Producto> obtener(){
		return productoService.obtenerTodos();
	}
	
	@GetMapping("api/productos/{id}")
	public Producto obtenerProducto(@PathVariable("id")Integer id) {
		return productoService.obtenerProducto(id);
	}
	@PutMapping("api/productos")
	public void actualizarProducto(@RequestBody Producto producto) {
		productoService.actualizar(producto);
	}
	@DeleteMapping("api/productos/{id}")
	public void eliminar(@PathVariable("id")Integer id) {
		productoService.eliminar(id);
	}
	
}
