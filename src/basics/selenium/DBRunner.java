package basics.selenium;

public class DBRunner {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		
		JDBCUTILITY.setupDBConnection();
		JDBCUTILITY.runQuery("select * from public.actor");
		JDBCUTILITY.returnResult();
		JDBCUTILITY.closeDBConnection();
		
        //    important classes of JDBC
		// 1. Connect Class  -
		// 2. Statement Class-
		// 3. ResultSet      - store the output of the query
		// 4. DriverManamger - will be used for connection to DB driver.
	}

}
