
package nicole.interessimple.servlets;

import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import nicole.interessimple.objects.interesSimpleObject;

@WebServlet(name = "interesSimpleServlet", urlPatterns = {"/interesSimpleServlet"})
public class interesSimpleServlet extends HttpServlet {

    protected void processRequest(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
  
        response.setContentType("text/html;charset=UTF-8");
        try (PrintWriter out = response.getWriter()) {
        
            String strCliente = request.getParameter("cliente");
            String strCapitalInicial = request.getParameter("capitalinicial");
            String strTasaInteres = request.getParameter("tasainteres");
            String strTiempoInversion = request.getParameter("tiempoinversion");
            
            int iCapitalInicial = Integer.parseInt(strCapitalInicial);
            int iTasaInteres = Integer.parseInt(strTasaInteres);
            int iTiempoInversion = Integer.parseInt(strTiempoInversion);
            
            interesSimpleObject interesobject = new interesSimpleObject(strCliente, iCapitalInicial, iTasaInteres, iTiempoInversion);
            
            out.println("<!DOCTYPE html>");
            out.println("<html>");
            out.println("<head>");
            out.println("<title>Servlet interesSimpleServlet</title>");            
            out.println("</head>");
            out.println("<body>");
            out.println("<h1>Servlet interesSimpleServlet at " + request.getContextPath() + "</h1>");
            out.println("<h1>cliente: "+interesobject.getCliente()+"</h1>");
            out.println("<h1>capital inicial:</h1>");
            out.println("<h1>tasa de interes</h1>");
            out.println("<h1>tiempo de inversion</h1>");
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
