<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>

<body>
<%
request.setAttribute("nickname", "홍길동");
%>

<jsp:include page ="/WEB-INF/jspf/navbar.jsp">
<jsp:param value="hong" name="user"/>	
</jsp:include>

<div>
<h1>메인 콘텐츠</h1>
<p> 메인 컨텐츠 방가방가</p>


</div>
</body>
</html>