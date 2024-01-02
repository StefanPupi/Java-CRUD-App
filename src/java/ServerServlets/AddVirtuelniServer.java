/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/JSP_Servlet/Servlet.java to edit this template
 */
package ServerServlets;

import Liste.Liste;
import Models.FizickoLice;
import Models.PravnoLice;
import Models.VirtuelniServer;
import java.io.IOException;
import java.io.PrintWriter;
import jakarta.servlet.ServletException;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import java.text.ParseException;
import java.util.Set;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author stefanmilenkovic
 */
public class AddVirtuelniServer extends HttpServlet {

    /**
     * Processes requests for both HTTP <code>GET</code> and <code>POST</code>
     * methods.
     *
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
    protected void processRequest(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        request.getRequestDispatcher("AddVirtuelniServer.jsp").forward(request, response);
    }

    // <editor-fold defaultstate="collapsed" desc="HttpServlet methods. Click on the + sign on the left to edit the code.">
    /**
     * Handles the HTTP <code>GET</code> method.
     *
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        processRequest(request, response);
    }

    /**
     * Handles the HTTP <code>POST</code> method.
     *
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        String adresa = request.getParameter("adresa");
        FizickoLice fl = new FizickoLice();
        for(int i=0;i<Liste.fizickalica.size();i++){
            if(Liste.fizickalica.get(i).getAdresa().equals(adresa)){
                fl = Liste.fizickalica.get(i);
                break;
            }
        }
        VirtuelniServer vs = new VirtuelniServer();
        String placanje = request.getParameter("naplata");
        String ciklus="";
        float popust=0;
        switch (placanje){
            case "1": ciklus="Mesecno"; break;
            case "4": ciklus="Kvartalno"; popust=(float) 0.05; break;
            case "6": ciklus="Pola godine"; popust=(float) 0.1; break;
            case "12": ciklus="Godisnji"; popust=(float) 0.20; break;
        }
        vs.setPlacanje(ciklus);
        vs.setSistem(request.getParameter("sistem"));
        vs.setJezgra(2+Integer.parseInt(request.getParameter("cpu")));
        vs.setRam(4+Integer.parseInt(request.getParameter("ram")));
        vs.setDisk(50+Integer.parseInt(request.getParameter("disk")));
        vs.setProtok(10+Integer.parseInt(request.getParameter("protok")));
        float cenabezpopusta = (7+Integer.parseInt(request.getParameter("cpu"))+Integer.parseInt(request.getParameter("ram"))+Integer.parseInt(request.getParameter("disk"))+Integer.parseInt(request.getParameter("protok")))*Float.parseFloat(request.getParameter("naplata"));
        float konacnacena = cenabezpopusta - (cenabezpopusta*popust);
        vs.setCena(cenabezpopusta);
        try {
            vs.krajnjiDatum();
        } catch (ParseException ex) {
            Logger.getLogger(AddVirtuelniServer.class.getName()).log(Level.SEVERE, null, ex);
        }
        fl.virtuelniserveri.add(vs);
        
        String sediste = request.getParameter("sediste");
        PravnoLice pl = new PravnoLice();
        for(int i=0;i<Liste.pravnalica.size();i++){
            if(Liste.pravnalica.get(i).getSediste().equals(adresa)){
                pl = Liste.pravnalica.get(i);
                break;
            }
        }
        VirtuelniServer vs1 = new VirtuelniServer();
        String placanje1 = request.getParameter("naplata");
        String ciklus1="";
        float popust1=0;
        switch (placanje){
            case "1": ciklus1="Mesecno"; break;
            case "4": ciklus1="Kvartalno"; popust1=(float) 0.05; break;
            case "6": ciklus1="Pola godine"; popust1=(float) 0.1; break;
            case "12": ciklus1="Godisnji"; popust1=(float) 0.20; break;
        }
        vs1.setPlacanje(ciklus);
        vs1.setSistem(request.getParameter("sistem"));
        vs1.setJezgra(2+Integer.parseInt(request.getParameter("cpu")));
        vs1.setRam(4+Integer.parseInt(request.getParameter("ram")));
        vs1.setDisk(50+Integer.parseInt(request.getParameter("disk")));
        vs1.setProtok(10+Integer.parseInt(request.getParameter("protok")));
        float cenabezpopusta1 = (7+Integer.parseInt(request.getParameter("cpu"))+Integer.parseInt(request.getParameter("ram"))+Integer.parseInt(request.getParameter("disk"))+Integer.parseInt(request.getParameter("protok")))*Float.parseFloat(request.getParameter("naplata"));
        float konacnacena1 = cenabezpopusta1 - (cenabezpopusta1*popust1);
        vs1.setCena(konacnacena1);
        try {
            vs1.krajnjiDatum();
        } catch (ParseException ex) {
            Logger.getLogger(AddVirtuelniServer.class.getName()).log(Level.SEVERE, null, ex);
        }
        pl.virtuelniserveri.add(vs1);
        request.setAttribute("uspesno", "Uspesno ste dodali virtuelni server korisniku");   
        processRequest(request, response);
    }

    /**
     * Returns a short description of the servlet.
     *
     * @return a String containing servlet description
     */
    @Override
    public String getServletInfo() {
        return "Short description";
    }// </editor-fold>

}
