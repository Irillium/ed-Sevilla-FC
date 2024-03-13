package com.iesam.sevillaFC.features.club.domain;

public class GetClubUseCase {
    ClubRepository clubRepository;

    public GetClubUseCase(ClubRepository clubRepository) {
        this.clubRepository = clubRepository;
    }
    Club execute(String id){
        return clubRepository.obtain(id);
    }
}
