package com.iesvdc.acceso.zapateria.repos;

import org.springframework.data.jpa.repository.JpaRepository;

import com.iesvdc.acceso.zapateria.models.Telefono;

public interface RepoTelefono extends JpaRepository<Telefono, Long>{
    
}
