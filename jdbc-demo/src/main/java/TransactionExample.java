import java.sql.*;
import java.time.LocalDateTime;
import java.math.BigDecimal;

public class TransactionExample {
	
	public static final String SQL_TABLE_CREATE = "CREATE TABLE EMPLOYEE" + "(ID serial," + "NAME varchar(100) NOT NULL,"
	+ "SALARY numeric(15,2) NOT NULL," + "CREATED_DATE timestamp with time zone NOT NULL DEFAULT CURRENT_TIMESTAMP,"
			+"PRIMARY KEY (ID)" + ")";
	public static final String SQL_INSERT = "INSERT INTO EMPLOYEE (NAME, SALARY, CREATED_DATE) VALUES (?,?,?)";
	
	public static final String SQL_TABLE_DROP = "DROP TABLE EMPLOYEE";
	
	public static void main(String[] args) {
		try {
			Connection connection = DriverManager.getConnection("jdbc:postgresql://localhost/db1","postgres","1224");
			Statement statement = connection.createStatement();
			PreparedStatement psInsert = connection.prepareStatement(SQL_INSERT);
			statement.execute(SQL_TABLE_DROP);
			statement.execute(SQL_TABLE_CREATE);
			
			
			connection.setAutoCommit(false);
			
			psInsert.setString(1, "Ramesh");
            psInsert.setBigDecimal(2, new BigDecimal(1000000));
            psInsert.setTimestamp(3, Timestamp.valueOf(LocalDateTime.now()));
            psInsert.execute();
            
            connection.commit();
            
            
			} catch (SQLException e) {
			e.printStackTrace();
		}
	}

}
