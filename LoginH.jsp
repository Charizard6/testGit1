<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>렉시짐 출석체크 화면입니다.</title>
</head>
<body>
<%
	String sID=(String)session.getAttribute("userID");
	
	if(sID == null){
%>
	<form action="LoginProc.jsp" method="post" name="idpass">
	회원번호 입력 : <input type="text" name="mName" value="id"><br>
	<input type="submit" value="ok"> 
	</form>
<%} %>
</body>
</html>