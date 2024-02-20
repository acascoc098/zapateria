package com.iesvdc.acceso.zapateria.models;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.ManyToOne;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Data
@NoArgsConstructor
public class Telefono {
    @Id
    private Long numero;
    private int codigoPais;
    @ManyToOne
    Usuario usuario;
}
