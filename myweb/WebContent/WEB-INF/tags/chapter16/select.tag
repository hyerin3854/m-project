<%@ tag language="java" pageEncoding="UTF-8"%>
<%@ tag dynamic-attributes="options" %>
<%@ attribute name="name" required="true" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>

<div>

<select name ="${name }">

<c:forEach var="option" items="${options }">
<option value="${option.key }">
${option.value }
</c:forEach>
<option></option>
</select>

</div>