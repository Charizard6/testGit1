
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.Scanner;
import java.sql.*;
class conndb{
	Connection conn = null; //DB 연결 객체
    String USERNAME = "root";//DBMS접속 시 아이디
    String PASSWORD = "1234";//DBMS접속 시 비밀번호
    String URL = "jdbc:mysql://localhost:3306/class1_jsp";//DBMS접속할 db명
}
class nsql extends conndb{
	int i;
	String [][] s = new String[1000][5];
	public nsql(int i) {
		this.i=i;
	}
	public void nnssqqqll(String s[][]) {
	        try {
	            try {
					Class.forName("com.mysql.jdbc.Driver");
				} catch (ClassNotFoundException e) {
					e.printStackTrace();
				}
	            conn = DriverManager.getConnection(URL, USERNAME, PASSWORD);
	        } catch (SQLException e) {
	            System.out.println("드라이버 로딩 실패 ");
	            try {
	                conn.close();
	            } catch (SQLException e1) {}
	        }
		String nCla = "insert into lexyh (idH,ClaName,ClaBirth,ClaPhone,ClaDate) values("
		+s[i][0]+",'"+s[i][1]+"',"+s[i][2]+","+s[i][3]+","+s[i][4]+");";
		Statement stmt = null;
		try{
			stmt  = conn.createStatement();
			stmt.executeUpdate(nCla); //쿼리문 실행
		}
		catch(SQLException ex){
			System.out.println("db 연결 실패");
		}
	}
}
class resql extends conndb{
	int i; int j; String k;
	public resql(int i,int j, String k) {
		this.i=i; this.k=k; this.j=j;
	}
	String [][] s = new String[1000][5];
	public void resssqqqll() {
	        try {
	            try {
					Class.forName("com.mysql.cj.jdbc.Driver");
				} catch (ClassNotFoundException e) {
					e.printStackTrace();
				}
	            conn = DriverManager.getConnection(URL, USERNAME, PASSWORD);
	        } catch (SQLException e) {
	            System.out.println("드라이버 로딩 실패 ");
	            try {
	                conn.close();
	            } catch (SQLException e1) {}
	        }
	    String nCla = null;
	    String tlqkf [] ={"ClaName", "ClaBirth","ClaPhone", "ClaDate"};
		switch(j) {
		case 1:
			nCla = "update lexyh set ClaName='"+k+"' where idH ="+i+";";
			break;
		case 2:
			nCla = "update lexyh set ClaBirth='"+k+"' where idH ="+i+";";
			break;
		case 3:
			nCla = "update lexyh set ClaPhone='"+k+"' where idH ="+i+";";
			break;
		case 4:
			nCla = "update lexyh set ClaDate='"+k+"' where idH ="+i+";";
			break;
		}
		Statement stmt = null;
		try{
			stmt  = conn.createStatement();
			stmt.executeUpdate(nCla); //쿼리문 실행
		}
		catch(SQLException ex){
			System.out.println("db 연결 실패");
		}
	}
}
class chsql extends conndb{
	ResultSet rs = null;
	public chsql(int i) {
		try {
            System.out.println("생성자");
            try {
				Class.forName("com.mysql.cj.jdbc.Driver");
			} catch (ClassNotFoundException e) {
				e.printStackTrace();
			}
            conn = DriverManager.getConnection(URL, USERNAME, PASSWORD);
        } catch (SQLException e) {
            System.out.println("드라이버 로딩 실패 ");
            try {
                conn.close();
            } catch (SQLException e1) {}
        }
	String nCla ="select ClaName, ClaDate, TIMESTAMPDIFF(day, now(), ClaDate) "
			+ "from lexyh where idH ="+i+";"; 
	Statement stmt = null;
	try{
		stmt  = conn.createStatement(); //쿼리문 실행
		rs = stmt.executeQuery(nCla);
		while(rs.next()) {
			String cn = rs.getString("ClaName");
			String cd = rs.getString("ClaDate");
			String cm = rs.getString("TIMESTAMPDIFF(day, now(), ClaDate)"); //timestampdiff 날짜 빼는 mysql
			System.out.println("회원 이름 : "+ cn);
			System.out.println("회원권 만료일 : "+cd);
			System.out.println("남은 일수 : "+Integer.valueOf(cm));
		}
	}
	catch(SQLException ex){
		ex.printStackTrace();
		System.out.println("db 연결 실패");
	}
	}
}
public class Gwaje2 {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		String infoC [][] = new String[1000][]; //회원 데이터베이스로 넘기기 위한 중간 배열
		int membercount = 1; //array_index
		
		Calendar now = Calendar.getInstance();//현재날짜
		SimpleDateFormat sdf = new SimpleDateFormat("yyMMdd"); //날짜 형식 지정
		
		while(true) {
		System.out.println("회원가입 : 1, 정보수정 : 2, 출석체크 : 3, 종료 :0 중 입력");
		int i = scanner.nextInt();
		if(i==0) {
			System.out.println("프로그램 종료");
			break;
		}
		switch(i) {
		case 1:
			System.out.println("이름, 생년월일 5자리, 전화번호, 회원기간6자리 입력");
			System.out.println("ex) 홍길동 721121 01021629001 220507");
			infoC [membercount] = new String [5]; //초기화
			try {
				for(int k=1;k<5;k++) {
					infoC [membercount][k] = scanner.next();
				}
				Date test = sdf.parse(infoC[membercount][4]);
				sdf.format(test);
				if(infoC[membercount][4].length() > 6) {
					System.out.println("회원기간은 6자리입니다.");
					break;
				}
			}//회원기간은 출석체크에서 날짜계산에 쓰이므로 6자리 고정
			catch(ParseException e) {
				System.out.println("회원기간은 6자리입니다."); break;
			}
			infoC [membercount][0] = membercount + infoC[membercount][2]; //인덱스와 생년월일을 합한 회원번호
			System.out.println("회원번호 = "+ infoC[membercount][0] + ", 회원가입 완료!");
			for(int io=0;io<infoC[membercount].length;io++) {
				System.out.print(infoC[membercount][io]+"  ");
			}
			nsql nsql= new nsql(membercount);
			nsql.nnssqqqll(infoC);
			membercount ++;
			break;
		case 2:
			System.out.println("회원 번호와 수정할 번호와 정보 입력 순서대로!!");
			System.out.println("1:이름, 2:생년월일, 3:전화번호, 4:회원기간 0:취소");
			boolean found = false; //입력된 회원번호가 존재하는지에 대한 처리
			int suj = scanner.nextInt(); //회원번호 받음
			int sujung = scanner.nextInt();
			String sujungreal = scanner.next();
			resql rsql = new resql(suj,sujung,sujungreal);
			rsql.resssqqqll();
			System.out.println("수정 완료");
			break;
		case 3:
			System.out.println("회원번호 입력");
			int clnum = scanner.nextInt();
			chsql ch = new chsql(clnum);
			break;
		}
	}
}
}
