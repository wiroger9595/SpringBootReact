<%@ page contentType="text/html;charset=UTF-8" %>
<html>
<head>
    <title>登录验证</title>
</head>
<body>
<%--登录验证--%>
<%
    String name = request.getParameter("username");
    String password = request.getParameter("password");

    if (name.equals("tony") && password.equals("123")) {
        // 跳转成功页面
//        response.sendRedirect("success.jsp?username=" + name + "&password=" + password);
        request.getRequestDispatcher("success.jsp").forward(request, response);
    } else {
        response.sendRedirect("login.jsp");
    }%>
</body>
</html>
