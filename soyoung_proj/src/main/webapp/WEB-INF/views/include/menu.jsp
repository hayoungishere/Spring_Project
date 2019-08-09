<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>menu.jsp</title>
</head>
<body>
   <c:set var="path" value="${pageContext.request.contextPath}"/>
<%--    ${path} --%>
   <div>
      <a href="${path}/">main</a>
      <a href="${path}/member/memberlist.do">회원관리</a>
   </div>
   <hr>
</body>
</html>