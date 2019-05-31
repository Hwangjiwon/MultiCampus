package web.model;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

public class MemberDAO {
	public String login(String id, String pw) throws Exception {
		Connection conn = null;
		PreparedStatement stmt = null;
		ResultSet rs = null;

		try {
			// 1. Setup : 드라이버 열기
			Class.forName("com.mysql.jdbc.Driver");
			// 2. 연결
			String url = "jdbc:mysql://192.168.111.100:3306/openeg";
			String db_user = "root";
			String db_pw = "apmsetup";
			// 3. Protocol 확인
			conn = DriverManager.getConnection(url, db_user, db_pw);
			// 4. 질의
			String sql = "select username from board_member" + " where userid=? and userpw=?";

			stmt = conn.prepareStatement(sql);
			stmt.setString(1, id);
			stmt.setString(2, pw);
			rs = stmt.executeQuery();
			// stmt.executeUpdate();
			// System.out.println("1행이 update되었습니다.");

			// 5. 결과확인
			if (rs.next()) { // username이 있는 경우
				String username = rs.getString(1); // rs.getString("username")과 같음. 성능차이때문에 컬럼순서로 표시
				return username;
			} else {
				return null;
			}

		} finally { // finally를 통해 자원회수하는 것이 기본 보안
			// 6. 자원종료
			rs.close();
			stmt.close();
			conn.close();
		}
	}

	public void insertMember(String id, String pw, String name) throws Exception { // 회원가입 처리

		Connection conn = null;
		PreparedStatement stmt = null;

		try {
			// 1. Setup : 드라이버 열기
			Class.forName("com.mysql.jdbc.Driver");
			// 2. 연결
			String url = "jdbc:mysql://192.168.111.100:3306/openeg";
			String db_user = "root";
			String db_pw = "apmsetup";
			// 3. Protocol 확인
			conn = DriverManager.getConnection(url, db_user, db_pw);

			// 4. 질의
			// 회원가입
			String sql = "insert into from board_member(userid,userpw,username) values(?,?,?)";
			stmt = conn.prepareStatement(sql);
			stmt.setString(1, id);
			stmt.setString(2, pw);
			stmt.setString(3, name);
			int i = stmt.executeUpdate();
			System.out.println(i + " 행이 update되었습니다.");

		} finally { // finally를 통해 자원회수하는 것이 기본 보안
			// 5. 자원종료
			stmt.close();
			conn.close();
		}
	}
}
