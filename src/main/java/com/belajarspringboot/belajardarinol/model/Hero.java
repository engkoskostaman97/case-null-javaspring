package com.belajarspringboot.belajardarinol.model;

public class Hero {

    private  int id;

    private  String name;

    private  int damage;

    private Boolean isNewHero;

    public Hero(int id, String name, int damage, Boolean isNewHero) {
        this.id = id;
        this.name = name;
        this.damage = damage;
        this.isNewHero= isNewHero;
    }

    public Hero() {
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getDamage() {
        return damage;
    }

    public void setDamage(int damage) {
        this.damage = damage;
    }

    public Boolean getNewHero() {
        return isNewHero;
    }

    public void setNewHero(Boolean newHero) {
        isNewHero = newHero;
    }
}
