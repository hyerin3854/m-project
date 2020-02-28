<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
        <%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<script src="https://ajax.googleapis.com/ajax/libs/jquery/3.4.1/jquery.min.js"></script>
<title>Insert title here</title>
</head>
<body> 
<%-- LoopTagstatus(304쪽)--%>
<%-- count> 몇번째 돌고있는지 (루프 실행 횟수를 의미함) --%>
<c:forEach var="i" begin="1" end="5" varStatus="status	">  
${status.count }<br>                 
</c:forEach>
</body>
</html>