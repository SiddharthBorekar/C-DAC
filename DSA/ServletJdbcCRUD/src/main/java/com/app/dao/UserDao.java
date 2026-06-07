package com.app.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import com.app.config.DBConnection;
import com.app.model.User;

public class UserDao {

//	CREATE
	public void addUser(User u) throws ClassNotFoundException, SQLException {
		String sql = "INSERT INTO users (name, email) VALUES(? , ?)";
		try (Connection conn = DBConnection.getConnection(); PreparedStatement pstmt = conn.prepareStatement(sql)) {
			pstmt.setString(1, u.getName());
			pstmt.setString(2, u.getEmail());
			pstmt.executeUpdate();
		}
	}

//	READ
	public List<User> getAllUser() throws ClassNotFoundException, SQLException {
		String sql = "SELECT * FROM users";
		List<User> list = new ArrayList<User>();
		try (Connection conn = DBConnection.getConnection();
				PreparedStatement pstmt = conn.prepareStatement(sql);
				ResultSet rs = pstmt.executeQuery();) {
			while (rs.next()) {
				list.add(new User(rs.getInt("id"), rs.getString("name"), rs.getString("email")));
			}
		}
		return list;
	}

//	Get User by ID
	public User getUserById(User user) throws ClassNotFoundException, SQLException {
		String sql = "SELECT * FROM users WHERE ID = ?";
		try (Connection conn = DBConnection.getConnection(); PreparedStatement pstmt = conn.prepareStatement(sql)) {

			pstmt.setInt(1, user.getId());

			try (ResultSet rs = pstmt.executeQuery()) {
				if (rs.next()) {
					return new User(rs.getInt("id"), rs.getString("name"), rs.getString("email"));
				}
			}
		}
		return null;
	}

//	UPDATE
	public void updateUser(User user) throws ClassNotFoundException, SQLException {
		String sql = "UPDATE users SET name = ?, email = ? WHERE id = ?";
		try (Connection conn = DBConnection.getConnection(); PreparedStatement pstmt = conn.prepareStatement(sql)) {

			pstmt.setString(1, user.getName());
			pstmt.setString(2, user.getEmail());
			pstmt.setInt(3, user.getId());

			pstmt.executeUpdate();
		}
	}

// DELETE
	public void deleteUser(User user) throws ClassNotFoundException, SQLException {
		String sql = "DELETE FROM users WHERE ID = ?";
		try (Connection conn = DBConnection.getConnection(); PreparedStatement pstmt = conn.prepareStatement(sql)) {

			pstmt.setInt(1, user.getId());
			pstmt.executeUpdate();
		}
	}
}
