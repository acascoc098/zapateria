package com.iesvdc.acceso.zapateria.models;

import java.util.List;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToMany;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.OneToMany;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Data
@NoArgsConstructor
public class Usuario {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(length = 50)
    private String nombre;
    private String apellido;
    @Column(length = 100)
    private String email;
    @Column(length = 25)
    private String username;
    @Column(length = 65)
    private String password;
    @ManyToOne
    private Telefono telefono;
    @ManyToMany
    private List<Rol> roles;
      
    @OneToMany
    @JoinColumn(name = "usuario_id")
    List<Telefono> telefonos;
    @OneToMany
    @JoinColumn(name = "usuario_id")
    List<Direccion> direcciones;

}
