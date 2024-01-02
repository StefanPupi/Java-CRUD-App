/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Models;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;

/**
 *
 * @author stefanmilenkovic
 */
public class VirtuelniServer {
    private String placanje;
    private String sistem;
    private int jezgra;
    private int ram;
    private int disk;
    private int protok;
    private String pocetak=new SimpleDateFormat("dd/MM/yyyy").format(Calendar.getInstance().getTime());
    private String kraj;
    private float cena;

    public float getCena() {
        return cena;
    }

    public void setCena(float cena) {
        this.cena = cena;
    }
    
    public void krajnjiDatum() throws ParseException{
        SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");
        Calendar c = Calendar.getInstance();
        c.setTime(sdf.parse(this.pocetak));
        c.add(Calendar.DATE,365);
        this.kraj=sdf.format(c.getTime());
    }

    public String getPocetak() {
        return pocetak;
    }

    public String getKraj() {
        return kraj;
    }

    public String getPlacanje() {
        return placanje;
    }

    public String getSistem() {
        return sistem;
    }

    public int getJezgra() {
        return jezgra;
    }

    public int getRam() {
        return ram;
    }

    public int getDisk() {
        return disk;
    }

    public int getProtok() {
        return protok;
    }

    public void setPlacanje(String placanje) {
        this.placanje = placanje;
    }

    public void setSistem(String sistem) {
        this.sistem = sistem;
    }

    public void setJezgra(int jezgra) {
        this.jezgra = jezgra;
    }

    public void setRam(int ram) {
        this.ram = ram;
    }

    public void setDisk(int disk) {
        this.disk = disk;
    }

    public void setProtok(int protok) {
        this.protok = protok;
    }
    
    
}
