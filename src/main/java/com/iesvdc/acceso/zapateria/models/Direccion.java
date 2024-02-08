package com.iesvdc.acceso.zapateria.models;

import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
public class Direccion {
    private int id;
    private String tipoVia;
    private String nombreVia;
    private int numero;
    private String planta;
    private Localidad localidad;
}
