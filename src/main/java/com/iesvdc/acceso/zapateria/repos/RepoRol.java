package com.iesvdc.acceso.zapateria.repos;

import java.util.List;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import com.iesvdc.acceso.zapateria.models.Rol;
import com.iesvdc.acceso.zapateria.models.Usuario;

public interface RepoRol extends JpaRepository<Rol, Long>{

    @Query("SELECT usuario.* FROM usuario, ususario_roles, rol WHERE usuario.id = usuario_roles.usuario_id AND usuario_roles.roles_id=rol.id AND rol.nombre = ?1")
    List<Usuario> finUsersByRol(Rol rol);
}
