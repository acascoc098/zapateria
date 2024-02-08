package com.iesvdc.acceso.zapateria.repos;

import org.springframework.data.jpa.repository.JpaRepository;

import com.iesvdc.acceso.zapateria.models.ProductoPedido;

public interface RepoProductoPedido extends JpaRepository<ProductoPedido, Long>{
    
}
