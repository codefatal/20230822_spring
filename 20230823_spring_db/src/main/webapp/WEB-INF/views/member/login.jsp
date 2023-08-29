<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>로그인</title>
</head>
<body>

<div>
	<div>
		<h2>로그인</h2>
		<form action="<%=request.getContextPath() %>/login" method="post">
			id: <input type="text" name="username" required="required"><br>
			pw: <input type="password" name="password" required="required"><br>
			<button type="submit">로그인</button>
			<button type="button">회원가입 : TODO</button>
			<!-- csrf 공격을 막기위해서 hidden 태그로 보내줌. token 값 403 오류가 발생안함. -->
			<input type="hidden" name="${_csrf.parameterName }" value="${_csrf.token }">
		</form>
	</div>
</div>

</body>
</html>