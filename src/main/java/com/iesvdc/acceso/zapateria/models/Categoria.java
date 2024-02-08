package com.iesvdc.acceso.zapateria.models;

import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
public class Categoria {
    private int id;
    private String nombre;
    private Categoria padre;
}
