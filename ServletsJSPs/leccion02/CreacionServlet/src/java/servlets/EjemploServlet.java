package servlets;

import java.io.*;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.*;

@WebServlet(name = "EjemploServlet", urlPatterns = {"/EjemploServlet"})
public class EjemploServlet extends HttpServlet {

    @Override
    public void doGet(HttpServletRequest request, HttpServletResponse response) throws IOException {
        PrintWriter out = response.getWriter();
        out.println("<html>");
        out.println("<head>");
        out.println("<title>Servlet Ejemplo</title>");
        out.println("</head>");
        out.println("<body>");
        out.println("<h1>respuesta desde un servlet</h1>");
        out.println("</body>");
        out.println("</html>");
        out.close();
    }
}
