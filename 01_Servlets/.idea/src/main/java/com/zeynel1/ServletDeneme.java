package com.zeynel1;


import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;

@WebServlet(name = "anasayfa",urlPatterns = "/ServletSinifi")
public class ServletDeneme extends HttpServlet {

    private static final long serialVersionUID=1;

    public ServletDeneme() {
        super();
    }

    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        resp.setContentType("text/html;charset-UTF-8");
        resp.setCharacterEncoding("UTF-8");

        PrintWriter out=resp.getWriter();

        try {
            String kullaniciAdi=req.getParameter("kullaniciAdi").toString();
            String parola=req.getParameter("parola").toString();
        }catch (Exception e)
        {}

    }

    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        super.doPost(req, resp);
    }
}
