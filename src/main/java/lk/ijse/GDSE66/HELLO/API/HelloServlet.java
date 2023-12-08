package lk.ijse.GDSE66.HELLO.API;


import javax.servlet.ServletConfig;
import javax.servlet.ServletContext;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

public class HelloServlet extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
//        System.out.println("Hello Servlet");
//        resp.getWriter().println("<h1>Hello Servlet</h1>");
//        ServletConfig config = getServletConfig();
//        String city = config.getInitParameter("city");
//        System.out.println(city);

        ServletContext context = getServletContext();
        String username = context.getInitParameter("userName");
        System.out.println(username);
    }

}
