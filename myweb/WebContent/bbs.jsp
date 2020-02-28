<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
        <%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<!DOCTYPE html>
<html>
<head>
<meta http-eqiv="Content-Type" content="text/html; charset=UTF-8">
<!-- 뷰포트 -->
<meta name="viewport" content="width=device-width" initial-scale="1">
<!--  스타일 시트 참조 -->
<link rel="stylesheet" href="css/bootstrap.css">
<meta charset="UTF-8">
<script src="https://ajax.googleapis.com/ajax/libs/jquery/3.4.1/jquery.min.js"></script>
<title>jsp 게시판 웹사이트</title>
</head>
<body>

<% //로그인 한사람이라면 userid 라는 변수에 해당 아이디가 담기고 그렇지 않으면 null값 
String userID =null;
if (session.getAttribute("userID")!=null) {
	userID=(String) session.getAttribute("userID");
}
%>

<!-- 네비게이션 -->
<nav class="navbar navbar-default">
<div class="navbar-header">
<button type="button" class="navbar-toggle collpased"
data-toggle ="collapse" data-target="bs-example-navbar-collapse-1"
aria-expanded="false">
<span class="icon-bar"></span><span class="icon-bar"></span><span class="icon-bar"></span>
</button>
<a class="navbar-brand" href="main.jsp">JSP 게시판</a>
</div>
<div class="collapse navbar-collapse" id="#bs-example-navbar-collapse-1">
<ul class="nav navbar-nav">
<li><a href="main.jsp">메인</a></li>
<li class ="active"><a href="bbs.jsp">게시판</a></li></ul>/div>

<% //로그인 안된경우
if(userID==null) { %>
 <ul class="nav navbar-nav navbar-right">
<li class="dropdown"><a href="#" class="dropdown-toggle"
data-toggle="dropdown" role="button" aria-haspopup="true"
aria-expanded="false"> 접속하기 <span class="caret"></span></a>
<ul class"dropdown-menu">

<li><a href="login.jsp">로그인</a></li>
<li><a href="join.jsp">회원가입</a></li>
</ul>
</li>
</ul>
<%
} else {
%>
<ul class="nav navbar-nav navbar=right">
<li class="dropdown"><a href="logoutAction.jsp">로그아웃</a></li>
</ul>


















 </nav>
</body>
</html>