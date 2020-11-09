<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<link rel="stylesheet" href="<c:url value='/resources/css/normalize.css'/>" />
<link rel="stylesheet" href="<c:url value='/resources/css/main.css'/>" />
<meta charset="UTF-8">
<script type="https://code.jquery.com/jquery-3.5.1.min.js"></script>
<script>
 
</script>


</head>
<body>
	<h1>회원가입</h1>
	<form action="mb_join_insert.com" method="post">
		<input type="text" 	 	name="mail" 		 placeholder="이메일"> <br>
		<input type="password"  name="pass" 		 placeholder="비밀번호"><br>
		<input type="password"  name="passwordcheck" placeholder="비밀번호 확인"><br>
		<input type="text" 		name="name" 		 placeholder="닉네임"><br>
		<input type="text" 		name="phone" 		 placeholder="전화번호"><br>
		핸드폰 번호는 필수가 아닙니다
		
		<input type="submit" value="가입">
		<input type="reset" value="취소">
	</form>
</body>
</html>