<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@ page session="false" %>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<html>
<head>
<meta charset="UTF-8">
	<title>Home</title>
</head>
<body>
<table border="1">
	<tr>
	<th>번호</th>
	<th>이름</th>
	<th>제목</th>
	<th>날짜</th>
	<th>히트</th>
	</tr>
	<c:forEach var="item" items="${list}">
	<tr>
	<td>${item.bid}</td>
	<td>${item.bname}</td>
	<td>${item.btitle}</td>
	<td>${item.bdate}</td>
	<td>${item.bhit}</td>
	</tr>
	</c:forEach>
</table>

</body>
</html>
