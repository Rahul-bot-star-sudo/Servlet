package com.example;
import java.io.IOException;     // agar input-output me problem aaye to handle karane ke liye
import javax.servlet.Servlet;   // interface jisako hum implement kar rahe hain
import javax.servlet.ServletConfig; // servlet ki configuration ke liye (like init parameters)
import javax.servlet.ServletException; // agar servlet me koi issue ho to exception throw karne ke liye
import javax.servlet.ServletRequest; // request ko handle karne ke liye
import java.io.PrintWriter; // output ko print karne ke liye
import javax.servlet.ServletResponse; // server ka response (jo browser ko bhejna hai)


public class HelloServlet implements Servlet { 
    private ServletConfig config; // ye ek variable hai jisme servlet ka configuration object store karenge (init me assign hoga)
    @Override
    public void init(ServletConfig config) throws ServletException {
        this.config = config;
        System.out.println("Servlet Initialized....");

    }
    @Override
    public void service (ServletRequest req, ServletResponse res) throws ServletException, IOException {
        res.setContentType("text/html"); 
        PrintWriter out = res.getWriter();
        out.println("<h1>Hello World!</h1>");
        out.close();
    }
    @Override
    public ServletConfig getServletConfig() {
        return config;
    }
    @Override
    public String getServletInfo() {
        return "HelloServlet created by rahul";
    }
    @Override
    public void destroy() {
        System.out.println("Servlet Destroyed....");
    }
}


