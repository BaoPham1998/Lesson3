import java.io.IOException;
import java.io.PrintWriter;
import java.util.Date;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class HelloWorld extends HttpServlet {
    public void doGet(HttpServletRequest request, HttpServletResponse response)
            throws IOException, ServletException {

        response.setContentType("text/html");
        PrintWriter out = response.getWriter();

        out.println("<html><head><title>Hello Servlet</title></head><body>");
        out.println("<h1>Hello World!</h1>");
        out.println("<p>" + new Date() + "</p>");
        out.println("<p>" + System.getProperty("java.version"));
        out.println("</body></html>");
    }
}