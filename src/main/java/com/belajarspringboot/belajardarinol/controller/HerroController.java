package com.belajarspringboot.belajardarinol.controller;

import com.belajarspringboot.belajardarinol.model.Hero;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/hero")
public class HerroController {
    public List<Hero> heros = new ArrayList<>();
    public Integer counter=1;

    @GetMapping("/daftar-hero")
    public List<Hero> daftarHero(){

//        heros.add(new Hero(1, "persib", 100));
//        heros.add(new Hero(2,"persija", 90));
//        heros.add(new Hero(3,"persija", 80));
        return  heros ;
    }

    @PostMapping("/addhero")
    public Hero tambahdatahero(@RequestBody Hero request){
        request.setId(counter);
        heros.add(request);
        counter++;
        return request;
    }

    @PutMapping("/ubah/{id}")
    public Boolean updateHero(@RequestBody Hero request, @PathVariable Integer id){
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
    @DeleteMapping("/hapus/{id}")
    public Boolean deleteHero(@PathVariable Integer id){
        final Optional<Hero> result = heros.stream().filter(hero -> hero.getId() == id).findFirst();
        if (result.isPresent()){
            heros.remove(result.get());
            return  true;
        }else{
            return  false;
        }
    }

}
