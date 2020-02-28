<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>	
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
<%
String a ="바나나우유";
%>
<%
String b ="딸기우유";
%>
<%@ include file="/WEB-INF/jspf/navbar2.jspf" %>
<%--
<%@ include file="/WEB-INF/jspf/navbar.jsp" %>
 --%>
 <jsp:include page="/WEB-INF/jspf/navbar.jsp"></jsp:include>
<h1>메인 콘텐츠</h1>
<p>메인 콘텐츠> 집에 가고 싶다아아</p>



</body>
</html>