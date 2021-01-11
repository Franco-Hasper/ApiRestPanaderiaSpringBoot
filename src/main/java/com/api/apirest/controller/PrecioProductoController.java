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

import com.api.apirest.model.PrecioProducto;
import com.api.apirest.model.Producto;

@RestController
public class PrecioProductoController {
	@Autowired
	private PrecioProductoService precioproductoService;
	
	@PostMapping("api/precioproductos")
	public PrecioProducto precioproducto(@RequestBody PrecioProducto precioproducto) {
		precioproductoService.guardar(precioproducto);
		return precioproducto;
	}
	
	@GetMapping("api/precioproductos")
	public List<PrecioProducto> obtener(){
		return precioproductoService.obtenerTodos();
	}
	
	@GetMapping("api/precioproductos/{id}")
	public PrecioProducto obtenerPrecioProducto(@PathVariable("id")Integer id) {
		return precioproductoService.obtenerPrecioProducto(id);
	}
	@PutMapping("api/precioproductos")
	public void actualizarPrecioProducto(@RequestBody PrecioProducto precioproducto) {
		precioproductoService.actualizar(precioproducto);
	}
	@DeleteMapping("api/precioproductos/{id}")
	public void eliminar(@PathVariable("id")Integer id) {
		precioproductoService.eliminar(id);
	}
}
