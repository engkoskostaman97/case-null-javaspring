package com.belajarspringboot.belajardarinol.service;

import com.belajarspringboot.belajardarinol.model.Hero;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;
@Service
public class HeroServiceImpl implements HeroService{
    public List<Hero> heros = new ArrayList<>();
    public Integer counter=1;
    @Override
    public List<Hero> daftarHero() {
        return  heros ;
    }

    @Override
    public Hero tambahHero(Hero request) {
        request.setId(counter);
        heros.add(request);
        counter++;
        return request;
    }

    @Override
    public Boolean updateHero(Hero request, Integer id) {
        final Optional<Hero> result = heros.stream().filter(hero -> hero.getId() == id).findFirst();
        if( result.isPresent()){
            //jika ada/ketemu lakukan upodate
            result.get().setName(request.getName());
            result.get().setDamage(request.getDamage());
            return  true;
        }else{
            return false;
        }
    }

    @Override
    public Boolean deleteHero(Integer id) {
        final Optional<Hero> result = heros.stream().filter(hero -> hero.getId() == id).findFirst();
        if (result.isPresent()){
            heros.remove(result.get());
            return  true;
        }else{
            return  false;
        }
    }

    @Override
    public Boolean ubahStatus(Integer id, Boolean isNewHero) {
        final Optional<Hero> result = heros.stream().filter(hero -> hero.getId() == id).findFirst();
        if (result.isPresent()){
            result.get().setIsNewHero(isNewHero);
            return true;
        }else{
            return  false;
        }
    }
}
