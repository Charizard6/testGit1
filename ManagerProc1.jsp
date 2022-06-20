<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<%@ page import="java.util.*" %>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
<%	
	request.setCharacterEncoding("UTF-8");
	String sMNid = request.getParameter("MNid");
%>
		<form action="newClient.jsp" method="post" name="idpass">
			<input type="submit" name="newClient" value="회원가입"><br>
		</form>
		<form action="ReClient.jsp" method="post" name="idpass">
			회원번호 수정<br>
			회원번호 입력 <input type="text" value="000000" name = "reClient"><br>
		</form>
</body>
</html>