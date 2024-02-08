package com.iesvdc.acceso.zapateria.repos;

import org.springframework.data.jpa.repository.JpaRepository;

import com.iesvdc.acceso.zapateria.models.Categoria;

public interface RepoCategoria extends JpaRepository<Categoria, Long>{
    
}
