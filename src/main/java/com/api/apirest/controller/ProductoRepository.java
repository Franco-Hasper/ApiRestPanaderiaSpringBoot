package com.api.apirest.controller;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.api.apirest.model.Producto;

@Repository
public interface ProductoRepository extends JpaRepository<Producto,Integer>{

}
