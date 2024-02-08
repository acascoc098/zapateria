package com.iesvdc.acceso.zapateria.models;


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
public class ProductoPedido {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    @ManyToOne//No creaba la BBDD por tener aquí Any en vez de One
    private Pedido pedido;
    @ManyToOne
    private Producto producto;
    private int cantidad;
    private float precio;

}
