/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/JSP_Servlet/Servlet.java to edit this template
 */
package Administracija;

import Liste.Liste;
import Models.FizickiServer;
import Models.FizickoLice;
import Models.PravnoLice;
import Models.VirtuelniServer;
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
public class PrikazPoslovanja extends HttpServlet {

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
        request.setAttribute("fizickalica", Liste.fizickalica);
        request.setAttribute("pravnalica", Liste.pravnalica);
        
        float ukupno = 0;
        
        for(FizickoLice fl : Liste.fizickalica){
            for(FizickiServer fs : fl.fizickiserveri){
                ukupno+=fs.getCena();
            }
            for(VirtuelniServer vs : fl.virtuelniserveri){
                ukupno+=vs.getCena();
            }
        }
        for(PravnoLice pl : Liste.pravnalica){
            for(FizickiServer fs : pl.fizickiserveri){
                ukupno+=fs.getCena();
            }
            for(VirtuelniServer vs : pl.virtuelniserveri){
                ukupno+=vs.getCena();
            }
        }
         request.setAttribute("ukupnacena", ukupno);
        request.getRequestDispatcher("PrikazPoslovanja.jsp").forward(request, response);
        
        /*
        <!-- comment 
               <c:forEach items="${fizickalica}" var="fizickolice"  varStatus="loop">  
                   <c:forEach items="${fizickalica.fizickiserveri}" var="fizickiserver"  varStatus="loop">
                        <tr>
                           <td>${loop.index+1}</td>
                           <td>${fizickalica.ime}</td>
                           <td>${fizickalica.prezime}</td>
                           <td>Fizicki server</td>
                           <td>$${fizickiserver.cena}</td>
                        </tr>
                    </c:forEach>
                    <c:forEach items="${fizickalica.virtuelniserveri}" var="virtuelniserver"  varStatus="loop">
                        <tr>
                           <td>${loop.index+1}</td>
                           <td>${fizickalica.ime}</td>
                           <td>${fizickalica.prezime}</td>
                           <td>Fizicki server</td>
                           <td>$${virtuelniserver.cena}</td>
                        </tr>
                    </c:forEach>
               </c:forEach>
                  -->*/
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
