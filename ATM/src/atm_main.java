/* StudentID: 1810111
 * StudentName: Yash Djson Dookun
 * Task: Create a Graphical User Interface (GUI) and a Java Program that mimics
 * 		 the function of an ATM Machine.
 *		 (Main Method)
 */

public class atm_main{
	// Create Main Method
	public static void main(String[] args){
		// Call the ConnectDatabase class which calls the Gui on it's side
		// GUI will hence not work if Primary Connection to Database hasn't been made
		ConnectDatabase DB = new ConnectDatabase();
		DB.DB_Connect(); 
	}
}