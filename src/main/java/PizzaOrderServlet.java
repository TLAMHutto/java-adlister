import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

@WebServlet(name = "PizzaOrderServlet", urlPatterns = "/pizza-order")
public class PizzaOrderServlet extends HttpServlet {
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws IOException {
        response.setContentType("text/html");
        response.getWriter().println("<html><body>");
        response.getWriter().println("<h1>Pizza Order</h1>");
        response.getWriter().println("<form action=\"pizza-order\" method=\"post\">");
        response.getWriter().println("<label>Pizza size:</label>");
        response.getWriter().println("<select name=\"size\">");
        response.getWriter().println("<option value=\"small\">Small</option>");
        response.getWriter().println("<option value=\"medium\">Medium</option>");
        response.getWriter().println("<option value=\"large\">Large</option>");
        response.getWriter().println("<input type=\"submit\" value=\"Order\">");
        response.getWriter().println("</select>");
        response.getWriter().println("<label>Pizza toppings:</label>");
        response.getWriter().println("<input type=\"checkbox\" name=\"toppings\" value=\"cheese\">Cheese");
        response.getWriter().println("<input type=\"checkbox\" name=\"toppings\" value=\"pepperoni\">Pepperoni");
        response.getWriter().println("<input type=\"checkbox\" name=\"toppings\" value=\"mushrooms\">Mushrooms");
        response.getWriter().println("<input type=\"checkbox\" name=\"toppings\" value=\"onions\">Onions");
        response.getWriter().println("<input type=\"checkbox\" name=\"toppings\" value=\"sausage\">Sausage");
        response.getWriter().println("<input type=\"checkbox\" name=\"toppings\" value=\"bacon\">Bacon");
        response.getWriter().println("<input type=\"checkbox\" name=\"toppings\" value=\"pineapple\">Pineapple");
        response.getWriter().println("<input type=\"checkbox\" name=\"toppings\" value=\"extra cheese\">Extra Cheese");
        response.getWriter().println("<input type=\"checkbox\" name=\"toppings\" value=\"extra sauce\">Extra Sauce");
        response.getWriter().println("<input type=\"checkbox\" name=\"toppings\" value=\"extra bacon\">Extra Bacon");
        response.getWriter().println("<input type=\"checkbox\" name=\"toppings\" value=\"extra pineapple\">Extra Pineapple");
        response.getWriter().println("<label>Pizza crust:</label>");
        response.getWriter().println("<input type=\"radio\" name=\"crust\" value=\"thin\">Thin");
        response.getWriter().println("<input type=\"radio\" name=\"crust\" value=\"thick\">Thick");
        response.getWriter().println("<input type=\"radio\" name=\"crust\" value=\"pan\">Pan");
        response.getWriter().println("<input type=\"radio\" name=\"crust\" value=\"stuffed\">Stuffed");
        response.getWriter().println("<input type=\"radio\" name=\"crust\" value=\"deep dish\">Deep Dish");
        response.getWriter().println("<label>Enter your name:</label>");
        response.getWriter().println("<input type=\"text\" name=\"name\">");
        response.getWriter().println("<label>Enter delivery address:</label>");
        response.getWriter().println("<input type=\"text\" name=\"address\">");
        response.getWriter().println("<label>Enter delivery phone number:</label>");
        response.getWriter().println("<input type=\"text\" name=\"phone\">");
        response.getWriter().println("<input type=\"submit\" value=\"Order\">");
        response.getWriter().println("</form>");
        response.getWriter().println("<h1>Summary</h1>");
        response.getWriter().println("<p>Pizza size: " + request.getParameter("size") + "</p>");
        response.getWriter().println("<p>Pizza crust: " + request.getParameter("crust") + "</p>");
        response.getWriter().println("<p>Pizza toppings: ");
        String[] toppings = request.getParameterValues("toppings");
        for (String topping : toppings) {
            response.getWriter().println(topping + " ");
        }
        response.getWriter().println("</p>");
        response.getWriter().println("<p>Name: " + request.getParameter("name") + "</p>");
        response.getWriter().println("<p>Address: " + request.getParameter("address") + "</p>");
        response.getWriter().println("<p>Phone: " + request.getParameter("phone") + "</p>");
        response.getWriter().println("</form>");
        response.getWriter().println("</body></html>");


    }
}