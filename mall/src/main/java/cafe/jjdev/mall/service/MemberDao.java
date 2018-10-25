package cafe.jjdev.mall.service;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import javax.sql.DataSource;

import cafe.jjdev.mall.service.*;

public class MemberDao {
	public int insertMember(Member member) throws SQLException {
			System.out.println("01_01 mInsert Mdao.java");
			Class.forName("com.mysql.jdbc.Driver");
			Connection conn;
			PreparedStatement pstmt;

			conn= .getConnection();
			pstmt = conn.prepareStatement("INSERT INTO member VALUES (?, ?, ?, ?)");
			pstmt.setInt(1, member.getNo());
			pstmt.setString(2, member.getId());
			pstmt.setString(3, member.getPw());
			pstmt.setInt(4, member.getLevel());
			
			pstmt.executeUpdate();
			pstmt.close();
			conn.close();
			
			return 0;
		}
}
