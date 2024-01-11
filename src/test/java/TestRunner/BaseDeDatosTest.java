package TestRunner;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

public class BaseDeDatosTest {
	Connection connection;
	final String JDBC_DRIVER = "com.mysql.cj.jdbc.Driver";
	final String DB_URL = "jdbc:mysql://127.0.0.1/banco";
	final String USER = "root";
	final String PASS = "rootpassword";
	

	@Test
	@Before
    public void before() throws SQLException {
        connection = DriverManager.getConnection(DB_URL, USER, PASS);
    }

    @After
    public void after() throws SQLException  {
    	connection.close();
    }


}
