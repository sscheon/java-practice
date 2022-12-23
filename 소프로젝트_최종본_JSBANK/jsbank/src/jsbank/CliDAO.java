package jsbank;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import javax.naming.Context;
import javax.naming.InitialContext;
import javax.naming.NamingException;
import javax.sql.DataSource;

public class CliDAO {
	private Connection conn;
	private PreparedStatement pstmt;
	private ResultSet rs;

	private DataSource ds;
	private Context init;

	private static CliDAO instance = new CliDAO();

	public static CliDAO getInstance() {
		return instance;
	}

	public CliDAO() {

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
	
	public List<CliDTO> selectList() {
		ArrayList<CliDTO> list = new ArrayList<CliDTO>();
		String sql = "select * from client order by clino";

		try {
			conn = ds.getConnection();
			pstmt = conn.prepareStatement(sql);
			rs = pstmt.executeQuery(sql);

			while (rs.next()) {
				CliDTO ob = new CliDTO();
				ob.setClino(rs.getInt("clino"));
				ob.setCname(rs.getString("cname"));
				ob.setRegnum(rs.getString("regnum"));
				ob.setCphonenum(rs.getString("cphonenum"));
				ob.setAcntnum(rs.getString("acntnum"));
				ob.setAddress(rs.getString("address"));
				ob.setCliemail(rs.getString("cliemail"));
				ob.setBpno(rs.getInt("bpno"));
				ob.setGrade(rs.getString("grade"));
				ob.setBpdate(rs.getString("bpdate"));
				ob.setEmpno(rs.getInt("empno"));
				list.add(ob);
			}
		} catch (SQLException e) {
			e.printStackTrace();
		} finally {
			close();
		}
		return list;
	}
	
	public int insert(CliDTO dto) {
		int row = 0;
		String sql = "insert into client (cname, regnum, cphonenum, acntnum, address, cliemail, bpno, grade, bpdate, empno) values (?, ?, ?, ?, ?, ?, ?, ?, ?, ?)";
		try {
			conn = ds.getConnection();
			pstmt = conn.prepareStatement(sql);
			pstmt.setString(1, dto.getCname());
			pstmt.setString(2, dto.getRegnum());
			pstmt.setString(3, dto.getCphonenum());
			pstmt.setString(4, dto.getAcntnum());
			pstmt.setString(5, dto.getAddress());
			pstmt.setString(6, dto.getCliemail());
			pstmt.setInt(7, dto.getBpno());
			pstmt.setString(8, dto.getGrade());
			pstmt.setString(9, dto.getBpdate());
			pstmt.setInt(10, dto.getEmpno());
			row = pstmt.executeUpdate();
			
		}catch (SQLException e) {
			e.printStackTrace();
		}finally {
			close();
		}
		return row;
	}
	
	public CliDTO selectOne(int clino) {
		String sql = "select * from client where clino=" + clino;
		CliDTO dto = null;
		
		try {
			conn = ds.getConnection();
			pstmt = conn.prepareStatement(sql);
			rs = pstmt.executeQuery();
			
			while(rs.next()) {
				dto = new CliDTO();
				dto.setClino(rs.getInt("clino"));
				dto.setCname(rs.getString("cname"));
				dto.setRegnum(rs.getString("regnum"));
				dto.setCphonenum(rs.getString("cphonenum"));
				dto.setAcntnum(rs.getString("acntnum"));
				dto.setAddress(rs.getString("address"));
				dto.setCliemail(rs.getString("cliemail"));
				dto.setBpno(rs.getInt("bpno"));
				dto.setGrade(rs.getString("grade"));
				dto.setBpdate(rs.getString("bpdate"));
				dto.setEmpno(rs.getInt("empno"));
			}
		} catch (SQLException e) {
			e.printStackTrace();
		} finally { close(); }
		return dto;
	}
	
	public int update(CliDTO ob) {
		int row = 0;
		String sql = "update client set cname=?, regnum=?, cphonenum=?, acntnum=?, address=?, cliemail=?, bpno=?, grade=?, bpdate=?, empno=? where clino=?";
		
		try {
			conn = ds.getConnection(); 
			pstmt = conn.prepareStatement(sql);
			pstmt.setString(1, ob.getCname());
			pstmt.setString(2, ob.getRegnum());
			pstmt.setString(3, ob.getCphonenum());
			pstmt.setString(4, ob.getAcntnum());
			pstmt.setString(5, ob.getAddress());
			pstmt.setString(6, ob.getCliemail());
			pstmt.setInt(7, ob.getBpno());
			pstmt.setString(8, ob.getGrade());
			pstmt.setString(9, ob.getBpdate());
			pstmt.setInt(10, ob.getEmpno());
			pstmt.setInt(11, ob.getClino());
			
			row = pstmt.executeUpdate();
			
		} catch (SQLException e) {
			e.printStackTrace();
		} finally { close(); }
		return row;
	}
	
	public int delete(int clino) {
		int row = 0;
		String sql = "delete from client where clino=" + clino;
		
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
