<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
        <%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">

<script src="https://ajax.googleapis.com/ajax/libs/jquery/3.4.1/jquery.min.js"></script>
<title>로그인 데이터</title>
</head>
<body>
<% request.setCharacterEncoding("UTF-8");
	String id = request.getParameter("id");
	String password= request.getParameter("password");
	

%>
<h1>로그인 정보입니다. (데이터 넘어오는것 확인)</h1><br/>
아이디:<%=id %><br><br/>
비밀번호: <%=password %><br/><br/>

</body>
</html>