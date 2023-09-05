
package com.emergentes.humbertomarquez_cabeceras;

import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 *
 * @author Marquez
 */
@WebServlet(name = "HumbertoMarquez_HTML", urlPatterns = {"/HumbertoMarquez_HTML"})
public class HumbertoMarquez_HTML extends HttpServlet {

    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
                response.setContentType("text/HTML");
                PrintWriter out = response.getWriter();
                try{
                    out.println("<html>");
                    out.println("<head>");
                    out.println("<title>Respuesta HTML </title>");
                    out.println("</head>");
                    out.println("</body>");
                    out.println("<h1>HTML generado desde un Servlet</h1>");
                    out.println("<a href='index.jsp'> volver</a>");
                    out.println("</body>");
                    out.println("</html>");
                }finally{
                    out.close();
                }
     
    }

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {

    }


}