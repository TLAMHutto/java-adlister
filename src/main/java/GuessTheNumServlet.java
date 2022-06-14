import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

@WebServlet(name = "GuessTheNumServlet", urlPatterns = "/guess")
public class GuessTheNumServlet extends HttpServlet {
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws IOException {
        response.getWriter().println("<h1>Guess the correct number</h1>");
        response.getWriter().println("<form method=\"get\">");
        //1 - 3 radio buttons
        response.getWriter().println("<input type=\"radio\" name=\"number\" value=\"1\">1<br>");
        response.getWriter().println("<input type=\"radio\" name=\"number\" value=\"2\">2<br>");
        response.getWriter().println("<input type=\"radio\" name=\"number\" value=\"3\">3<br>");
        //submit button
        response.getWriter().println("<input type=\"submit\" value=\"Submit\">");
        response.getWriter().println("</form>");
        if (request.getParameter("number").equals("1")) {
            response.sendRedirect("/correct");
        } else if (request.getParameter("number").equals("2")) {
            response.sendRedirect("/wrong");
        } else if (request.getParameter("number").equals("3")) {
            response.sendRedirect("/wrong");
        }


    }
}