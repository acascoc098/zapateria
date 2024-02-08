package com.iesvdc.acceso.zapateria.models;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Data
@NoArgsConstructor
public class Localidad {
    @Id
    private Integer cp;
    @Column(length = 50)
    private String municipio;
    @Column(length = 25)
    private String provincia;
}
