package member.model.dao;

import static common.JDBCTemp.*;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

import member.model.vo.Member;
public class MemberDao {

	public Member searchUser(Connection conn, String username, String userrn) {
		Member member = null;
		PreparedStatement pstmt = null;
		ResultSet rset =null;
		
		String query = "select * from members where user_name = ? and user_rn = ?";
		
		try {
			pstmt = conn.prepareStatement(query);
			
			pstmt.setString(1, username);
			pstmt.setString(2, userrn);
			
			rset = pstmt.executeQuery();
			if(rset.next()) {
				member = new Member();
				member.setUserName(username);
				member.setUserRn(userrn);
				
			}
		} catch (Exception e) {
			e.printStackTrace();
		}finally {
			close(rset);
			close(pstmt);
		}
		   
		return member;
	}

	public Member selectLogin(Connection conn, String userid, String userpw) {
		Member member = null;
		PreparedStatement pstmt = null;
		ResultSet rset =null;
		
		String query = "select * from members where user_id = ? and user_pw = ?";
		
		try {
			pstmt = conn.prepareStatement(query);
			
			pstmt.setString(1, userid);
			pstmt.setString(2, userpw);
			
			rset = pstmt.executeQuery();
			if(rset.next()) {
				member = new Member();
				
				member.setUserId(userid);
				member.setUserPw(userpw);
				member.setUserName(rset.getString("user_name"));
				member.setUserRn(rset.getString("user_rn"));
				member.setUserAddress(rset.getString("user_address"));
				member.setUserEmail(rset.getString("user_email"));
				member.setUserGrade(rset.getString("user_grade"));
				member.setUserNo(rset.getInt("user_no"));
				member.setUserPhone(rset.getString("user_phone"));
				member.setSubUserNo(rset.getInt("sub_user_no"));
				member.setInoCnt(rset.getInt("ino_cnt"));
				member.setSmsAgr(rset.getString("sms_agr"));
				
				
			}
		} catch (Exception e) {
			e.printStackTrace();
		}finally {
			close(rset);
			close(pstmt);
		}
		   
		return member;
	}
}
