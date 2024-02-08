package com.iesvdc.acceso.zapateria.models;

import java.time.LocalDate;

import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
public class Pedido {
    private int id;
    private Usuario usuario;
    private Usuario operario;
    private Direccion direccion;
    private Telefono telefono;
    private LocalDate fecha;

}
