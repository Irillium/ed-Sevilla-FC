package com.iesam.sevillaFC.features.partido.domain;

public interface PartidoRepository {
    void save(Partido partido);
    Partido obtain(String id);
}
