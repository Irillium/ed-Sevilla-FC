package com.iesam.sevillaFC.features.club.domain;

public interface ClubRepository {
     void save(Club club);
     Club obtain(String id);
}
