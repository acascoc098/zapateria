package com.iesvdc.acceso.zapateria.repos;

import org.springframework.data.jpa.repository.JpaRepository;

import com.iesvdc.acceso.zapateria.models.Producto;

public interface RepoProducto extends JpaRepository<Producto, Long>{
    
}
