import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

@WebServlet(name = "PickColorServlet", urlPatterns = "/pick-color")
public class PickColorServlet extends HttpServlet {
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws IOException {
        response.getWriter().println("<h1>Pick a color</h1>");
        response.getWriter().println("<form action=\"/view-color\" method=\"post\">");
        response.getWriter().println("<input type=\"radio\" name=\"color\" value=\"red\">Red<br>");
        response.getWriter().println("<input type=\"radio\" name=\"color\" value=\"green\">Green<br>");
        response.getWriter().println("<input type=\"radio\" name=\"color\" value=\"blue\">Blue<br>");
        response.getWriter().println("<input type=\"submit\" value=\"Submit\">");
        response.getWriter().println("</form>");
    }
}


