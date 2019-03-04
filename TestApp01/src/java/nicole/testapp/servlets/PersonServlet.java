package nicole.testapp.servlets;

import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import nicole.testapp.objects.PersonObj;

/**
 *
 * @author Nicole
 */
@WebServlet(name = "PersonServlet", urlPatterns = {"/PersonServlet"})
public class PersonServlet extends HttpServlet {

    protected void processRequest(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {



        response.setContentType("text/html;charset=UTF-8");
        try (PrintWriter out = response.getWriter()) 
        {
            
            String strName = request.getParameter("name");
            String strLastName = request.getParameter("lastname");
            String strAge = request.getParameter("age");
            String strCharge = request.getParameter("charge");
            String strSalary = request.getParameter("salary");
            
            int iAge = Integer.parseInt(strAge);
            double dSalary = Double.parseDouble(strSalary);
            
            PersonObj person = new PersonObj(strName, strLastName, iAge, strCharge, dSalary);
            
            out.println("<!DOCTYPE html>");
            out.println("<html>");
            out.println("<head>");
            out.println("<title>Servlet PersonServlet</title>");            
            out.println("</head>");
            out.println("<body>");
            out.println("<h1>Servlet PersonServlet at " + request.getContextPath() + " </h1>");
            out.println("<h1>name: "+person.getName()+" </h1>");
            out.println("<h1>Last Name: "+person.getLastName()+" </h1>");
            out.println("<h1>Age: "+person.getAge()+" </h1>");
            out.println("<h1>Charge:"+person.getCharge()+" </h1>");
            out.println("<h1>Salary:"+person.getSalary()+" </h1>");
            out.println("<h1>Year Salary: "+person.getYearSalary()+" </h1>");
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
