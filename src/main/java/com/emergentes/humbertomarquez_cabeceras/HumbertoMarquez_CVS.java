
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
@WebServlet(name = "HumbertoMarquez_CVS", urlPatterns = {"/HumbertoMarquez_CVS"})
public class HumbertoMarquez_CVS extends HttpServlet {

    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
                response.setContentType("aplication/cvs");
                response.setHeader("Content-Disposition", "attachment;filename=archivo.cvs");
                PrintWriter out = response.getWriter();
                try{
                    out.println("id;Nombre:Apellido;edad");
                    out.println("1;Humberto;Marquez;21");
                    out.println("2;Bruno;Diaz;18");
                    out.println("3;Armando;Mesa;30");
                    out.println("<a href='index.jsp'> volver</a>");
                }finally{
                    out.close();
                }
    }

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
 
    }


}
