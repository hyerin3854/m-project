<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
       <%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
       <%@ page import ="java.net.URLEncoder" %>
       <%
       Cookie cookie = new Cookie ("name",URLEncoder.encode("최범균","utf-8"));
       response.addCookie(cookie);
       %>
       
       
       
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<script src="https://ajax.googleapis.com/ajax/libs/jquery/3.4.1/jquery.min.js"></script>
<title>쿠키생성</title>
</head>
<body>
<%=cookie.getName() %> 쿠키의 값="<%=cookie.getValue() %>"
<hr>


</body>
</html>