package com.iesam.sevillaFC.features.personalContratado.jugador.domain;

import com.iesam.sevillaFC.features.personalContratado.PersonalContratado;

public class Jugador extends PersonalContratado {
    private final String demarcacion;

    public Jugador(String id, String nombre, String apellidos, String fechaNacimiento, String demarcacion) {
        super(id, nombre, apellidos, fechaNacimiento);
        this.demarcacion = demarcacion;
    }

    public String getDemarcacion() {
        return demarcacion;
    }
}
