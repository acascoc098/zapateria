package com.iesvdc.acceso.zapateria.models;

import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
public class Localidad {
    private int cp;
    private String municipio;
    private String provincia;
}
