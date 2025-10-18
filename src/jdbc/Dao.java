package jdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

// executeUpdate() is used for insert/delete/update 
// executeQuery() is used for Select/Fetch operation
public class Dao {
	private final static String url = "jdbc:mysql://localhost:3306/demo_db";
	private final static String username = "root";
	private final static String password = "Shresth@1";

	static Connection getConnection() throws SQLException {
		Connection conn = DriverManager.getConnection(url, username, password);
		return conn;
	}

	void insertRecord(int id, String name, String email) {
		try {
			// get connection
			Connection conn = Dao.getConnection();

			String sql = "INSERT INTO users(id, name, email) VALUES (?,?,?)";

			// prepare statement
			PreparedStatement stmt = conn.prepareStatement(sql);

			stmt.setInt(1, id);
			stmt.setString(2, name);
			stmt.setString(3, email);

			int noModifiedRows = stmt.executeUpdate();
			if (noModifiedRows > 0) {
				System.out.println(noModifiedRows + " row is inserted.");
			} else {
				System.out.println("There is some issue.");
			}

		} catch (Exception e) {
			System.out.println("Details of exceptions.....");
			System.out.println(e.getMessage());
		}
	}

	public void deleteRecord(int id) {
		try {
			// get connection
			Connection conn = Dao.getConnection();

			String sql = "DELETE FROM users WHERE id =?";
			// prepare statement
			PreparedStatement stmt = conn.prepareStatement(sql);
			stmt.setInt(1, id);

			int noModifiedRows = stmt.executeUpdate();
			if (noModifiedRows > 0) {
				System.out.println(noModifiedRows + " row is deleted.");
			} else {
				System.out.println("There is some issue.");
			}
		} catch (Exception e) {
			System.out.println(e.getLocalizedMessage());
		}
	}

	public void updateRecord(int id, String email) {
		try {
			// get connection
			Connection conn = Dao.getConnection();

			String sql = "UPDATE users SET email =? WHERE id = ?";
			// prepare statement
			PreparedStatement stmt = conn.prepareStatement(sql);
			stmt.setString(1, email);
			stmt.setInt(2, id);

			int noModifiedRows = stmt.executeUpdate();
			if (noModifiedRows > 0) {
				System.out.println(noModifiedRows + " row is modified.");
			} else {
				System.out.println("There is some issue.");
			}
		} catch (Exception e) {
			System.out.println(e.getLocalizedMessage());
		}

	}

	public void fetchRecord() {
		try {
			// get connection
			Connection conn = Dao.getConnection();

			String sql = "SELECT id, name, email FROM users";
			// prepare statement
			PreparedStatement stmt = conn.prepareStatement(sql);

			ResultSet rs = stmt.executeQuery();
			while (rs.next()) {
				int id = rs.getInt("id");
				String name = rs.getString("name");
				String email = rs.getString("email");
				System.out.println("ID: " + id + ", Name: " + name + ", Email: " + email);
			}
			// Close the result set and statement
			rs.close();
			stmt.close();
		} catch (Exception e) {
			System.out.println(e.getLocalizedMessage());
		}
	}

	public void updateRecord(int id, String name, String email) {
		try {
			// get connection
			Connection conn = Dao.getConnection();

			String sql = "UPDATE users SET email =?, name =? WHERE id = ?";
			// prepare statement
			PreparedStatement stmt = conn.prepareStatement(sql);
			stmt.setString(1, email);
			stmt.setString(2, name);
			stmt.setInt(3, id);

			int noModifiedRows = stmt.executeUpdate();
			if (noModifiedRows > 0) {
				System.out.println(noModifiedRows + " row is modified.");
			} else {
				System.out.println("There is some issue.");
			}
		} catch (Exception e) {
			System.out.println(e.getLocalizedMessage());
		}		
	}

	public void fetchRecord(int id) {
		try {
			// get connection
			Connection conn = Dao.getConnection();

			String sql = "SELECT name FROM users WHERE id > ?";
			// prepare statement
			PreparedStatement stmt = conn.prepareStatement(sql);
			stmt.setInt(1, id);

			ResultSet rs = stmt.executeQuery();
			while (rs.next()) {
				String name = rs.getString("name");
				System.out.println("Name: " + name);
			}
			// Close the result set and statement
			rs.close();
			stmt.close();
		} catch (Exception e) {
			System.out.println(e.getLocalizedMessage());
		}
	}

	public void deleteRecord(String name) {
		try {
			// get connection
			Connection conn = Dao.getConnection();

			String sql = "DELETE FROM users WHERE name =?";
			// prepare statement
			PreparedStatement stmt = conn.prepareStatement(sql);
			stmt.setString(1, name);

			int noModifiedRows = stmt.executeUpdate();
			if (noModifiedRows > 0) {
				System.out.println(noModifiedRows + " row is deleted.");
			} else {
				System.out.println("There is some issue.");
			}
		} catch (Exception e) {
			System.out.println(e.getLocalizedMessage());
		}
	}

}
