<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
        <%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<script src="https://ajax.googleapis.com/ajax/libs/jquery/3.4.1/jquery.min.js"></script>
<title>로그인폼</title>
</head>
<body>
<form action="<%=request.getContextPath()%>/chapter09/member/login.jsp"
method="post">
아이디 <input type= "text" name="id" size="10">
암호 <input type ="password" name="password" size="10">
<input type="submit" value="로그인">


</form>

</body>

</html>