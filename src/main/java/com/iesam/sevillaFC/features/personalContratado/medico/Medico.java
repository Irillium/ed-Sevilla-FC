package com.iesam.sevillaFC.features.personalContratado.medico;

import com.iesam.sevillaFC.features.personalContratado.PersonalContratado;

public class Medico extends PersonalContratado {
    private final String especialidad;

    public Medico(String id, String nombre, String apellidos, String fechaNacimiento, String especialidad) {
        super(id, nombre, apellidos, fechaNacimiento);
        this.especialidad = especialidad;
    }

    public String getEspecialidad() {
        return especialidad;
    }
}
