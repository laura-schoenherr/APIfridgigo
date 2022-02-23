package com.example.apifridgigo.Entity.Kategorien;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
@Table(name = "kategorien")


public class kategorie {
    private String kid;
    private int rezeptid;
    
    public kategorie() {
    }
    public kategorie( int rezeptid, String kid) {
        this.kid = kid;
        this.rezeptid = rezeptid;
    }
   
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    public String getKid() {
        return kid;
    }

    public int getRezeptid() {
        return rezeptid;
    }

}
