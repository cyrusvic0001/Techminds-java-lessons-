//
// Source code recreated from a .class file by IntelliJ IDEA
// (powered by FernFlower decompiler)
//

package webserver;

import jakarta.servlet.ServletException;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;

public final class Login extends HttpServlet {
    public Login() {
    }

    public void doGet(HttpServletRequest req, HttpServletResponse res) throws IOException, ServletException {
        res.setContentType("text/html");
        PrintWriter out = res.getWriter();
        out.println("html");
        out.println("<h1>Login</h1>");
        String name = req.getParameter("username");
        out.println("<h1>Hello, " + name + "!</h1>");
    }

    public void doPost(HttpServletRequest req, HttpServletResponse res) throws IOException, ServletException {
        res.setContentType("text/html");
        PrintWriter out = res.getWriter();
        out.println("html");
        out.println("<h1>Login</h1>");
        String name = req.getParameter("username");
        out.println("<h1>Hello, " + name + "!</h1>");
    }
}
