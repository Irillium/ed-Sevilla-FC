package com.iesam.sevillaFC.features.partido.domain;

public class GetPartidoUseCase {
    PartidoRepository partidoRepository;

    public GetPartidoUseCase(PartidoRepository partidoRepository) {
        this.partidoRepository = partidoRepository;
    }
    public Partido execute(String id){
        return partidoRepository.obtain(id);
    }

}
