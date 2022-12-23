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

public class BPDAO {
	private Connection conn;
	private PreparedStatement pstmt;
	private ResultSet rs;

	private DataSource ds;
	private Context init;
	
	private static BPDAO instance = new BPDAO();

	public static BPDAO getInstance() {
		return instance;
	}
	
	public BPDAO() {

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
	
	public List<BPDTO> selectList() {
		ArrayList<BPDTO> list = new ArrayList<BPDTO>();
		String sql = "select * from bankproduct order by bpno";

		try {
			conn = ds.getConnection();
			pstmt = conn.prepareStatement(sql);
			rs = pstmt.executeQuery(sql);

			while (rs.next()) {
				BPDTO ob = new BPDTO();
				ob.setBpno(rs.getInt("bpno"));
				ob.setBpname(rs.getString("bpname"));
				ob.setRegcon(rs.getString("regcon"));
				ob.setPeriod(rs.getString("period"));
				ob.setTaxrate(rs.getDouble("taxrate"));
				ob.setMaxrate(rs.getDouble("maxrate"));
				ob.setWave(rs.getDouble("wave"));
				ob.setNote(rs.getString("note"));
				list.add(ob);
			}
		} catch (SQLException e) {
			e.printStackTrace();
		} finally {
			close();
		}
		return list;
	}
	
	public int insert(BPDTO dto) {
		int row = 0;
		String sql = "insert into bankproduct (bpname, regcon, period, taxrate, maxrate, wave, note) values (?, ?, ?, ?, ?, ?, ?)";
		try {
			conn = ds.getConnection();
			pstmt = conn.prepareStatement(sql);
			pstmt.setString(1, dto.getBpname());
			pstmt.setString(2, dto.getRegcon());
			pstmt.setString(3, dto.getPeriod());
			pstmt.setDouble(4, dto.getTaxrate());
			pstmt.setDouble(5, dto.getMaxrate());
			pstmt.setDouble(6, dto.getWave());
			pstmt.setString(7, dto.getNote());
			row = pstmt.executeUpdate();
			
		}catch (SQLException e) {
			e.printStackTrace();
		}finally {
			close();
		}
		return row;
	}
	
	public BPDTO selectOne(int bpno) {
		String sql = "select * from bankproduct where bpno=" + bpno;
		BPDTO dto = null;
		
		try {
			conn = ds.getConnection();
			pstmt = conn.prepareStatement(sql);
			rs = pstmt.executeQuery();
			
			while(rs.next()) {
				dto = new BPDTO();
				dto.setBpno(rs.getInt("bpno"));
				dto.setBpname(rs.getString("bpname"));
				dto.setRegcon(rs.getString("regcon"));
				dto.setPeriod(rs.getString("period"));
				dto.setTaxrate(rs.getDouble("taxrate"));
				dto.setMaxrate(rs.getDouble("maxrate"));
				dto.setWave(rs.getDouble("wave"));
				dto.setNote(rs.getString("note"));
			}
		} catch (SQLException e) {
			e.printStackTrace();
		} finally { close(); }
		return dto;
	}
	
	public int update(BPDTO ob) {
		int row = 0;
		String sql = "update bankproduct set bpname=?, regcon=?, period=?, taxrate=?, maxrate=?, wave=?, note=? where bpno=?";
		
		try {
			conn = ds.getConnection(); 
			pstmt = conn.prepareStatement(sql);
			pstmt.setString(1, ob.getBpname());
			pstmt.setString(2, ob.getRegcon());
			pstmt.setString(3, ob.getPeriod());
			pstmt.setDouble(4, ob.getTaxrate());
			pstmt.setDouble(5, ob.getMaxrate());
			pstmt.setDouble(6, ob.getWave());
			pstmt.setString(7, ob.getNote());
			pstmt.setInt(8, ob.getBpno());
			
			row = pstmt.executeUpdate();
			
		} catch (SQLException e) {
			e.printStackTrace();
		} finally { close(); }
		return row;
	}
	
	public int delete(int bpno) {
		int row = 0;
		String sql = "delete from bankproduct where bpno=" + bpno;
		
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
