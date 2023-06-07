package com.belajarspringboot.belajardarinol.controller;

import com.belajarspringboot.belajardarinol.model.Hero;
import com.belajarspringboot.belajardarinol.service.HeroService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;


@RestController
@RequestMapping("/hero")
public class HerroController {

    @Autowired
    HeroService heroService;

    @GetMapping("/daftar-hero")
    public List<Hero> daftarHero(){
        return heroService.daftarHero();
    }

    @PostMapping("/addhero")
    public Hero tambahHero(@RequestBody Hero request){
        return  heroService.tambahHero(request);
    }

    @PutMapping("/ubah/{id}")
    public Boolean updateHero(@RequestBody Hero request, @PathVariable Integer id){
       return  heroService.updateHero(request, id);

    }
    @DeleteMapping("/hapus/{id}")
    public Boolean deleteHero(@PathVariable Integer id){
      return  heroService.deleteHero(id);
    }

    @PatchMapping ("/ubah-status/{id}")
    public  Boolean ubahStatus(@PathVariable Integer id , @RequestParam Boolean isNewHero){
     return  heroService.ubahStatus(id, isNewHero);
    }

}
