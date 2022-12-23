package 천성수9A;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.*;

import javax.naming.Context;
import javax.naming.InitialContext;
import javax.naming.NamingException;
import javax.sql.DataSource;

public class Kfc_menuDAO {
	
	private static Kfc_menuDAO instance = new Kfc_menuDAO();
	
	public static Kfc_menuDAO getInstance() {
		return instance;
	}
	
	private Connection conn;
	private PreparedStatement pstmt;
	private ResultSet rs;
	
	private Context init;
	private DataSource ds;
	
	public Kfc_menuDAO() {
		
		try {
			init = new InitialContext();
			ds = (DataSource) init.lookup("java:comp/env/jdbc/oracle");
		} catch (NamingException e) {
			e.printStackTrace();
		} finally {
			if (conn != null) try {	conn.close(); } catch (SQLException e) {}
		}
	}
	
	private void close() {
		try {
			if(rs != null) rs.close();
			if(pstmt != null) pstmt.close();
			if(conn != null) conn.close();					
			} catch (Exception e) {}
	}
	
	public List<Kfc_menuDTO> selectAllList() {
		ArrayList<Kfc_menuDTO> list = new ArrayList<Kfc_menuDTO>();
		String sql = "select * from kfc_menu where deleteck='no' order by idx";
		
		try {
			conn = ds.getConnection();
			pstmt = conn.prepareStatement(sql);
			rs = pstmt.executeQuery();
			
			while(rs.next()) {
				Kfc_menuDTO dto = new Kfc_menuDTO();
				dto.setIdx(rs.getInt("idx"));
				dto.setName(rs.getString("name"));
				dto.setPrice(rs.getString("price"));
				dto.setCategory(rs.getString("category"));
				dto.setMemo(rs.getString("memo"));
				dto.setImgPath(rs.getString("imgPath"));
				dto.setDeleteck(rs.getString("deleteck"));
				list.add(dto);
			}
		} catch (SQLException e) {
			e.printStackTrace();
		} finally {
			close();
		}
		
		return list;
	}
	
	public List<Kfc_menuDTO> selectCaList(String category) {
		ArrayList<Kfc_menuDTO> list = new ArrayList<Kfc_menuDTO>();
		String sql = "select * from kfc_menu where deleteck='no' and category=?";
		
		try {
			conn = ds.getConnection();
			pstmt = conn.prepareStatement(sql);
			pstmt.setString(1, category);
			rs = pstmt.executeQuery();
			
			while(rs.next()) {
				Kfc_menuDTO dto = new Kfc_menuDTO();
				dto.setIdx(rs.getInt("idx"));
				dto.setName(rs.getString("name"));
				dto.setPrice(rs.getString("price"));
				dto.setCategory(rs.getString("category"));
				dto.setMemo(rs.getString("memo"));
				dto.setImgPath(rs.getString("imgPath"));
				dto.setDeleteck(rs.getString("deleteck"));
				list.add(dto);
			}
		} catch (SQLException e) {
			e.printStackTrace();
		} finally {
			close();
		}
		
		return list;
	}
	
	
	public int insert(Kfc_menuDTO dto) {
		int row = 0;
		String sql = "insert into kfc_menu(name, price, category, memo, imgPath, deleteck) values(?, ?, ?, ?, ?, ?)";
		
		try {
			conn = ds.getConnection();
			pstmt = conn.prepareStatement(sql);
			pstmt.setString(1, dto.getName());
			pstmt.setString(2, dto.getPrice());
			pstmt.setString(3, dto.getCategory());
			pstmt.setString(4, dto.getMemo());
			pstmt.setString(5, dto.getImgPath());
			pstmt.setString(6, dto.getDeleteck());
			row = pstmt.executeUpdate();
			
		} catch (SQLException e) {
			e.printStackTrace();
		} finally {
			close();
		}
		
		return row;
	}
	
	public Kfc_menuDTO selectOne(int idx) {
		String sql = "select * from kfc_menu where idx=" + idx;
		Kfc_menuDTO dto = null;
		
		try {
			conn = ds.getConnection();
			pstmt = conn.prepareStatement(sql);
			rs = pstmt.executeQuery();
			
			while(rs.next()) {
				dto = new Kfc_menuDTO();
				dto.setIdx(rs.getInt("idx"));
				dto.setName(rs.getString("name"));
				dto.setPrice(rs.getString("price"));
				dto.setCategory(rs.getString("category"));
				dto.setMemo(rs.getString("memo"));
				dto.setImgPath(rs.getString("imgPath"));
				dto.setDeleteck(rs.getString("deleteck"));				
			}
		} catch (SQLException e) {
			e.printStackTrace();
		} finally {
			close();
		}
		
		return dto;
	}
	
	public int update(Kfc_menuDTO dto) {
		int row = 0;
		String sql = "update kfc_menu set name=?, price=?, category=?, memo=?, imgPath=?, deleteck=? where idx=?";
		
		try {
			conn = ds.getConnection();
			pstmt = conn.prepareStatement(sql);
			pstmt.setString(1, dto.getName());
			pstmt.setString(2, dto.getPrice());
			pstmt.setString(3, dto.getCategory());
			pstmt.setString(4, dto.getMemo());
			pstmt.setString(5, dto.getImgPath());
			pstmt.setString(6, dto.getDeleteck());
			pstmt.setInt(7, dto.getIdx());
			row = pstmt.executeUpdate();
			
		} catch (SQLException e) {
			e.printStackTrace();
		} finally {
			close();
		}
		
		return row;
	}

}
