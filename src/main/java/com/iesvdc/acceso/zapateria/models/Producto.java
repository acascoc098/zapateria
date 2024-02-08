package com.iesvdc.acceso.zapateria.models;

import java.util.List;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
public class Producto {
    private int id;
    private String nombre;
    private String descripcion;
    private float precio;
    private List<Categoria> categorias;
}