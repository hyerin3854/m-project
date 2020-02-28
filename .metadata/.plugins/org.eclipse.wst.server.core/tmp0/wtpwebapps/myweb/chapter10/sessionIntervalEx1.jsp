<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
        <%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
        <%
        session.setMaxInactiveInterval(10);
        //만약에 파라미터가 0이나 음수이면 세션이 종료되지 않음
        //세션의 유효시간을 갖지 않을경우,세션 객체가 제거되지 않아서 메모리 부족현상이 일어난다.
        
        %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<script src="https://ajax.googleapis.com/ajax/libs/jquery/3.4.1/jquery.min.js"></script>
<title>Insert title here</title>
</head>
<body>
<h1>session is new ? <%=session.isNew() %></h1>

</body>
</html>