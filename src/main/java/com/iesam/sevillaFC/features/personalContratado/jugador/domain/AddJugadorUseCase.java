package com.iesam.sevillaFC.features.personalContratado.jugador.domain;

public class AddJugadorUseCase {
    JugadorRepository jugadorRepository;

    public AddJugadorUseCase(JugadorRepository jugadorRepository) {
        this.jugadorRepository = jugadorRepository;
    }
    void execute(Jugador jugador){
        jugadorRepository.save(jugador);
    }
}
