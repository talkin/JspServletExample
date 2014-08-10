package servlet;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import java.io.IOException;

public class servletDemo extends HttpServlet{

    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException,IOException {
        HttpSession session = request.getSession();
        AccountBean account = new AccountBean();
        String userName = request.getParameter("userName");
        String password = request.getParameter("password");

        account.setUserName(userName);
        account.setPassword(password);

        if (account.isValid()) {
            session.setAttribute("userName",userName);
            response.sendRedirect("profile.jsp");
        } else {
            response.sendRedirect("fail.jsp");
        }

    }

    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        doGet(request, response);
    }
}
