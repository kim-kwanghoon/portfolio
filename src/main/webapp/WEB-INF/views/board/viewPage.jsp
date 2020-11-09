<%@ page language="java" contentType="text/html; charset=EUC-KR"
	pageEncoding="EUC-KR"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/fmt" prefix="fmt"%>

<!DOCTYPE html>
<html>
<head>
<meta charset="utf-8">
<link rel="stylesheet"
	href="<c:url value='/resources/css/normalize.css'/>" />
<link rel="stylesheet" href="<c:url value='/resources/css/main.css'/>" />
<script src="https://code.jquery.com/jquery-3.5.1.min.js"></script>
<script type="text/javascript">
	$(document).ready(function() {
		/* �α��� ���½� ��� �ڵ� */
		var userid = "${mail}";
		if (userid == "") {
			alert("�մ��Դϴ�");
		} else {
			var attrVar = {
				'value' : userid,
				'readonly' : ''
			};
			$('#commentId').attr(attrVar);
			var attVar2 = {
				'type' : 'hidden',
				'value' : userid
			};
			$('#commentPw').attr(attVar2);

			/* $('#commentId').attr('value',userid);
			   $('#commentId').attr('readonly',""); */
		}
		;
	});
</script>

<script type="text/javascript">
	function commentAdd() {
		if (confirm('����� �ۼ��Ͻðڽ��ϱ�?')) {
			var CommentDto = $('#commentFrom').serialize();
			$.ajax({
				url : 'contentViewPage_comment.com',
				type : 'POST',
				data : CommentDto,
				dataType : "json"
			}).done(
				function(args) {
					var commentText = args.commentText
					var commentId = args.commentId
					var commentDa = args.commentDa
	
					$("#commentTable").append(
						"<div style='border-left: 3px solid #585858; padding-left: 20px;'>"
						+ "<strong style='color:#643dfd;'>" + commentId
						+ "</strong>&nbsp;&nbsp;"
						+ "<br>" + commentText + "<br></div>");
				});
		} else {
			alert("��ҵǾ����ϴ�");
		}
	}
</script>

</head>
<body>
	<div id="poview">

		<c:forEach var="contentViewPage" items="${contentViewPage}">
			<h5 class="title">${contentViewPage.title}</h5>
			<%-- <fmt:formatDate value="${contentViewPage.regDate}" type="date" dateStyle="long" /> --%>
			<%-- <span id="time">${contentViewPage.regDate}</span> --%>
			<%-- <p>${contentViewPage.writer}</p> --%>
			<div class="poview_p1">
				<img alt="��������"
					src="<%=request.getContextPath()%>/resources/${contentViewPage.fileCh}">
			</div>
			<div class="content">
				<p>${contentViewPage.content}</p>
				<div id="commentTable">
					<c:forEach var="contentViewPageComment"
						items="${contentViewPageComment}">
						<div class="commdesign">
							<strong>${contentViewPageComment.commentId}</strong>
							<%-- ${contentViewPageComment.commentDa} --%>
							<br>${contentViewPageComment.commentText}<br>
						</div><br>
					</c:forEach>
				</div>
				<br> <a href="#" class="portfolio">�̷¼� �޾ƺ���(PDF)</a>
			</div>
			<form id="commentFrom" method="post">
				<input type="hidden" name="bno" value="${contentViewPage.bno}"><br>
				<div>
					<div>
						<input type="text" id="commentId" name="commentId" placeholder="�г���">
						<input type="hidden" id="commentPw" name="commentPw" placeholder="����ó��" value="hidden">
					</div>
				</div>
				<div>
					<textarea name="commentText" placeholder="������ �ۼ����ּ���"></textarea>
					<br>
				</div>

				<input class="commaddbtn" type="button" onclick="commentAdd()"
					value="���">
			</form>
		</c:forEach>

	</div>
</body>
</html>