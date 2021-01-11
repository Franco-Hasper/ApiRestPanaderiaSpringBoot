package com.api.apirest.controller;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.api.apirest.model.PrecioProducto;
import com.api.apirest.model.Producto;

@Repository
public interface PrecioProductoRepository  extends JpaRepository<PrecioProducto,Integer>{

}
