package com.iesam.sevillaFC.features.club.domain;

import com.iesam.sevillaFC.features.personalContratado.jugador.domain.Jugador;

public class Club {
    private final String id;
    private final String nombre;
    private final String categoria;
    private final Jugador jugador;

    public Club(String id, String nombre, String categoria, Jugador jugador) {
        this.id = id;
        this.nombre = nombre;
        this.categoria = categoria;
        this.jugador = jugador;
    }

    public String getId() {
        return id;
    }

    public String getNombre() {
        return nombre;
    }

    public String getCategoria() {
        return categoria;
    }

    public Jugador getJugador() {
        return jugador;
    }
}
