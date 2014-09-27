package com.github.dwiyatci.serpong;

import javax.servlet.annotation.WebServlet;
import java.io.IOException;
import java.io.PrintWriter;

/**
 * Created by Glenn on 2014-09-27.
 */
@WebServlet("/HelloWorld")
public class HelloWorld extends javax.servlet.http.HttpServlet {
    protected void doPost(javax.servlet.http.HttpServletRequest request,
                          javax.servlet.http.HttpServletResponse response)
            throws javax.servlet.ServletException, IOException {

    }

    protected void doGet(javax.servlet.http.HttpServletRequest request,
                         javax.servlet.http.HttpServletResponse response)
            throws javax.servlet.ServletException, IOException {

        PrintWriter out = response.getWriter();

        out.println("<html>");
        out.println("<b>Hello World</b>");
        out.println("</html>");
    }
}
