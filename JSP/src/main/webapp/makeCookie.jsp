<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@ page import ="java.net.URLEncoder" %>
<%
    Cookie cookie = new Cookie("name", URLEncoder.encode("양인모", "utf-8"));
    response.addCookie(cookie);
%>
<html>
<head>
    <meta charset=UTF-8">
    <title>쿠키 생성</title>
</head>

<body>
<%= cookie.getName() %> = <%= cookie.getValue() %>
</body>
</html>