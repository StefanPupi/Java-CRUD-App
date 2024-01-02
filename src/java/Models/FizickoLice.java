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
public class FizickoLice {
    private String ime;
    private String prezime;
    private String adresa;
    public static ArrayList<FizickiServer> fizickiserveri = new ArrayList<>();
    public static ArrayList<VirtuelniServer> virtuelniserveri = new ArrayList<>();

    public String getIme() {
        return ime;
    }

    public String getPrezime() {
        return prezime;
    }

    public String getAdresa() {
        return adresa;
    }

    public void setIme(String ime) {
        this.ime = ime;
    }

    public void setPrezime(String prezime) {
        this.prezime = prezime;
    }

    public void setAdresa(String adresa) {
        this.adresa = adresa;
    }
    
    
}
