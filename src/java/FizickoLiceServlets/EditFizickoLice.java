/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/JSP_Servlet/Servlet.java to edit this template
 */
package FizickoLiceServlets;

import Liste.Liste;
import Models.FizickoLice;
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
public class EditFizickoLice extends HttpServlet {

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
        FizickoLice fl = new FizickoLice();
        for(int i=0;i<Liste.fizickalica.size();i++){
            if(Liste.fizickalica.get(i).getAdresa().equals(adresa)){
                fl = Liste.fizickalica.get(i);
                break;
            }
        }
        request.setAttribute("fizickolice", fl);
        request.getRequestDispatcher("EditFizickoLice.jsp").forward(request, response);
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
        for(int i=0;i<Liste.fizickalica.size();i++){
            if(Liste.fizickalica.get(i).getAdresa().equals(adresa)){
                Liste.fizickalica.get(i).setIme(request.getParameter("ime"));
                Liste.fizickalica.get(i).setPrezime(request.getParameter("prezime"));
                Liste.fizickalica.get(i).setAdresa(request.getParameter("adresa"));
                break;
            }
        }
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
