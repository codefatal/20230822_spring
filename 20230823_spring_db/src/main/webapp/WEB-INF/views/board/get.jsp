<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>새 글 등록</title>
<script src="https://code.jquery.com/jquery-3.7.0.js"></script>
</head>
<body>
	<div>
		<input type="hidden" name="bno" value="${boardvo.bno }">
		제목 : <input type="text" name="btitle" value="${boardvo.btitle }" readonly>
		<br>
		내용 : <textarea rows="10" cols="50" name="bcontent" readonly>${boardvo.bcontent }</textarea>
		<br>
		<%-- <c:forEach items="${bdto.attachFileList }" var="filedto">
			<object data="${pageContext.request.contextPath }/${filedto.filepath}" width="200"></object>
			<br>
		</c:forEach> --%>
		<hr>
	</div>
	<!-- <script>
		$("#btn-add-file").click(function() {
			var cnt = $("[type=file]").length+1;
			htmlVal = '<div>파일첨부(name에 field명 작성하지 말자!) : <input type="file" name="a-'+cnt+'"><button type="button" class="btn-delete-file">파일삭제</button></div>';
			$("#add-file").append(htmlVal);
			$(".btn-delete-file").off('click');
			$(".btn-delete-file").on('click', function() {
				$(this).parent().remove();
			});
		});
		$("#btn-board-list").click(function() {
			location.href="${pageContext.request.contextPath}/board/list";
		});
	</script> -->
</body>
</html>