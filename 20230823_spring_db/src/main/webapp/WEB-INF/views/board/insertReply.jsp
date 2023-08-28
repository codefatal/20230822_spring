<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>게시글 답변 등록</title>
</head>
<body>
	<form action="${pageContext.request.contextPath }/board/insertReply" method="post">
	<input type="hidden" name="bno" value="${bno }">
	제목:<input type="text" name="btitle"><br>
	내용:<input type="text" name="bcontent"><br>
	<input type="submit" value="등록">
</form>
</body>
</html>