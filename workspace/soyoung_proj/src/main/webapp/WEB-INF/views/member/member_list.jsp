<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
<%@ include file="../include/header.jsp" %>
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
		<th>가입일</th>
		<th>관리자여부</th>
	</tr>
	<c:forEach var="mvo" items="${mlist}">
	<tr>
		<th>${mvo.no }</th>
		<th>${mvo.id }</th>
		<th>${mvo.name }</th>
		<th>${mvo.address }</th>
		<th>${mvo.phone_number }</th>
		<th>${mvo.age }</th>
		<th>${mvo.join_dt }</th>
		<th>${mvo.admin_yn }</th>

	</tr>
	
	
	
	
	</c:forEach>
</table>
</body>
</html>