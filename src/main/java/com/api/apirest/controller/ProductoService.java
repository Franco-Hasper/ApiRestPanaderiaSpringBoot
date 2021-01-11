package com.api.apirest.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.api.apirest.model.Producto;

@Service
public class ProductoService {

	@Autowired
	private ProductoRepository productoRepository;
	
	public void guardar(Producto producto) {
		productoRepository.save(producto);
	}
	
	
	public List<Producto> obtenerTodos(){
		return productoRepository.findAll();
	}
	
	public Producto obtenerProducto(Integer id) {
		return productoRepository.getOne(id);
	}
	
	public void actualizar (Producto producto) {
		productoRepository.save(producto);
	}
	
	public void eliminar(Integer id) {
		productoRepository.deleteById(id);
	}
	
	
}
