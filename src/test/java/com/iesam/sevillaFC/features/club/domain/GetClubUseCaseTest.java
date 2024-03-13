package com.iesam.sevillaFC.features.club.domain;

import com.iesam.sevillaFC.features.club.data.StubClubDataRepository;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class GetClubUseCaseTest {
        GetClubUseCase getClubUseCase;
    @BeforeEach
    void setUp() {
    }
    @Test
    void CuandoObtieneNulloDevuelveNullo(){
        //Given
        getClubUseCase= new GetClubUseCase(new StubClubDataRepository());
        //When
        Club club=getClubUseCase.execute("1");
        //Then
        Assertions.assertNull(club);
    }
    @Test
    void CuandoNoSeaNulo(){
        //Given

        //When

        //Then

    }
    @AfterEach
    void tearDown() {
        getClubUseCase=null;
    }
}