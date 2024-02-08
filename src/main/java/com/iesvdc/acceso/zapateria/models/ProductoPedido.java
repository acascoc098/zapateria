package com.iesvdc.acceso.zapateria.models;

import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
public class ProductoPedido {
    private int id;
    private Pedido pedido;
    private Producto producto;
    private int cantidad;
    private float precio;

}
