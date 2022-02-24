package com.example.apifridgigo.Entity.Zutaten;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
@Table (name = "zutaten")

public class zutat {
    private int kid;
    private String name;
    private String menge;
    private String mengenangabe;
    private int rezeptid;
    
    public zutat() {

    }

    public zutat (int kid, String name, String menge, String mengenangabe, int rezeptid) {
        this.kid = kid;
        this.name = name;
        this.menge = menge;
        this.mengenangabe = mengenangabe;
        this.rezeptid = rezeptid;
    }

    @Id
    @GeneratedValue (strategy = GenerationType.IDENTITY)
    public int getKid() {
        return kid;
    }
    public int getrezeptid() {
        return rezeptid;
    }
    public String getname() {
        return name;
    }
    
    public String getmenge() {
        return menge;
    }

    public String getmengenangabe() {
        return mengenangabe;
    }

    
}
