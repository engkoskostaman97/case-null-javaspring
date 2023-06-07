package com.belajarspringboot.belajardarinol.model;

import lombok.*;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class Hero {

    private  int id;
    private  String name;
    private  int damage;
    private Boolean isNewHero;

}
