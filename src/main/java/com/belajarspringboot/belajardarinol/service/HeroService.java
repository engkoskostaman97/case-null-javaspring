package com.belajarspringboot.belajardarinol.service;

import com.belajarspringboot.belajardarinol.model.Hero;

import java.util.List;

public interface HeroService {
    List<Hero> daftarHero();
    Hero tambahHero(Hero request);
    Boolean updateHero(Hero request, Integer id);
    Boolean deleteHero(Integer id);
    Boolean ubahStatus(Integer id, Boolean isNewHero);
}
