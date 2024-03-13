package com.iesam.sevillaFC.features.personalContratado.jugador.domain;

import java.util.ArrayList;

public interface JugadorRepository {
     void save(Jugador jugador);
    ArrayList<Jugador> obtainAll();
    Jugador obtainOne(String id);
}
