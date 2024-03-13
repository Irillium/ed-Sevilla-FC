package com.iesam.sevillaFC.features.partido.domain;

public class AddPartidoUseCase {
    PartidoRepository partidoRepository;

    public AddPartidoUseCase(PartidoRepository partidoRepository) {
        this.partidoRepository = partidoRepository;
    }
    void execute(Partido partido){
        partidoRepository.save(partido);
    }
}
