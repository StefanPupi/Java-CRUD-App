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

/**
 *
 * @author stefanmilenkovic
 */
public class PrikazServeri extends HttpServlet {

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
        String adresa = request.getParameter("adresa");
        String sediste = request.getParameter("sediste");
        for(int i=0;i<Liste.fizickalica.size();i++){
            if(Liste.fizickalica.get(i).getAdresa().equals(adresa)){
                request.setAttribute("fl", Liste.fizickalica.get(i));
                request.setAttribute("fs", Liste.fizickalica.get(i).fizickiserveri);
                request.setAttribute("vs", Liste.fizickalica.get(i).virtuelniserveri);
                request.setAttribute("adr", adresa);
                break;
            }
        }
        for(int i=0;i<Liste.pravnalica.size();i++){
            if(Liste.pravnalica.get(i).getSediste().equals(sediste)){
                request.setAttribute("pl", Liste.pravnalica.get(i));
                request.setAttribute("fs", Liste.pravnalica.get(i).fizickiserveri);
                request.setAttribute("vs", Liste.pravnalica.get(i).virtuelniserveri);
                request.setAttribute("sed", sediste);
                break;
            }
        }
        
        
        request.getRequestDispatcher("PrikazServeri.jsp").forward(request, response);
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
