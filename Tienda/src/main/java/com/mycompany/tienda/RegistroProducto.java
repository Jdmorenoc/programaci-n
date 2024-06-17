package com.mycompany.tienda;

public class RegistroProducto {
    private String nombre;
    private Categoria categoria;
    private double precio;
    private int cantidad;

    public RegistroProducto(String nombre, Categoria categoria, double precio, int cantidad) {
        this.nombre = nombre;
        this.categoria = categoria;
        this.precio = precio;
        this.cantidad = cantidad;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public Categoria getCategoria() {
        return categoria;
    }

    public void setCategoria(Categoria categoria) {
        this.categoria = categoria;
    }

    public double getPrecio() {
        return precio;
    }

    public void setPrecio(double precio) {
        this.precio = precio;
    }

    public int getCantidad() {
        return cantidad;
    }

    public void setCantidad(int cantidad) {
        this.cantidad = cantidad;
    }

    @Override
    public String toString() {
    return "RegistroProducto{" + "nombre=" + nombre + ", categoria=" + categoria + ", precio=" + precio + ", cantidad=" + cantidad + '}';
}

    
    
}
