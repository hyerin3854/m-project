<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ page import="java.sql.*" %>
<%@ page import="test.db.DBConnection" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<script src="https://ajax.googleapis.com/ajax/libs/jquery/3.4.1/jquery.min.js"></script>
<title>Insert title here</title>
</head>
<body>
<h2>회원 목록</h2>
<table border="1" width="600">
<tr>
<td>아이디</td>
<td>비밀번호</td>
<td>이메일</td>
<td>전화번호</td>
<td>가입일</td>
<td>삭제</td>
<td>수정</td>
<%
//db에서 회원목록 얻어와 테이블에 출력하기
Connection con = null;
PreparedStatement stmt = null;
ResultSet rs= null;

try{
	con= DBConnection.getCon();
	String sql="select * from members";
	stmt=con.prepareStatement(sql);
	rs=stmt.executeQuery();
	while(rs.next()) {
		String id =rs.getString("id");
		String pw =rs.getString("pw");
		String email =rs.getString("email");
		String phone =rs.getString("phone");
		Timestamp regdate=rs.getTimestamp("regdate");
		%>
		
<tr>
<td> <%=id %></td>		
<td><%=pw %></td>		
<td><%=email%></td>		
<td><%=phone %></td>		
<td><%=regdate %></td>		
	<td> <a href="delete.jsp?id=<%=id%>">삭제</a></td>
	<td> <a href="update.jsp?id=<%=id%>">수정</a></td>
	</tr>
	<% 
	}
}catch (SQLException se) {
System.out.println(se.getMessage());


}finally{
	try{
		if(rs!=null) rs.close();
		if(stmt!=null) stmt.close();
		if(con!=null) con.close();
	} catch (SQLException se) {
		System.out.println(se.getMessage());
		
	}
	
	
	
}
	%>
</table>
</body>
</html>