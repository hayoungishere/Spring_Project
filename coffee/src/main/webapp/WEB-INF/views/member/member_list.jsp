<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
<%@ include file ="../include/header.jsp" %>
</head>
<body>
<%@ include file="../include/menu.jsp" %>
<h2>회원목록</h2>
<table border="1">
	<tr>
		<th>No</th>
		<th>아이디</th>
		<th>이름</th>
		<th>주소</th>
		<th>핸드폰번호</th>
		<th>나이</th>
		<th>가입일자</th>
		<th>관리자여부</th>
	</tr>
	<c:forEach var="mvo" items="${mlist}">
	<tr>
		<td>${mvo.no }</td>
		<td>${mvo.id }</td>
		<td>${mvo.name }</td>
		<td>${mvo.address }</td>
		<td>${mvo.phone_number }</td>
		<td>${mvo.age }</td>
		<td>${mvo.join_dt }</td>
		<td>${mvo.admin_yn }</td>
	</tr>
	</c:forEach>
</table>
</body>
</html>