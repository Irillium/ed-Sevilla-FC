package com.iesam.sevillaFC.features.personalContratado.entrenadores;

import com.iesam.sevillaFC.features.personalContratado.PersonalContratado;

public class Entrenadores extends PersonalContratado {
    private final String estrategia;

    public Entrenadores(String id, String nombre, String apellidos, String fechaNacimiento, String estrategia) {
        super(id, nombre, apellidos, fechaNacimiento);
        this.estrategia = estrategia;
    }

    public String getEstrategia() {
        return estrategia;
    }
}
