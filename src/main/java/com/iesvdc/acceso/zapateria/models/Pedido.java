package com.iesvdc.acceso.zapateria.models;

import java.time.LocalDate;

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
public class Pedido {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    @ManyToOne
    private Usuario cliete;
    @ManyToOne
    private Usuario operario;
    @ManyToOne
    private Direccion direccion;
    @ManyToOne
    private Telefono telefono;
    private LocalDate fecha;
    
    /*Si no le pnemos esto mejor, m+as óptimo y más rápido
    @OnetoMany
    private Lis<ProductoPedido> detallePedido
     */

}
