<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/fmt" prefix="fmt"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<link rel="stylesheet"
	href="<c:url value='/resources/css/normalize.css'/>" />
<link rel="stylesheet" href="<c:url value='/resources/css/main.css'/>" />
<title>김광훈포폴사이트</title>
<script type="text/javascript"
	src="https://static.nid.naver.com/js/naverLogin_implicit-1.0.2.js"
	charset="utf-8"></script>
<script type="text/javascript"
	src="http://code.jquery.com/jquery-1.11.3.min.js"></script>

</head>
<body>
	<a href="main.com" class="main_mv">KwangHoon</a>
	<div id="login">
		<h1>반가워요!</h1>
		<h4>
			아쉽지만 게시글은 저만 쓸 수 있어요<br>오른쪽 링크를 통해 메인으로 가주세요
		</h4>
		<form action="mb_login.com" method="post">
			<input type="text" name="mail" placeholder="이메일"><br>
			<input type="text" name="pass" placeholder="비밀번호"><br> 
			<input class="loginbtn" type="submit" value="로그인"><br>
		</form>
<!-- 		<div>
			<label> <input type="checkbox" name="useCookie">
				로그인유지
			</label>
		</div> -->

		<!-- <a href="mb_join.com">회원가입</a> -->
		<a class="naverbtn" href="${url}">
		 <img src="http://static.nid.naver.com/oauth/small_g_in.PNG" />
		</a>
	</div>
</body>
</html>