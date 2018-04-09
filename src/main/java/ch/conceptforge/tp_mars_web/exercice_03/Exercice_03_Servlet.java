/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ch.conceptforge.tp_mars_web.exercice_03;

import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

/**
 *
 * @author Formation
 */
public class Exercice_03_Servlet extends HttpServlet {

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
        response.setContentType("text/html;charset=UTF-8");
        try (PrintWriter out = response.getWriter()) {
            /* TODO output your page here. You may use following sample code. */
            int h = 0;
            if (request.getParameter("valHauteur") != null) {
                h = Integer.parseInt(request.getParameter("valHauteur"));
            }
            int type = 0;
            if (request.getParameter("typeSapin") != null) {
                type = Integer.parseInt(request.getParameter("typeSapin"));
            }
            if (type == 0) {
                out.println("\nSapin plein de hauteur : " + h + "\n");
                out.println("<br/>");
                for (int i = 1; i < h + 1; i++) {
                    out.println("<br/>");
                    for (int espace = 0; espace < h - i; espace++) {
                        out.print("&ensp;");
                    }
                    for (int etoile = 0; etoile < 2 * i - 1; etoile++) {
                        out.print("*");
                    }
                }
                out.println("<hr/>");
                out.println("\nSapin vide de hauteur : " + h + "\n");
                out.println("<br/>");
                for (int i = 1; i < h + 1; i++) {
                    out.println("<br/>");
                    for (int espace = 0; espace < h - i; espace++) {
                        out.print("&ensp;");
                    }
                    if (i != 1) {
                        out.print("*");
                    }
                    for (int etoile = 0; etoile < 2 * i - 3; etoile++) {
                        if (i == h) {
                            out.print("*");
                        } else {
                            out.print("&ensp;");
                        }
                    }
                    out.print("*");
                }
                out.println("<hr/>");
                out.println("\nSapin couché de hauteur : " + h + "\n");
                out.println("<br/>");
                for (int i = 1; i < h + 2; i++) {
                    for (int etoile = 0; etoile < i - 1; etoile++) {
                        out.print("*");
                    }
                    out.println("<br/>");
                }
                for (int j = h; j > 0; j--) {
                    for (int etoile = 0; etoile < j - 1; etoile++) {
                        out.print("*");
                    }
                    if (j != 1) {
                        out.println("<br/>");
                    }
                }
            }
            if (type == 1) {
                out.println("\nSapin plein de hauteur : " + h + "\n");
                out.println("<br/>");
                for (int i = 1; i < h + 1; i++) {
                    out.println("<br/>");
                    for (int espace = 0; espace < h - i; espace++) {
                        out.print("&ensp;");
                    }
                    for (int etoile = 0; etoile < 2 * i - 1; etoile++) {
                        out.print("*");
                    }
                }
                out.println("<br/>");
            }
            if (type == 2) {
                out.println("\nSapin vide de hauteur : " + h + "\n");
                out.println("<br/>");
                for (int i = 1; i < h + 1; i++) {
                    out.println("<br/>");
                    for (int espace = 0; espace < h - i; espace++) {
                        out.print("&ensp;");
                    }
                    if (i != 1) {
                        out.print("*");
                    }
                    for (int etoile = 0; etoile < 2 * i - 3; etoile++) {
                        if (i == h) {
                            out.print("*");
                        } else {
                            out.print("&ensp;");
                        }
                    }
                    out.print("*");
                }
                out.println("<br/>");
            }
            if (type == 3) {
                out.println("\nSapin couché de hauteur : " + h + "\n");
                out.println("<br/>");
                for (int i = 1; i < h + 2; i++) {
                    for (int etoile = 0; etoile < i - 1; etoile++) {
                        out.print("*");
                    }
                    out.println("<br/>");
                }
                for (int j = h; j > 0; j--) {
                    for (int etoile = 0; etoile < j - 1; etoile++) {
                        out.print("*");
                    }
                    if (j != 1) {
                        out.println("<br/>");
                    }
                }
            }
            out.println("<!DOCTYPE html>");
            out.println("<html>");
            out.println("<head>");
            out.println("<title>Servlet Exercice_03</title>");
            out.println("</head>");
            out.println("<body>");
            out.println("<br/><a href='index.jsp'><< Retour index</a>");
            out.println("</body>");
            out.println("</html>");
        }
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
