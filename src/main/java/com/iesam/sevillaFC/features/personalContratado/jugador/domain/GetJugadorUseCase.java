package com.iesam.sevillaFC.features.personalContratado.jugador.domain;

public class GetJugadorUseCase {
    JugadorRepository jugadorRepository;

    public GetJugadorUseCase(JugadorRepository jugadorRepository) {
        this.jugadorRepository = jugadorRepository;
    }
    Jugador execute(String id){
        return jugadorRepository.obtainOne(id);
    }
}
