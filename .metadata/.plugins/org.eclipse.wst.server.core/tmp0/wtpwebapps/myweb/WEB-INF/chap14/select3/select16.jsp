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
<h1>직원 검색</h1>
<form>
<input name="name" placeholder="이름을 입력해주세요"><br>
<input type="submit" value="검색">
</form>
<c:if test="${not empty employee }" >
<ul>
<li>직원 번호(eno): ${employee.eno }</li>
<li>직원 이름(ename): ${employee.ename }</li>
<li>직업 업무(job): ${employee.job }</li>
<li>관리자 이름(manager): ${employee.managerName }</li>
<li>관리자 번호(manager number): ${employee.manager }</li>
<li>입사일()hireDate: ${employee.hireDate }</li>
<li>급여(salary): ${employee.salary }</li>
<li>커미션(commission): ${employee.commission }</li>
<li>부서번호(dno): ${employee.dno }</li>
<li>부서이름(dname): ${employee.dname }</li>
</ul>
</c:if>
<h3>${message }</h3>
</body>
</html>






