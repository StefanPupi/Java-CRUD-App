/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Models;

import java.util.ArrayList;

/**
 *
 * @author stefanmilenkovic
 */
public class PravnoLice {
    private String naziv;
    private String sediste;
    private String ime;
    private String prezime;
    public static ArrayList<FizickiServer> fizickiserveri = new ArrayList<>();
    public static ArrayList<VirtuelniServer> virtuelniserveri = new ArrayList<>();

    public String getNaziv() {
        return naziv;
    }

    public String getSediste() {
        return sediste;
    }

    public String getIme() {
        return ime;
    }

    public String getPrezime() {
        return prezime;
    }

    public void setNaziv(String naziv) {
        this.naziv = naziv;
    }

    public void setSediste(String sediste) {
        this.sediste = sediste;
    }

    public void setIme(String ime) {
        this.ime = ime;
    }

    public void setPrezime(String prezime) {
        this.prezime = prezime;
    }
    
    
}
