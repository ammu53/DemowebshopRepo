package genericUtilities;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import com.mysql.jdbc.Driver;
public class DataBaseUtility implements IAutoConstants{
	Driver dbdriver;
	Connection connection;
	Statement statement;
	ResultSet result;
	private String columnName;
	/**
	 * This method is used to establish the connection from database.
	 */
	public void establishingConnections() {
		try {
			dbdriver=new Driver();
		}catch(SQLException e) {
			e.printStackTrace();
		}
		try {
			DriverManager.registerDriver(dbdriver);
		} catch (SQLException e1) {
			// TODO Auto-generated catch block
			e1.printStackTrace();
		}
		try {
			connection=DriverManager.getConnection(DATABASE_URL, DATABASE_UN, DATABASE_PWD);
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	/**
	 * This method is used to read the data from the database.
	 * @param query
	 * @param columnName
	 * @return
	 */
	public ArrayList readingDataFromDataBase(String query,String columnName) {
		ArrayList list=new ArrayList();
		try {
			statement=connection.createStatement();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		try {
			result=statement.executeQuery(query);
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		try {
			while(result.next()) {
				try {
					list.add(result.getString(columnName));
				} catch (SQLException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
			}
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return list;
	}
	/**
	 * This method is used to close the connection from the database.
	 */
	public void  closingConnection() {
		try {
			connection.close();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
}
