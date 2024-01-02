/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/JSP_Servlet/Servlet.java to edit this template
 */
package ServerServlets;

import Liste.Liste;
import Models.FizickiServer;
import Models.FizickoLice;
import Models.PravnoLice;
import java.io.IOException;
import java.io.PrintWriter;
import jakarta.servlet.ServletException;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import java.util.Set;

/**
 *
 * @author stefanmilenkovic
 */
public class AddFizickiServer extends HttpServlet {

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
        
        request.getRequestDispatcher("AddFizickiServer.jsp").forward(request, response);
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
        FizickiServer fs = new FizickiServer();
        fs.setProcesor("Intel i7 3.9Ghz");
        fs.setRam(32);
        fs.setDiskovi("SSD 2");
        fs.setLink(1);
        fs.setRaid("Nema");
        fs.setCena((float) 1999.99);
        fl.fizickiserveri.add(fs);
        
        String sediste = request.getParameter("sediste");
        PravnoLice pl = new PravnoLice();
        for(int i=0;i<Liste.pravnalica.size();i++){
            if(Liste.pravnalica.get(i).getSediste().equals(sediste)){
                pl = Liste.pravnalica.get(i);
                break;
            }
        }
        FizickiServer fs1 = new FizickiServer();
        fs1.setProcesor("Intel i7 3.9Ghz");
        fs1.setRam(32);
        fs1.setDiskovi("SSD 2");
        fs1.setLink(1);
        fs1.setRaid("Nema");
        fs1.setCena((float) 1999.99);
        pl.fizickiserveri.add(fs1);
        
        request.setAttribute("uspesno", "Uspesno ste dodali fizicki server!");
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
