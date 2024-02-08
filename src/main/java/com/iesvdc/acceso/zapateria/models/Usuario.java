package com.iesvdc.acceso.zapateria.models;

import java.util.List;

import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
public class Usuario {
    private int id;
    private String nombre;
    private String apellido;
    private Direccion direc;
    private String email;
    private String username;
    private String password;
    private Telefono telefono;
    private List<Rol> roles;

}
