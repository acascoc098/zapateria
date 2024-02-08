package com.iesvdc.acceso.zapateria.repos;

import org.springframework.data.jpa.repository.JpaRepository;

import com.iesvdc.acceso.zapateria.models.Localidad;

public interface RepoLocalidad extends JpaRepository<Localidad, Integer>{
    
}
