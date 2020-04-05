/*
 * StudentName: Yash Djson Dookun
 * Task: Create a Graphical User Interface (GUI) and a Java Program that mimics
 * 		 the function of an ATM Machine.
 *		 (Responsible to establish Primary Connection with Database)
 *		 (Also responsible to Call the GUI Class which will really execute the ATM Program)
 */

import java.sql.*;

public class ConnectDatabase{
	// Set DataBase Credentials
	public  String Url = "jdbc:mysql://localhost:80/ATM_User";
	public  String Db_Username = "root";
	public  String Db_Password = "";
	 
	public String msg ="";
	public String UserPin = "";
	public String FullName="";
	public int Balance;
	public int ID;
	ResultSet rs;
	 
	Connection conn = null;
	
	// Connect to Database and curate for unsuccessful connection 
	public void DB_Connect() {	
		try {
//			// Establish Connection
			conn = DriverManager.getConnection(Url, Db_Username, Db_Password);
			// Print message to show successful Connection on ATM Screen
			msg = "Database Connection: Established Successfully!";
			System.out.println(msg+"\n");
			
			// Calls the GUI class which will now start the GUI after successful Connection
			atm_gui gui = new atm_gui();
			gui.ConnectionMessage();

		}
		catch (SQLException e) {
			//Print Error Message to ATM Screen in case of unsuccessful connection to Database
			System.err.print("Unexpected Failure!!\nCould not establish connection to DataBase...\n");
			System.err.println("Please check whether the LocalHost server was Activated!");
		}
	}
}
