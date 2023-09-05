
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
@WebServlet(name = "HumbertoMarquez_JSON", urlPatterns = {"/HumbertoMarquez_JSON"})
public class HumbertoMarquez_JSON extends HttpServlet {

    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
                response.setContentType("aplication/json");
                PrintWriter out = response.getWriter();
                try{
                    out.print("{\"empleado\":[");
                    out.print("{\"nombre\":\"Bruno\",\"apellidos\":\"Diaz\"},");
                    out.print("{\"nombre\":\"Juan Jose\",\"apellidos\":\"Paredes\"},");
                    out.print("{\"nombre\":\"Dolores\",\"apellidos\":\"Fuertes\"},");
                    out.print("]}");
                    
                }finally{
                    out.close();
                }
       
    }

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
 
    }


}
