package com.iesam.sevillaFC.features.arbitros;

public class Arbitros {
    private final String id;
    private final String nombre;
    private final String apellidos;
    private final String fechaNacimiento;
    private final String categoria;

    public Arbitros(String id, String nombre, String apellidos, String fechaNacimiento, String categoria) {
        this.id = id;
        this.nombre = nombre;
        this.apellidos = apellidos;
        this.fechaNacimiento = fechaNacimiento;
        this.categoria = categoria;
    }

    public String getId() {
        return id;
    }

    public String getNombre() {
        return nombre;
    }

    public String getApellidos() {
        return apellidos;
    }

    public String getFechaNacimiento() {
        return fechaNacimiento;
    }

    public String getCategoria() {
        return categoria;
    }
}
