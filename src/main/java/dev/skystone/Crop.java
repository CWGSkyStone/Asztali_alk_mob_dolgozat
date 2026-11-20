/*
* File: Crop.java
* Author: Szabó József
* Copyright: 2026, Szabó József
* Group: Szoft II-N
* Date: 2026-11-20
* Github: https://github.com/CWGSkyStone213/
* Licenc: MIT
*/

package dev.skystone;

public class Crop {
    Integer id;
    String name;
    Boolean forage;
    Integer quantity;

    public Crop() {}
    
    public Crop(String name, Boolean forage, Integer quantity) {
        this.name = name;
        this.forage = forage;
        this.quantity = quantity;
    }
    
    public Crop(Integer id, String name, Boolean forage, Integer quantity) {
        this.id = id;
        this.name = name;
        this.forage = forage;
        this.quantity = quantity;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Boolean getForage() {
        return forage;
    }

    public void setForage(Boolean forage) {
        this.forage = forage;
    }

    public Integer getQuantity() {
        return quantity;
    }

    public void setQuantity(Integer quantity) {
        this.quantity = quantity;
    }
    
    
}
