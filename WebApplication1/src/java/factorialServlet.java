
import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
/**
 *
 * @author ronys
 */
@WebServlet("/factorial")
public class factorialServlet extends HttpServlet {

    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/OverriddenMethodBody

        try {
            Integer numero = Integer.valueOf(req.getParameter("numero"));
            Integer resultado = metodos.factorial(numero);

            try (PrintWriter out = resp.getWriter()) {
                out.println("<!DOCTYPE html>");
                out.println("<html>");
                out.println("<head>");
                out.println("<title>TODO supply a title</title>");
                out.println("<meta charset=\"UTF-8\">");
                out.println("<meta name=\"viewport\" content=\"width=device-width, initial-scale=1.0\">");
                out.println("<link rel=\"stylesheet\" href=\"styles2.css\">");
                out.println("</head>");
                out.println("<body>");
                out.println("<div class=\"wrapper\">");

                out.println("<div class=\"checkout_container\">");
                out.println("<div class=\"menu\"> ");

                out.println("<a href=\"punto2.html\" > Volver </a>");
                out.println("</div>");
                out.println("<h3> el numero es  " + resultado + "</h3>");

                out.println("</div>");
                out.println("</div>");
                out.println("</body>");
                out.println("</html>\n");
            }

        } catch (NumberFormatException e) {
            try (PrintWriter out = resp.getWriter()) {
                out.println("<!DOCTYPE html>");
                out.println("<html>");
                out.println("<head>");
                out.println("<title>TODO supply a title</title>");
                out.println("<meta charset=\"UTF-8\">");
                out.println("<meta name=\"viewport\" content=\"width=device-width, initial-scale=1.0\">");
                out.println("<link rel=\"stylesheet\" href=\"styles2.css\">");
                out.println("</head>");
                out.println("<body>");
                out.println("<div class=\"wrapper\">");

                out.println("<div class=\"checkout_container\">");
                out.println("<div class=\"menu\"> ");

                out.println("<a href=\"punto2.html\" > Volver </a>");
                out.println("</div>");
                out.println("<h3>  Ingresa un numero  </h3>");

                out.println("</div>");
                out.println("</div>");
                out.println("</body>");
                out.println("</html>\n");

            }

        }

    }

}
