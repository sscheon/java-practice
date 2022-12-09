package restaurant;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;

public class RestaurantDAO {
	
	private final String url = "jdbc:oracle:thin:@192.168.1.100:1521:xe";
	private final String user = "c##itbank";
	private final String password = "it";
	
	private Connection conn;
	private PreparedStatement pstmt;
	private ResultSet rs;

	private void close() {
		try {
			if(rs != null)	rs.close();
			if(pstmt != null)	pstmt.close();
			if(conn != null)	conn.close();
		}catch (Exception e) {}
	}
	
	public RestaurantDAO() {
		try {
			Class.forName("oracle.jdbc.driver.OracleDriver");
			conn = DriverManager.getConnection(url, user, password);
		} catch (ClassNotFoundException e) {	
			e.printStackTrace();			
		} catch (SQLException e) {			
			e.printStackTrace();
		}		
	}
	
	public int insert(RestaurantDTO dto) {
		int row = 0;
		String sql = "insert into restaurant (category, storeName, address, phoneNum, parking) values(?, ?, ?, ?, ?)";
		
		try {
			pstmt = conn.prepareStatement(sql);
			pstmt.setString(1, dto.getCategory());
			pstmt.setString(2, dto.getStoreName());
			pstmt.setString(3, dto.getAddress());
			pstmt.setString(4, dto.getPhoneNum());
			pstmt.setString(5, dto.getParking());
			row = pstmt.executeUpdate();
			
		} catch (SQLException e) {
			e.printStackTrace();
		} finally {
			close();
		}
		return row;
	}

	public ArrayList<RestaurantDTO> showList() {
		ArrayList<RestaurantDTO> list = new ArrayList<RestaurantDTO>();
		String sql = "select * from restaurant order by idx";
		
		try {
			pstmt = conn.prepareStatement(sql);
			rs = pstmt.executeQuery();
			
			while(rs.next()) {
				RestaurantDTO res = new RestaurantDTO();
				res.setIdx(rs.getInt("idx"));
				res.setCategory(rs.getString("category"));
				res.setStoreName(rs.getString("storeName"));
				res.setAddress(rs.getString("address"));
				res.setPhoneNum(rs.getString("phoneNum"));
				res.setParking(rs.getString("parking"));
				res.setJoinDate(rs.getDate("joinDate"));
				list.add(res);
			}
		} catch (SQLException e) {
			e.printStackTrace();
		} finally {
			close();
		}		
		return list;
	}
	
	public RestaurantDTO selectOne(int idx) {
		String sql = "select * from restaurant where idx=" + idx;
		RestaurantDTO dto = null;
		
		try {
			pstmt = conn.prepareStatement(sql);
			rs = pstmt.executeQuery();
			
			while(rs.next()) {
				dto = new RestaurantDTO();
				dto.setIdx(rs.getInt("idx"));
				dto.setCategory(rs.getString("category"));
				dto.setStoreName(rs.getString("storeName"));
				dto.setAddress(rs.getString("address"));
				dto.setPhoneNum(rs.getString("phoneNum"));
				dto.setParking(rs.getString("parking"));
//				dto.setJoinDate(rs.getDate("joinDate"));				
			}
		} catch (SQLException e) {
			e.printStackTrace();
		} finally {
			close();
		}		
		return dto;
	}
	
	public int update(RestaurantDTO dto) {
		int row = 0;
		String sql = "update restaurant set category=?, storeName=?, address=?, phoneNum=?, parking=? where idx=?";
		
		try {
			pstmt = conn.prepareStatement(sql);	
			pstmt.setString(1, dto.getCategory());
			pstmt.setString(2, dto.getStoreName());
			pstmt.setString(3, dto.getAddress());
			pstmt.setString(4, dto.getPhoneNum());
			pstmt.setString(5, dto.getParking());
			pstmt.setInt(6, dto.getIdx());
			row = pstmt.executeUpdate();
			
		} catch (SQLException e) {
			e.printStackTrace();
		} finally {
			close();
		}
		
		return row;
	}
	
	public int delete(int idx) {
		int row = 0;
		String sql = "delete from restaurant where idx=" + idx;
		
		try {
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
