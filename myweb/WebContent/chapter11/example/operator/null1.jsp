<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body> 
<!--산술 연산일 때는 foo 가 "0" boolean연산일때는 "false"-->
${foo + 1  }<br>
${foo - 1  }<br>
${3 / foo  }<br>
\${3 mod foo }, exception<br>
<hr>
${foo and true }<br>
${foo and false }<br>



</body>
</html>