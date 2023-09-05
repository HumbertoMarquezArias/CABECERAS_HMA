
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
@WebServlet(name = "HumbertoMarquez_XML", urlPatterns = {"/HumbertoMarquez_XML"})
public class HumbertoMarquez_XML extends HttpServlet {

    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
                response.setContentType("text/xml;charset=UTF-8");
                PrintWriter out = response.getWriter();
                try{
                    out.print("<?xml version=\"1.0\" encodig=\"UTF-8\"?>");
                    out.print("<CATALOGO>");
                    out.print("<CD>");
                    out.print("<TITULO>Tinta roja</TITULO>");
                    out.print("<ARTISTA>Andres Calamaro</ARTISTA>");
                    out.print("<ORIGEN>AR</ORIGEN>");
                    out.print("<PRECIO>5.90</PRECIO>");
                    out.print("<AÑO>2006</AÑO>");
                    out.print("</CD>");
                    out.print("<CD>");
                    out.print("<TITULO>La Lengua Popular</TITULO>");
                    out.print("<ARTISTA>Andres Calamaro</ARTISTA>");
                    out.print("<ORIGEN>AR</ORIGEN>");
                    out.print("<PRECIO>9.90</PRECIO>");
                    out.print("<AÑO>2007</AÑO>");
                    out.print("/CD");
                    out.print("/CATALOGO");
                    
                }finally{
                    out.close();
                }
    }

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
     
    }


}
