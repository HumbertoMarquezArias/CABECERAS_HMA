
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
@WebServlet(name = "HumbertoMarquez_XLS", urlPatterns = {"/HumbertoMarquez_XLS"})
public class HumbertoMarquez_XLS extends HttpServlet {

    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
                response.setContentType("aplication/vn.ms-excel");
                response.setHeader("Content-Disposition","attachment;filename=archivo.xls");
                PrintWriter out = response.getWriter();
                try{
                    out.print("Respuesta Generada desde Excel");
                    out.print("100");
                    out.print("200");
                    out.print("la suma es:\t");
                    out.print("=suma(a2:a3)");
                    
                }finally{
                    out.close();
                }

    }

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {

    }

}
