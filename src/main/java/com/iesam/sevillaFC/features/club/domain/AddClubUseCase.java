package com.iesam.sevillaFC.features.club.domain;

public class AddClubUseCase {
    ClubRepository clubRepository;

    public AddClubUseCase(ClubRepository clubRepository) {
        this.clubRepository = clubRepository;
    }
    void execute(Club club){
        clubRepository.save(club);
    }
}
