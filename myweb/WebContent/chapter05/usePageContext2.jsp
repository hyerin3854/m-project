<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
request
<%
out.print(request==pageContext.getRequest());
%>
<br>
response
<%
out.print(response==pageContext.getResponse());
%>
<br>
response
<%
out.print(session==pageContext.getSession());
%>

<br>
application
<%
out.print(application==pageContext.getServletContext());
%>
<br>
config
<%
out.print(config==pageContext.getServletConfig());
%>
<br>
page
<%
out.print(page==pageContext.getPage());
%>


</body>
</html>