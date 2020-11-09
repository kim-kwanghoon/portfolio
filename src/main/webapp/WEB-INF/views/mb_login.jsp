<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<link rel="stylesheet" href="<c:url value='/resources/css/normalize.css'/>" />
<link rel="stylesheet" href="<c:url value='/resources/css/main.css'/>" />
<meta charset="UTF-8">
<script type="text/javascript" src="https://static.nid.naver.com/js/naverLogin_implicit-1.0.2.js" charset="utf-8"></script>
<script type="text/javascript" src="https://code.jquery.com/jquery-3.5.1.min.js"></script>
</head>
<body>
	<h1>로그인하기</h1>
	
	<form action="" method="post">
		<input type="text" name="id" placeholder="이메일" >
		<input type="text" name="pw" placeholder="비밀번호">
		<input type="submit" value="완료" >
	</form>


	<a href="login.com">네이버로그인</a>
</body>
</html>