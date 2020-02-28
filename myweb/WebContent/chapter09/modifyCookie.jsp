<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    <%@ page import="java.net.URLEncoder" %>
        <%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
        <%
        Cookie[] cookies =request.getCookies();
        if(cookies != null && cookies.length>0) {
        	for (int i=0; i<cookies.length;i++){
        		if(cookies[i].getName().equals("name")){
        			Cookie cookie = new Cookie("name",URLEncoder.encode("JSP프로그래밍","utf-8"));
        			response.addCookie(cookie);
        			}
        		}
        }
        %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<script src="https://ajax.googleapis.com/ajax/libs/jquery/3.4.1/jquery.min.js"></script>
<title>값 변경</title>
</head>
<body>
name 쿠키의 값을 변경합니다.
</body>
</html>