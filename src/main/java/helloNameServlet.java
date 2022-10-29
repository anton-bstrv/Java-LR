import jakarta.servlet.*;
import jakarta.servlet.http.*;
import jakarta.servlet.annotation.*;

import java.io.IOException;
import java.io.PrintWriter;

@WebServlet(name = "helloNameServlet", value = "/helloName")
public class helloNameServlet extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        PrintWriter pw = response.getWriter();

        pw.println("<html>");
        pw.println("<form action='helloName' method='POST'>\n" +
                "        <h1>Enter a name: </h1>\n" +
                "        <input type='text' name='name'>\n" +
                "        <button type='submit'>Enter</button>\n" +
                "    </form>");
        pw.println("</html>");
    }

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        String name = request.getParameter("name");

        PrintWriter pw = response.getWriter();

        pw.println("<html>");
        pw.println("<h1>Hello, " + name + "!</h1>");
        pw.println("</html>");
    }
}
