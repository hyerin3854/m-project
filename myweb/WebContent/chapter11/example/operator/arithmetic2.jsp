<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core"  prefix="c"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
<form action="" method="post"><!-- 액션에 아무런 값을 주지 않으면 자기자신한테 요청이감 -->
<input type="number" name="num1">
<select name="op">
<option value="plus">+</option>
<option value="minus">-</option>
<option value="times">X</option>
<option value="div">/</option>
<option value="mod">%</option>
</select>
<input type="number" name="num2" >
<input type="submit" value="=">
<% 
String op = request.getParameter("op");
op=(op==null)?"":op;
if(op.equals("plus")){
	%>
	${param.num1+param.num2 }<br>
<% 	
}
%>

<c:if test="${param.op eq 'minus' }">
${param.num1 - param.num2 }<br>
</c:if>
<c:if test="${param.op eq 'times' }">
${param.num1 * param.num2 }<br>
</c:if>
<c:if test="${param.op eq 'div' }">
${param.num1 div param.num2 }<br>
</c:if>
<c:if test="${param.op eq 'mod' }">
${param.num1 mod param.num2 }<br>
</c:if>

</form>

${param.num1+param.num2 } <br>
${param.num1-param.num2 } <br>
${param.num1*param.num2 } <br>
${param.num1 div param.num2 } <br>
${param.num1 mod param.num2 } <br>
</body>
</html>