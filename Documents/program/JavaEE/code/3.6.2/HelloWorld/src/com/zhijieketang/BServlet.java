package com.zhijieketang;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;

@WebServlet(name = "BServlet", urlPatterns = {"/bpage"})
public class BServlet extends HttpServlet {

    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

        request.setCharacterEncoding("utf-8");

        String username = request.getParameter("username");

        response.setContentType("text/html;charset=utf-8");

        StringBuffer sbr = new StringBuffer();
        sbr.append("<!DOCTYPE html>");
        sbr.append("<html>");
        sbr.append("<head>");
        sbr.append("    <meta charset=\"utf-8\">");
        sbr.append("    <title>B页面</title>");
        sbr.append("</head>");
        sbr.append("<body>");
        sbr.append("<form action=\"cpage\" method=\"post\">");
        sbr.append("    用户名：").append(username).append(" <br>");
        sbr.append("    <input type=\"submit\" value=\"跳转到C页面\">");
        sbr.append("    <input type=\"hidden\" name=\"username\" value=\"").append(username).append("\">");
        sbr.append("    <input type=\"hidden\" name=\"page\" value=\"A\">");
        sbr.append("</form>");
        sbr.append("</body>");
        sbr.append("</html>");

        PrintWriter out = response.getWriter();
        out.print(sbr.toString());
        out.close();

    }

    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        doPost(request, response);
    }
}
