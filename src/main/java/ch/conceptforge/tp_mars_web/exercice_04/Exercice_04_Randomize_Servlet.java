/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ch.conceptforge.tp_mars_web.exercice_04;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.List;
import java.util.Random;
import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

/**
 *
 * @author Formation
 */
public class Exercice_04_Randomize_Servlet extends HttpServlet {

    static final Random random = new Random();
    static List<Integer> listRandom = new ArrayList<>();
    static List<Integer> listCoups = new ArrayList<>();
    static List<Integer> listScore = new ArrayList<>();

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

            if (request.getParameter("nouvellePartie") != null) {
                listRandom.clear();
                listCoups.clear();
            }
            if (request.getParameter("clearScore") != null) {
                listRandom.clear();
                listScore.clear();
            }

            int x = 0;
            while (x == 0) {
                x = random.nextInt(100);
            }
            listRandom.add(x);
            int r = 0;
            r = listRandom.get(0);

            int n = 0;
            if (request.getParameter("nbSaisi") != null) {
                n = Integer.parseInt(request.getParameter("nbSaisi"));
            }

            String inf = "";
            String sup = "";
            String egal = "";
            int compteur = 0;
            int meilleurScore = 0;
            listCoups.add(compteur);
            if (n > 0 && n <= 100) {
                compteur += listCoups.get(0);
                compteur++;
                listCoups.clear();
                listCoups.add(compteur);
                if (n > r) {
                    inf = "Le nombre à trouver est plus petit.";
                }
                if (n < r) {
                    sup = "Le nombre à trouver est plus grand.";
                }
                if (n == r) {
                    egal = "Vous avez trouvé le nombre !";
                    listScore.add(compteur);
                    int valtemp = listScore.get(0);
                    for (Integer id : listScore) {
                        if (valtemp > id) {
                            valtemp = id;
                        }
                    }
                    meilleurScore = valtemp;
                }
            }

            HttpSession session = request.getSession(true);
            session.setAttribute("nbRandom", r);
            session.setAttribute("nbInf", inf);
            session.setAttribute("nbSup", sup);
            session.setAttribute("nbEgal", egal);
            session.setAttribute("nbCoups", compteur);
            session.setAttribute("meilleurScore", meilleurScore);
            RequestDispatcher rd = request.getRequestDispatcher("exercice_04.jsp");
            rd.forward(request, response);

            out.println("<!DOCTYPE html>");
            out.println("<html>");
            out.println("<head>");
            out.println("<title>Servlet Exercice_04</title>");
            out.println("</head>");
            out.println("<body>");
            out.println("<h1>Servlet Exercice_04 at " + request.getContextPath() + "</h1>");
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
