package com.iesam.sevillaFC.features.partido.domain;

import com.iesam.sevillaFC.features.arbitros.Arbitros;
import com.iesam.sevillaFC.features.club.domain.Club;

public class Partido {
    private final String id;
    private final Club clubLocal;
    private final Club clubVisitante;
    private final Arbitros arbitro;
    private final String resultado;
    private final String fechaPartido;

    public Partido(String id, Club clubLocal, Club clubVisitante, Arbitros arbitro, String resultado, String fechaPartido) {
        this.id = id;
        this.clubLocal = clubLocal;
        this.clubVisitante = clubVisitante;
        this.arbitro = arbitro;
        this.resultado = resultado;
        this.fechaPartido = fechaPartido;
    }

    public String getId() {
        return id;
    }

    public Club getClubLocal() {
        return clubLocal;
    }

    public Club getClubVisitante() {
        return clubVisitante;
    }

    public Arbitros getArbitro() {
        return arbitro;
    }

    public String getResultado() {
        return resultado;
    }

    public String getFechaPartido() {
        return fechaPartido;
    }
}
