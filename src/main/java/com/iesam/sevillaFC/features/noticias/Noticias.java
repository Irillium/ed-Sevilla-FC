package com.iesam.sevillaFC.features.noticias;

public class Noticias {
    private final String id;
    private final String titulo;
    private final String descripcion;

    public Noticias(String id, String titulo, String descripcion) {
        this.id = id;
        this.titulo = titulo;
        this.descripcion = descripcion;
    }

    public String getId() {
        return id;
    }

    public String getTitulo() {
        return titulo;
    }

    public String getDescripcion() {
        return descripcion;
    }
}
