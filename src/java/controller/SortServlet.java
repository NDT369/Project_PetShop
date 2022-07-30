/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controller;

import dal.PetDAO;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.List;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import model.Pet;

/**
 *
 * @author DUC THINH
 */
public class SortServlet extends HttpServlet {

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
            out.println("<title>Servlet SortServlet</title>");            
            out.println("</head>");
            out.println("<body>");
            out.println("<h1>Servlet SortServlet at " + request.getContextPath() + "</h1>");
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
//        PetDAO pd = new PetDAO();
//        List<Pet> list = pd.getPetOrderDesc();
//        request.setAttribute("data", list);
//        request.getRequestDispatcher("shop.jsp").forward(request, response);
        String s = request.getParameter("s");
        boolean check;
        if(s.equals("desc")){
            check = true;
        }else{
            check = false;
        }
        PetDAO pd = new PetDAO();
        List<Pet> list1 = pd.getPetOrder(check);
        int page, numPerPage = 9;
        int size = list1.size();
        int num = (size%9==0?(size/9):((size/9)+1));
        String xPage = request.getParameter("page");
        if(xPage == null){
            page = 1;
        }else{
            page = Integer.parseInt(xPage);
        }
        int start, end;
        start = (page-1)*9;
        end = Math.min(page*numPerPage, size);
        List<Pet> list = pd.getListByPage(list1, start, end);
        request.setAttribute("data", list);
        request.setAttribute("pages", page);
        if(check == true){
            request.setAttribute("numdesc", num);
        }else{
            request.setAttribute("numasc", num);
        }
        request.getRequestDispatcher("shop.jsp").forward(request, response);
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
