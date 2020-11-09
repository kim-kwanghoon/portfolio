<%@ page language="java" contentType="text/html; charset=UTF-8" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/fmt" prefix="fmt"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="EUC-KR">
<link rel="stylesheet" href="<c:url value='/resources/css/normalize.css'/>" />
<link rel="stylesheet" href="<c:url value='/resources/css/main.css'/>" />

</head>
<body>
	<div id="write">
	<form action="writeInsert.com" method="post" enctype="multipart/form-data">
 			 <input type="text" name="writer"  value="${mail}" readonly="readonly"><br>
 			 <input type="text" name="title"    placeholder="제목"><br>
			 <textarea class="wrtext" rows="" cols="" name="content"></textarea><br>
			 <!-- <input type="text" name="content"  placeholder="내용"><br> -->
			 <input type="file" name="file"  placeholder="파일선택" multiple="multiple">
			 <br>
	<input class="wuplo" type="submit" value="업로드">

	</form>
	</div>
</body>
</html>
