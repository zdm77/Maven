package app.servlets;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

public class ListProducts extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
       /* PrintWriter writer = resp.getWriter();
        writer.println("Method GET from AddServlet");*/
        RequestDispatcher requestDispatcher = req.getRequestDispatcher("views/products.jsp");
        requestDispatcher.forward(req, resp);
    }
}
