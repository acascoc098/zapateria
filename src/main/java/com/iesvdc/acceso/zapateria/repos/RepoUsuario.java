package com.iesvdc.acceso.zapateria.repos;

import org.springframework.data.jpa.repository.JpaRepository;

import com.iesvdc.acceso.zapateria.models.Usuario;

public interface RepoUsuario extends JpaRepository<Usuario, Long>{
    
}
