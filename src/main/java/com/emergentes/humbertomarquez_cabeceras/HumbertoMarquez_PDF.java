
package com.emergentes.humbertomarquez_cabeceras;

import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
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
@WebServlet(name = "HumbertoMarquez_PDF", urlPatterns = {"/HumbertoMarquez_PDF"})
public class HumbertoMarquez_PDF extends HttpServlet {


    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
      
        response.setContentType("application/pdf");
        response.setHeader("Content-Disposition", "attachment; filename=Tema_1.pdf");

        try (InputStream in = getServletContext().getResourceAsStream("C:/Users/Marquez/Downloads/Tema_1.pdf");
                OutputStream out = response.getOutputStream();
                BufferedInputStream bin = new BufferedInputStream(in);
                BufferedOutputStream bout = new BufferedOutputStream(out)) {

            byte[] buffer = new byte[8192];
            int length;
            while ((length = bin.read(buffer)) > 0) {
                bout.write(buffer, 0, length);
            }
        } catch (IOException e) {
        }
        
    }

 
    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
      
    }


}
