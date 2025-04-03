package com.example.mscompras.Entity;

import jakarta.persistence.*;

@Entity
public class Compra {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String producto;
    private String categoria;
    private Double precio;

    public Compra() {}

    public Compra(Long id, String producto, String categoria, Double precio) {
        this.id = id;
        this.producto = producto;
        this.categoria = categoria;
        this.precio = precio;
    }

    public Long getId() { return id; }
    public void setId(Long id) { this.id = id; }
    public String getProducto() { return producto; }
    public void setProducto(String producto) { this.producto = producto; }
    public String getCategoria() { return categoria; }
    public void setCategoria(String categoria) { this.categoria = categoria; }
    public Double getPrecio() { return precio; }
    public void setPrecio(Double precio) { this.precio = precio; }
}