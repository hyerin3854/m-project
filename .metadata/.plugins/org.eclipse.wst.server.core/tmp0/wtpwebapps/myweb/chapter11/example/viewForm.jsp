<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
이름: ${param.name }<br>
이메일: ${param.email }<br>
과일: ${param.fruits }
${paramValues.fruits[1] }
${paramValues.fruits[2] }<br>
</body>
</html>