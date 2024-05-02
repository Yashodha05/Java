package Week12;
import java.sql.*;

public class JDBC {
	static final String DB_URL="jdbc:mysql://localhost:3306/sample";
	static final String USER="root";
	static final String PASS ="Yashodha@123";
	static final String QUERY="select * from Employyee";
	static final String QUERY_INS="insert into employee(emp_no, emp_name, salary)values(567,'Anil',200000)";


	public static void main(String[] args) throws
		 ClassNotFoundException {
			try {
				Connection conn=DriverManager.getConnection(DB_URL, USER, PASS);
				Statement stmt=conn.createStatement();
				stmt.executeUpdate(QUERY_INS);
				ResultSet rs=stmt.executeQuery(QUERY);
				System.out.println("*****************************************************");
				System.out.println("\tEmp no\temp Name\tsalary\n");
				System.out.println("*****************************************************");
				while (rs.next()) {
					System.out.println("\n"+rs.getInt("emp_no")+"\t"+rs.getString("emp_name")+"\t"+rs.getInt("salary")+"\n");
					System.out.println("*****************************************************");
				
				}
			
				
			}
			catch (SQLException e ) {
				e.printStackTrace();
			}
		}

}


