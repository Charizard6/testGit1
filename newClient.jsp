<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ page import="java.sql.*" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
<form action="newClient2.jsp" method="post" name="cla">
이름 : <input type = "text" name="nName" value="고길동">
생년월일 : <input type = "text" name="nBirth" value="000204">
연락처 : <input type = "text" name="nPhone" value="000-0000-0000">
회원권 : <input type = "text" name="nPTHGX" value="220527">
회원아이디 : <input type="text" name="nidH" value="5자리">
<input type="submit" value = "ok"><br>
</form>
</body>
</html>