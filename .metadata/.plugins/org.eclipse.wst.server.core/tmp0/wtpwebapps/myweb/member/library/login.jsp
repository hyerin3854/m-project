<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
        <%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<!DOCTYPE html>
<html>
<head>
<title> 회원 가입</title>
</head>
<body>
<h1>로그인 화면</h1>
<br/>
<form action="/webcontent/logincheck.jsp" method="post">
아이디:<input type="text" name="id" maxlength="15"/><br><br/>
비밀번호:<input type="password" name="password" maxlength="15"/><br/><br/>
<input type="submit" value="로그인"/>
<input type="button" value="아이디/비밀번호 찾기"/>
<input type="button" value="회원가입"/>



</form>


</body>
</html>