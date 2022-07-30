/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controller;

import dal.PetDAO;
import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import model.Category;
import model.Pet;

/**
 *
 * @author DUC THINH
 */
public class AddServlet extends HttpServlet {

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
            out.println("<!DOCTYPE html>");
            out.println("<html>");
            out.println("<head>");
            out.println("<title>Servlet AddServlet</title>");
            out.println("</head>");
            out.println("<body>");
            out.println("<h1>Servlet AddServlet at " + request.getContextPath() + "</h1>");
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
        request.getRequestDispatcher("add.jsp").forward(request, response);
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
        request.setCharacterEncoding("UTF-8");
        String id_raw = request.getParameter("pet_id");
        String petName = request.getParameter("pet_name");
        String petColor = request.getParameter("pet_color");
        String petSex = request.getParameter("pet_sex");
        String petAge = request.getParameter("pet_age");
        String petPrice_raw = request.getParameter("pet_price");
        String petImg = request.getParameter("pet_img");
        String quantity_raw = request.getParameter("quantity");
        String cateID_raw = request.getParameter("category");
        int petId, petPrice, cateID, quantity;
        Category c = new Category();
 
        try {
            petId = Integer.parseInt(id_raw);
            petPrice = Integer.parseInt(petPrice_raw);
            quantity = Integer.parseInt(quantity_raw);
            cateID = Integer.parseInt(cateID_raw);
            c.setCateID(cateID);
            PetDAO pd = new PetDAO();           
            if (pd.getPetByID(petId) != null) {
                request.setAttribute("error", "invalid id = " + petId);
                request.getRequestDispatcher("add.jsp").forward(request, response);
            } else {
                Pet p = new Pet(petId, petName, petColor, petSex, petAge, petPrice, petImg, quantity, c);
                pd.insert(p);
                response.sendRedirect("listpet");
            }

        } catch (NumberFormatException ex) {
            System.out.println(ex);
        }
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
