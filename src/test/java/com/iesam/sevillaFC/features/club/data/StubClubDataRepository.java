package com.iesam.sevillaFC.features.club.data;

import com.iesam.sevillaFC.features.club.domain.Club;
import com.iesam.sevillaFC.features.club.domain.ClubRepository;

public class StubClubDataRepository implements ClubRepository {
    @Override
    public void save(Club club) {

    }

    @Override
    public Club obtain(String id) {
        return null;
    }
}
