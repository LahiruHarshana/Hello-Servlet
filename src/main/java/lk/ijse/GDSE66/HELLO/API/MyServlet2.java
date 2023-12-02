package lk.ijse.GDSE66.HELLO.API;

import javax.servlet.ServletConfig;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
public class MyServlet2 extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        System.out.println("My Servlet 2");
        ServletConfig sc = getServletConfig();
        String city = sc.getInitParameter("city");
        System.out.println(city);
    }
}
