package com.api.apirest.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.api.apirest.model.PrecioProducto;
import com.api.apirest.model.Producto;

@Service
public class PrecioProductoService {
	@Autowired
	private PrecioProductoRepository precioproductoRepository;
	
	public void guardar(PrecioProducto precioproducto) {
		precioproductoRepository.save(precioproducto);
	}
	
	
	public List<PrecioProducto> obtenerTodos(){
		return precioproductoRepository.findAll();
	}
	
	public PrecioProducto obtenerPrecioProducto(Integer id) {
		return precioproductoRepository.getOne(id);
	}
	
	public void actualizar (PrecioProducto precioproducto) {
		precioproductoRepository.save(precioproducto);
	}
	
	public void eliminar(Integer id) {
		precioproductoRepository.deleteById(id);
	}
}
