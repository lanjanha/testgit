package cn.lanjanha.web.servlet;

import javax.servlet.*;
import java.io.IOException;

public class demo1 implements Servlet {
    @Override
    public void init(ServletConfig config) throws ServletException {

    }

    @Override    public ServletConfig getServletConfig() {
        return null;
    }

    @Override
    public void service(ServletRequest req, ServletResponse res) throws ServletException, IOException {
        System.out.println("hello servlet");
    }

    @Override
    public String getServletInfo() {
        return null;
    }

    @Override
    public void destroy() {

    }
}
