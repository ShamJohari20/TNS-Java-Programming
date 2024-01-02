package Day16_18Dec;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java .util.Scanner;

public class ConnectionMysql {
	
	private static Connection cn;
	private static Statement stm;
	private static final String DB_DRIVER_CLASS="com.mysql.cj.jdbc.Driver";
	private static final String DB_USERNAME="root";
	private static final String DB_PASSWORD="rootroot";
	private static final String DB_URL ="jdbc:mysql://localhost:3306/student";
	
	
	public static Connection getConnetion() {
		try {
			
		Class.forName("com.mysql.cj.jdbc.Driver");// to load database driver
		System.out.println("Driver loaded successfully....");


		cn= DriverManager.getConnection(DB_URL, DB_USERNAME, DB_PASSWORD);
		System.out.println("Connection established successfully....");

			
			
		}catch (ClassNotFoundException e) {
			System.out.println("class Error....." + e.getMessage());
			// e.printStackTrace();
		} catch (SQLException e) {
			System.out.println(" mysql Error....." + e.getMessage());
		}
		return cn;
		
	}
	
	public static void getInsert() {
		try {
		cn = getConnetion();
		
		stm = cn.createStatement();
		
		String iquery = "insert into  personalinfo values('a2','margi','mr@mr.com')";
		
		
		stm.executeUpdate(iquery);
		System.out.println("Data Saved!!!");
		
		}catch(Exception e) {
			
		}
	}
	public static void getDelete() {
		try {
		cn = getConnetion();
		
		stm = cn.createStatement();
		
		String iquery = "delete from personalinfo where adharno='a2'";
		
		
		stm.executeUpdate(iquery);
		
		System.out.println("Data REmoved from table!!!");
		
		}catch(Exception e) {
			
		
		}
	}
	
	
	
	public static void getUpdate() {
		try {
		cn = getConnetion();
		
		stm = cn.createStatement();
		
		String iquery = "update personalinfo set sname='mishri' where adharno='a1'";
		
	
		stm.executeUpdate(iquery);
		
		System.out.println("Data Updated!!!");
		
		}catch(Exception e) {
			
		}
	}
	public static void fetchRecords() {
		try {
			ResultSet rs;
		cn = getConnetion();
		
		stm = cn.createStatement();
		
		String iquery = "select * from personalinfo";
		
	
		rs = stm.executeQuery(iquery)  ;
		
		
		while (rs.next())
		{
		System.out.println( "Adhar no" + rs.getString(1) + "FirstName" + rs.getString(2) + "Email" + rs.getString(3));
		}
		}catch(Exception e) {
			
		}
	}
	
	
	
	
	public static void fetchGivenRecords() {
		try {
			ResultSet rs;
		cn = getConnetion();
		
		stm = cn.createStatement();
		
		Scanner sc = new Scanner(System.in);
		System.out.println("enter the aadhar no wich you want to displsy");
		
		String s = sc.nextLine();
		
        String iquery = "SELECT adharno, sname, email FROM personalinfo WHERE adharno = '" + s + "'";

		
	
		rs = stm.executeQuery(iquery)  ;
		
		
		while (rs.next())
		{
		System.out.println( "Adhar no:  " + rs.getString(1) + ",  sname:  " + rs.getString(2) + ",  Email:  " + rs.getString(3));
		}
		}catch(Exception e) {
			
		}
	}
	
	
	
	
	
}
