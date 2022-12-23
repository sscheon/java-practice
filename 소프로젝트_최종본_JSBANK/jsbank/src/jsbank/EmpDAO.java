package jsbank;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.*;

import javax.naming.Context;
import javax.naming.InitialContext;
import javax.naming.NamingException;
import javax.sql.DataSource;

public class EmpDAO {
	private Connection conn;
	private PreparedStatement pstmt;
	private ResultSet rs;

	private DataSource ds;
	private Context init;

	private static EmpDAO instance = new EmpDAO();

	public static EmpDAO getInstance() {
		return instance;
	}

	public EmpDAO() {

		try {
			init = new InitialContext();
			ds = (DataSource) init.lookup("java:comp/env/jdbc/oracle");
		} catch (NamingException e) {
			e.printStackTrace();
		} finally {
			if (conn != null)
				try {
					conn.close();
				} catch (SQLException e) {}
		}

	}

	private void close() {
		try {
			if (rs != null)
				rs.close();
			if (pstmt != null)
				pstmt.close();
			if (conn != null)
				conn.close();
		} catch (Exception e) {}
	}

	public List<EmpDTO> selectList() {
		ArrayList<EmpDTO> list = new ArrayList<EmpDTO>();
		String sql = "select * from employee order by empno";

		try {
			conn = ds.getConnection();
			pstmt = conn.prepareStatement(sql);
			rs = pstmt.executeQuery(sql);

			while (rs.next()) {
				EmpDTO ob = new EmpDTO();
				ob.setEmpno(rs.getInt("empno"));
				ob.setEname(rs.getString("ename"));
				ob.setDept(rs.getString("dept"));
				ob.setRank(rs.getString("rank"));
				ob.setEphonenum(rs.getString("ephonenum"));
				ob.setEmpemail(rs.getString("empemail"));
				list.add(ob);
			}
		} catch (SQLException e) {
			e.printStackTrace();
		} finally {
			close();
		}
		return list;
	}
	
	public int insert(EmpDTO dto) {
		int row = 0;
		String sql = "insert into employee (ename, dept, rank, ephonenum, empemail) values (?, ?, ?, ?, ?)";
		try {
			conn = ds.getConnection();
			pstmt = conn.prepareStatement(sql);
			pstmt.setString(1, dto.getEname());
			pstmt.setString(2, dto.getDept());
			pstmt.setString(3, dto.getRank());
			pstmt.setString(4, dto.getEphonenum());
			pstmt.setString(5, dto.getEmpemail());
			row = pstmt.executeUpdate();
			
		}catch (SQLException e) {
			e.printStackTrace();
		}finally {
			close();
		}
		return row;
	}
	
	public EmpDTO selectOne(int empno) {
		String sql = "select * from employee where empno=" + empno;
		EmpDTO dto = null;
		
		try {
			conn = ds.getConnection();
			pstmt = conn.prepareStatement(sql);
			rs = pstmt.executeQuery();
			
			while(rs.next()) {
				dto = new EmpDTO();
				dto.setEname(rs.getString("ename"));
				dto.setDept(rs.getString("dept"));
				dto.setRank(rs.getString("rank"));
				dto.setEphonenum(rs.getString("ephonenum"));
				dto.setEmpemail(rs.getString("empemail"));
				dto.setEmpno(rs.getInt("empno"));
			}
		} catch (SQLException e) {
			e.printStackTrace();
		} finally { close(); }
		return dto;
	}
	
	public int update(EmpDTO ob) {
		int row = 0;
		String sql = "update employee set ename=?, dept=?, rank=?, ephonenum=?, empemail=? where empno=?";
		
		try {
			conn = ds.getConnection(); 
			pstmt = conn.prepareStatement(sql);
			pstmt.setString(1, ob.getEname());
			pstmt.setString(2, ob.getDept());
			pstmt.setString(3, ob.getRank());
			pstmt.setString(4, ob.getEphonenum());
			pstmt.setString(5, ob.getEmpemail());
			pstmt.setInt(6, ob.getEmpno());
			
			row = pstmt.executeUpdate();
			
		} catch (SQLException e) {
			e.printStackTrace();
		} finally { close(); }
		return row;
	}
	
	public int delete(int empno) {
		int row = 0;
		String sql = "delete from employee where empno=" + empno;
		
		try {
			conn = ds.getConnection(); 
			pstmt = conn.prepareStatement(sql);	
			row = pstmt.executeUpdate();		
			
		} catch (SQLException e) {
			e.printStackTrace();
		} finally {
			close();
		}
		return row;
	}
	
	

}
