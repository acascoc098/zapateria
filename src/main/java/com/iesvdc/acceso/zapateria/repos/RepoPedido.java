package com.iesvdc.acceso.zapateria.repos;

import org.springframework.data.jpa.repository.JpaRepository;

import com.iesvdc.acceso.zapateria.models.Pedido;

public interface RepoPedido extends JpaRepository<Pedido, Long>{
    
}
