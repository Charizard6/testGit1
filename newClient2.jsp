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
<%
	request.setCharacterEncoding("UTF-8");
	String sIDH = request.getParameter("nidH");
	String sName = request.getParameter("nName");
	String sBirth = request.getParameter("nBirth");
	String sPhone = request.getParameter("nPhone");
	String sPTHGX = request.getParameter("nPTHGX");
	int nnidH = Integer.parseInt(sIDH);
	Connection conn = null; //db연결
	String sUrl ="jdbc:mysql://localhost:3306/class1_jsp";
	String sUser = "root";
	String sPwd = "1234";
	Class.forName("com.mysql.jdbc.Driver");
	conn = DriverManager.getConnection(sUrl, sUser, sPwd);
	out.println("db 연결 성공" + "<br>");
		
	String siibal = "insert into class1_jsp.lexyh (idH,ClaName,ClaBirth,ClaPhone,ClaDate) values ("+nnidH+",'"+ sName+"',"+ sBirth +",'"+sPhone+"',"+sPTHGX+");";
	 //쿼리문 변수 처리 "+ 변수 +"
	Statement stmt = null;
	try{
		stmt  = conn.createStatement();
		stmt.executeUpdate(siibal); //쿼리문 실행
	}
	catch(SQLException ex){
		out.println("db 연결 실패"+ ex.getMessage());
		ex.printStackTrace();
	}
	finally{
		if(stmt != null)
			stmt.close();
		if(conn != null)
			conn.close();
	}
%>
<a href="ManagerProc1.jsp">관리자 페이지</a>
</body>
</html>