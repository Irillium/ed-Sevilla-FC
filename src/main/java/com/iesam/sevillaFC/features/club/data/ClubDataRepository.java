package com.iesam.sevillaFC.features.club.data;

import com.iesam.sevillaFC.features.club.data.local.ClubFileDataSource;
import com.iesam.sevillaFC.features.club.domain.Club;
import com.iesam.sevillaFC.features.club.domain.ClubRepository;

public class ClubDataRepository implements ClubRepository {
    final ClubFileDataSource clubFileDataSource;

    public ClubDataRepository(ClubFileDataSource clubFileDataSource) {
        this.clubFileDataSource = clubFileDataSource;
    }

    public ClubFileDataSource getClubFileDataSource() {
        return clubFileDataSource;
    }

    @Override
    public void save(Club club) {
        clubFileDataSource.save(club);
    }

    @Override
    public Club obtain(String id) {
        return clubFileDataSource.findById(id);
    }
}
