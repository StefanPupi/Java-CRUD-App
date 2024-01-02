/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Models;

import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;

/**
 *
 * @author stefanmilenkovic
 */
public class FizickiServer {
    private String procesor;
    private int ram;
    private String diskovi;
    private int link;
    private String raid;
    private float cena;
    private String datumprodaje = new SimpleDateFormat("dd/MM/yyyy").format(Calendar.getInstance().getTime());

    public String getDatumprodaje() {
        return datumprodaje;
    }    
    
    public float getCena() {
        return cena;
    }

    public void setCena(float cena) {
        this.cena = cena;
    }
    
    public String getProcesor() {
        return procesor;
    }

    public int getRam() {
        return ram;
    }

    public String getDiskovi() {
        return diskovi;
    }

    public int getLink() {
        return link;
    }

    public String getRaid() {
        return raid;
    }

    public void setProcesor(String procesor) {
        this.procesor = procesor;
    }

    public void setRam(int ram) {
        this.ram = ram;
    }

    public void setDiskovi(String diskovi) {
        this.diskovi = diskovi;
    }

    public void setLink(int link) {
        this.link = link;
    }

    public void setRaid(String raid) {
        this.raid = raid;
    }
    
    
}
