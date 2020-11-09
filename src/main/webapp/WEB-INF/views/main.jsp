<%@ page language="java" contentType="text/html; charset=utf-8"
	pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@ taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt"%>
<!DOCTYPE html>
<html>
<head>
<title>김광훈입니다&#128222;</title>
<link rel="stylesheet" href="<c:url value='/resources/css/normalize.css'/>" />
<link rel="stylesheet" href="<c:url value='/resources/css/main.css'/>" />
<script type="https://code.jquery.com/jquery-3.5.1.min.js"></script>

</head>
<body>
	<div id="main">
			<c:choose>
			<c:when test="${sessionId != null}">
<%-- 			<h2>네이버 아이디 로그인 성공하셨습니다!!</h2>
				<h3>${sessionId}님 환영합니다!</h3> --%>
				<h3 class="well">${sessionname}님 환영합니다 <a class="nlogout" href="logout.com">로그아웃</a> </h3>
<%-- 				<h3>${sessionnickname}님 환영합니다!</h3> --%>
			</c:when>
		</c:choose>
	<div id=menu>
		<ul>
			<li><a id="test" href="about.com">안녕하세요.</a></li>
			<li><a class="ti2" href="board/list.com">저는</a></li>
			<li><a class="ti3" href="contact.com">김광훈입니다</a></li>
		</ul>
	</div>
<%-- 	<img alt="" src="<%=request.getContextPath()%>/resources/img/pf.jpg">
 --%>	<div class="bg-photo"></div>
		<%-- 	<div>
	<a href="login.com">로그인</a> <a href="logout.com">로그아웃</a>
	<h5>환영합니다 ${mail}님</h5>
	</div> --%>
		
		
	</div>
</body>
</html>