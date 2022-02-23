package com.example.apifridgigo.Entity.Rezepte;

import javax.annotation.Generated;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.xml.bind.annotation.XmlID;

@Entity
@Table(name = "REZEPT_TABELLE")


public class Rezept {
    
    private int rezeptid;
    private String name;
    private String beschreibung;
    private int zeit;
    private String enname;
    private int portionen;

    public Rezept() {
    }

    public Rezept(int rezeptid, String name, String beschreibung, int zeit String enname, String portionen){
        this.rezeptid = id;
        this.name = name;
        this.beschreibung = beschreibung;
        this.zeit = zeit;
        this.enname = enname;
        this.portionen = portionen;
    }
    @ID
    @GeneratedValue (strategy = GenerationType.IDENTITY)
    public int getId()  {
        return rezeptid;
    }
    public String getName()  {
        return name;
    }
    public String getBeschreibung (){
        return beschreibung;
    }


}
