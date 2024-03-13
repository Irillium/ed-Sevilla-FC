package com.iesam.sevillaFC.features.personalContratado.jugador.domain;

import java.util.ArrayList;

public class GetJugadoresUseCase {
    JugadorRepository jugadorRepository;

    public GetJugadoresUseCase(JugadorRepository jugadorRepository) {
        this.jugadorRepository = jugadorRepository;
    }
    ArrayList<Jugador> execute(){
       return jugadorRepository.obtainAll();
    }
}
