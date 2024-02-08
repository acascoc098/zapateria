package com.iesvdc.acceso.zapateria.models;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.ManyToOne;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Data
@NoArgsConstructor
public class Direccion {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(length = 25)//Para la longitud de los datos VARCHAR(25)
    private String tipoVia;
    private String nombreVia;
    @Column(length = 10)
    private int numero;
    @Column(length = 20)
    private String planta;
    @ManyToOne
    private Localidad localidad;
}
