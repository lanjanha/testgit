package cn.lanjanha.web.servlet;

import javax.servlet.*;
import java.io.IOException;

public class demo2 implements Servlet {
    /**
     * 初始化方法
     * 在servlet创建时被执行，只会执行一次
     * @param config
     * @throws ServletException
     */
    @Override
    public void init(ServletConfig config) throws ServletException {
        System.out.println("init......");
    }

    @Override    public ServletConfig getServletConfig() {
        return null;
    }

    /**
     * 提供服务方法
     * 每一次Servlet被访问时，执行，执行多次
     * @param req
     * @param res
     * @throws ServletException
     * @throws IOException
     */
    @Override
    public void service(ServletRequest req, ServletResponse res) throws ServletException, IOException {
        System.out.println("service......");
    }

    @Override
    public String getServletInfo() {
        return null;
    }

    /**
     * 销毁方法
     * 在服务器正常关闭时执行，执行，执行一次
     */
    @Override
    public void destroy() {
        System.out.println("destroy......");
    }
}
