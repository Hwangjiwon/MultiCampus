package web.model;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

public class MemberDAO {
	public String login(String id, String pw) throws Exception {
		
		Class.forName("com.mysql.jdbc.Driver");
		String url = "jdbc:mysql://192.168.111.100:3306/openeg";
		String user = "root";
		String db_pw = "apmsetup";
		
		Connection conn = DriverManager.getConnection(url,user,db_pw);
		String sql="select username from board_member"
				+" where userid=? and userpw=?";
		PreparedStatement stmt = conn.prepareStatement(sql);
		stmt.setString(1, id);
		stmt.setString(2, pw);
		ResultSet rs = stmt.executeQuery();
		
		if(rs.next()) {
			String username = rs.getString(1);
			return username;
		}else {
			return null;
		}
		
		
	}
}
