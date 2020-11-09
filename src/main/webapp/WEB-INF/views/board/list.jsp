<%@ page language="java" contentType="text/html; charset=EUC-KR"
	pageEncoding="EUC-KR"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/fmt" prefix="fmt"%>

<!DOCTYPE html>
<html>
<head>
<meta charset="EUC-KR">
<link rel="stylesheet"
	href="<c:url value='/resources/css/normalize.css'/>" />
<link rel="stylesheet" href="<c:url value='/resources/css/main.css'/>" />
<script src="https://code.jquery.com/jquery-3.5.1.min.js"></script>
<script>
	function loginch() {
		var userid = "${mail}";
		if(userid == "") {
			alert("주인만 게시글을 작성 할 수 있습니다");
			location.href="../login.com";
		} else {
			location.href="write.com";
			};
	}
</script>

</head>
<body>
	<a href="../main.com" class="main_mv">KwangHoon</a>
	<div id="mypo">
		<div class="content">
			<c:forEach var="getlist" items="${list.boardList}">
				<div class="title">
					<a href="contentView.com?bno=${getlist.bno}">${getlist.title}</a>
				</div>
				<p class="content">${getlist.content}</p>

				<!--<td>${getlist.writer}</td>
				<td>
					<fmt:formatDate value="${getlist.regDate}" type="date" dateStyle="long" />
				</td>
				<td>${getlist.viewCnt}</td>
			
				<td>
					<img alt="사진없음" src="<%=request.getContextPath()%>/resources/${getlist.fileCh}">
				</td>-->

			</c:forEach>
		</div>
		<div class="listNumbox">
			<c:if test="${list.count > 0}">
				<c:if test="${list.p.beginPageNumber > 10}">
					<a href="list.com?p=${list.p.beginPageNumber-1}">이전</a>
				</c:if>
				<c:forEach var="pno" begin="${list.p.beginPageNumber}"
					end="${list.p.endPageNumber}">
					<a class="listNum" href="list.com?p=${pno}">${pno}</a>
				</c:forEach>
				<c:if test="${list.p.endPageNumber < list.p.totalPageCount}">
					<a href="list.com?p=${list.p.endPageNumber + 1}">다음</a>
				</c:if>
			</c:if>
		</div>
		<input class="wtbtn" type="button" value="작성하기" onclick="loginch();">
	</div>
</body>
</html>