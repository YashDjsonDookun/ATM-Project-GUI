/*
 * StudentName: Yash Djson Dookun
 * Task: Create a Graphical User Interface (GUI) and a Java Program that mimics
 * 		 the function of an ATM Machine.
 */

import java.awt.*;
import java.awt.event.*;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;
import javax.swing.*;

public class atm_gui extends ConnectDatabase {
	private int i;
	private String UserInput = "";
	String Temp = "";
	public boolean x = false;
	private JButton InsertCard, b1, b2, b3, b4, b5, b6, b7, b8, b9, b0, bOK, bOption1, bOption2, bClear, bExit;
	private JLabel LabelTop;
	private static JTextArea screen;
	public boolean clicked = false;
	private int badTries;
	public boolean inputFlag;
	private static String amountEntered = "";
	
	// Handles all the key Inputs
	public void InputKey() {
		// Disables Keypad
		disableButton();
		
		b0.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if (inputFlag != true) {
					if (e.getSource() == b0) {
						UserInput += "0";
						Temp += "0";
						x = true;
						if (x = true) {
							censorPin();
						}
						if (i >= 3) {
							disableButton();
						}
						i++;
					}
				}
				else if (inputFlag = true) {
					amountEntered += "0";
					screen.append("0");
				}
			}
		});
		b1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if (inputFlag != true) {
					if (e.getSource() == b1) {
						UserInput += "1";
						Temp += "1";
						x = true;
						if (x = true) {
							censorPin();
						}
						if (i >= 3) {
							disableButton();
						}
						i++;
					}
				}
				else if (inputFlag = true) {
					amountEntered += "1";
					screen.append("1");
				}
			}
		});
		b2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if (inputFlag != true) {
					if (e.getSource() == b2) {
						UserInput += "2";
						Temp += "2";
						x = true;
						if (x = true) {
							censorPin();
						}
						if (i >= 3) {
							disableButton();
						}
						i++;
					}
				}
				else if (inputFlag = true) {
					amountEntered += "2";
					screen.append("2");
				}
			}
		});
		b3.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if (inputFlag != true) {
					if (e.getSource() == b3) {
						UserInput += "3";
						Temp += "3";
						x = true;
						if (x = true) {
							censorPin();
						}
						if (i >= 3) {
							disableButton();
						}
						i++;
				    }
				}
				else if (inputFlag = true) {
					amountEntered += "3";
					screen.append("3");
				}
			}
		});
		b4.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if (inputFlag != true) {
					if (e.getSource() == b4) {
						UserInput += "4";
						Temp += "4";
						x = true;
						if (x = true) {
							censorPin();
						}
						if (i >= 3) {
							disableButton();
						}
						i++;
					}
				}
				else if (inputFlag = true) {
					amountEntered += "4";
					screen.append("4");
				}
			}
		});
		b5.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if (e.getSource() == b5) {
					if (inputFlag != true) {
							UserInput += "5";
						Temp += "5";
						x = true;
						if (x = true) {
							censorPin();
						}
						if (i >= 3) {
							disableButton();
						}
						i++;
					}
					else if (inputFlag = true) {
						amountEntered += "5";
						screen.append("5");
					}
				}
			}
		});
		b6.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if (e.getSource() == b6) {
					if (inputFlag != true) {
						UserInput += "6";
						Temp += "6";
						x = true;
						if (x = true) {
							censorPin();
						}
						if (i >= 3) {
							disableButton();
						}
						i++;
					}
					else if (inputFlag = true) {
						amountEntered += "6";
						screen.append("6");
					}
				}
			}
		});
		b7.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if (e.getSource() == b7) {
					if (inputFlag != true) {
						UserInput += "7";
						Temp += "7";
						x = true;
						if (x = true) {
							censorPin();
						}
						if (i >= 3) {
							disableButton();
						}
						i++;
					}
					else if (inputFlag = true) {
						amountEntered += "7";
						screen.append("8");
					}
				}
			}
		});
		b8.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
					if (e.getSource() == b8) {
						if (inputFlag != true) {
						UserInput += "8";
						Temp += "8";
						x = true;
						if (x = true) {
							censorPin();
						}
						if (i >= 3) {
							disableButton();
						}
						i++;
					}
					else if (inputFlag = true) {
						amountEntered += "8";
						screen.append("8");
					}	
				}
			}
		});
		b9.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
					if (e.getSource() == b9) {
						if (inputFlag != true) {
							UserInput += "9";
						Temp += "9";
						x = true;
						if (x = true) {
							censorPin();
						}
						if (i >= 3) {
							disableButton();
						}
						i++;
					}
						else if (inputFlag = true) {
							amountEntered += "9";
							screen.append("9");
						}
				}
			}
		});
		bOK.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if (e.getSource() == bOK) {
					if (inputFlag != true) {
						UserInput.toString();
						System.out.println("\nPin Entered: " + UserInput);
						if (UserInput.length() == 4) {
							do {
								checkPin();
							}
							while (badTries == 3 );
						}
						else if (UserInput.length() > 4) {
							System.out.println("Amount: " + UserInput);
						}
						i = 0;
					}
					else if (inputFlag = true) {
						if (Integer.parseInt(amountEntered) > Balance && Integer.parseInt(amountEntered) <= 2000 ) {
							screen.setText("Insufficient funds!! \n ");
							amountEntered = "";
							Timer timer = new Timer(3000, new ActionListener() {
					            public void actionPerformed(ActionEvent arg0) {	

					            	optionMessage();
					            }
					        });
							timer.setRepeats(false);
					        timer.start(); 
						}
						else if (Integer.parseInt(amountEntered) > 2000) {
							screen.setText("Maximum withdrawal per transaction is Rs 2000!! \n ");
							optionMessage();
							amountEntered = "";
						}
						else if (Integer.parseInt(amountEntered) < 100) {
							screen.setText("Transaction Cannot be less than Rs 100 \n ");
							optionMessage();
							amountEntered = "";
						}
							else {
							Statement stmt;
							do {
								if ((Integer.parseInt(amountEntered) % 100) == 0) {
							try {
							  stmt = conn.createStatement();
							  if (Integer.parseInt(amountEntered) == Balance) {
								  Balance -= Integer.parseInt(amountEntered);
								  String updateDatabase = "UPDATE users " +"SET Balance = "+ Balance + " WHERE UserID = " + ID;
							      stmt.executeUpdate(updateDatabase);
							      bOption1.setEnabled(false);
							      bOption2.setEnabled(false);
							      screen.setText("\n \n Please note that You are about to empty your balance!");
							      screen.append("\n \n Please collect your money \n \n");
							      countCurrency(Integer.parseInt(amountEntered));
							      screen.append("Thank you for using Alibaba Mauritius.");
							      System.out.println("New Balance: RS " + Balance);
							      InsertCard.setEnabled(true);
							      disableButton();
								  break;
							  }
							  else {
								  Balance -= Integer.parseInt(amountEntered);
							      String updateDatabase = "UPDATE users " +"SET Balance = "+ Balance + " WHERE UserID = " + ID;
							      stmt.executeUpdate(updateDatabase);
							      bOption1.setEnabled(false);
							      bOption2.setEnabled(false);
							      screen.setText("\n \n Please collect your money \n \n");
							      countCurrency(Integer.parseInt(amountEntered));
							      screen.append("Thank you for using Alibaba Mauritius.");
							      System.out.println("New Balance: RS " + Balance);
							      InsertCard.setEnabled(true);
							      disableButton();
							      break;
							  }
						    }
							catch (SQLException s) {
								System.err.print("Unexpected Error!");
							}
								}
								else {
									screen.setText("Transaction Failed!! \n \n");
									screen.append("ATM only dispenses notes of Rs 100, Rs 200, Rs 500 \n and Rs 1000! \n \n");
									optionMessage();
									amountEntered = "";
									break;
								}
							} while ((Integer.parseInt(amountEntered) % 100) == 0);
						}
					}
				}
			}
		});
		bClear.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if (inputFlag = true) {screen.setText(" OPTION 2 - Withdraw Cash from the Account \n \n \n \n");
				inputFlag = true;
				askAmount();
				enableButton();
				amountEntered = "";
				}
			}
		});
		bExit.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				CancelOperation();
				disableButton();
			}
		});
	}
	
	// Function Responsible for Dispensing Notes
	public static void countCurrency(int amount) {
		int[] notes = new int[]{1000, 500, 200, 100}; 
		int[] noteCounter = new int[4]; 
		        
		for (int i = 0; i < 4; i++) { 
			if (amount >= notes[i]) { 
				noteCounter[i] = amount / notes[i]; 
		        amount = amount - noteCounter[i] * notes[i]; 
		     } 
		} 
		// Print notes 
		for (int i = 0; i < 4; i++) { 
			if (noteCounter[i] != 0) { 
				screen.append(noteCounter[i] + " Notes of Rs "+ notes[i] + "\n"); 
		    }
		} 
    }

     //Function responsible for Cancelling Operations
	void CancelOperation()	{
		if (clicked = true) {
			InsertCard.setEnabled(true);
			clicked = false;
			screen.setText("Thank you for using Alibaba Mauritius.");
			disableButton();
		}
	}

	// Function responsible to Trap Card after 3 wrong Pin Attempts
	void trapCard() {
		if (badTries < 3) {
			screen.setText("Incorrect Pin! \n");
			screen.append("Try Again... \n");
			screen.append("Enter 4 Digit Pin: \n");
			UserInput = "";
			enableButton();
			checkPin();
		}
		else if (badTries == 3) {
			InsertCard.setEnabled(true);
			disableButton();
			clicked = false;
			screen.setText("Incorrect PinCode entered 3 times! \n");
			screen.append("Your card has been blocked. Contact your bank. \n");
			screen.append("Thank you for using Alibaba Mauritius.");
		}
	}
	
	// Function to execute Options as per user choice
	void options () {
		bOption1.addActionListener(new ActionListener() {
		public void actionPerformed(ActionEvent arg0) {
			screen.setText("OPTION 1 - View your Account Balance \n \n \n \n");
			screen.append("UserID: " + ID + "\n");
			screen.append("Full Name: " + FullName + "\n");
			screen.append("Balance: Rs " + Balance + "\n");
			}
		});
		bOption2.addActionListener(new ActionListener() {
		public void actionPerformed(ActionEvent arg0) {
			screen.setText(" OPTION 2 - Withdraw Cash from the Account \n \n \n \n");
			inputFlag = true;
			askAmount();
			enableButton();
			bClear.setEnabled(true);
			}
		});	
	}
	
	// function to print AskAmount Message on screen
	void askAmount() {
		screen.append("Amount to be Withdrawn: \n");
	}
	
	// Function to display the Options - menu on the screen
	static void optionMessage (){
		screen.append("Would you like to \n \n");
		screen.append("OPTION 1 - View your Account Balance? \n");
		screen.append("OPTION 2 - Withdraw Cash from the Account? \n");
		screen.append("Please click accordingly.");
	}
	
	// Function that compares User Input and PinCode from Database
	void checkPin () {
		String query = "SELECT * FROM `Users` WHERE `Pin` =" + UserInput;
		try {					
			conn = DriverManager.getConnection(Url, Db_Username, Db_Password);
			Statement st = conn.createStatement();
			rs = st.executeQuery(query);
			
			while (rs.next()) {
				ID = rs.getInt(1);
				FullName =  rs.getString(2);
				UserPin = rs.getString(3);
				Balance = rs.getInt(4);
			}
			if (UserPin.equals(UserInput)) {
				System.out.println("UserFound: " + FullName);
				System.out.println("Details:");
				System.out.println("UserID: " + ID);
				System.out.println("Full Name: " + FullName);
				System.out.println("User Pin: " + UserPin);
				System.out.println("Balance: Rs " + Balance);
				System.out.println();
				screen.setText("Welcome To Alibaba Mauritius, " + FullName + "\n");
				screen.append("\n");
				optionMessage();
				UserInput = "";
				options();
			}
			else {
				badTries += 1;
				trapCard();
			}
		} catch (Exception arg0) {
			System.err.print("\nUser Not Found");
		}
	}
	
	// Function that will enable the disabled buttons
	void enableButton() {
		b0.setEnabled(true);
		b1.setEnabled(true);
		b2.setEnabled(true);
		b3.setEnabled(true);
		b4.setEnabled(true);
		b5.setEnabled(true);
		b6.setEnabled(true);
		b7.setEnabled(true);
		b8.setEnabled(true);
		b9.setEnabled(true);
	}

	// Function that will disable enabled buttons
	void disableButton() {
		b0.setEnabled(false);
		b1.setEnabled(false);
		b2.setEnabled(false);
		b3.setEnabled(false);
		b4.setEnabled(false);
		b5.setEnabled(false);
		b6.setEnabled(false);
		b7.setEnabled(false);
		b8.setEnabled(false);
		b9.setEnabled(false);
	}

	// Function to censor PinCode entered on Screen
	void censorPin() {
		screen.append("*");
		x = false;
	}

	// Function that shows a Welcome Message after successful connection
	public void ConnectionMessage() {
		screen.setText("Welcome to Alibaba Mauritius Ltd" + "\n");
		screen.append("Please Insert Card to Proceed!");
		disableButton();
		InsertCard.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				InsertCard.setEnabled(false);
				screen.setText("Welcome! Please authenticate yourself!" + "\n");
				screen.append("Enter 4 Digit Pin: " + "\n");
				clicked = true;
				InputKey();
				enableButton();
			}
		});
	}
	
	// GUI elements and Properties
	public atm_gui() {
		// Create Frame
		JFrame frame = new JFrame();
		// Create "Top Label"
		LabelTop =  new JLabel("Alibaba Mauritius Ltd");
		// Create "ATM Screen"
		screen = new JTextArea("Loading Database" + "\n . \n . \n . \n");
		// Create "Button to Insert Card"
		InsertCard = new JButton("Enter Your Card");

		// Create Numpad
		b0 = new JButton("0");
		b1 = new JButton("1");
		b2 = new JButton("2");
		b3 = new JButton("3");
		b4 = new JButton("4");
		b5 = new JButton("5");
		b6 = new JButton("6");
		b7 = new JButton("7");
		b8 = new JButton("8");
		b9 = new JButton("9");
		bOption1 = new JButton("OPTION 1");
	 	bOption2 = new JButton("OPTION 2");
		bOK = new JButton("OK");
		bClear = new JButton("CLEAR");
		bExit = new JButton("EXIT");

		// Frame Properties
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setSize(700, 650);
		frame.setVisible(true);
		frame.getContentPane().setBackground(Color.DARK_GRAY);
		frame.getContentPane().setForeground(Color.DARK_GRAY);

		// Add components to Frame
		frame.getContentPane().setLayout(null);
		frame.getContentPane().add(screen);
		frame.getContentPane().add(LabelTop);
		frame.getContentPane().add(InsertCard);
		frame.getContentPane().add(b0);
		frame.getContentPane().add(b1);
		frame.getContentPane().add(b2);
		frame.getContentPane().add(b3);
		frame.getContentPane().add(b4);
		frame.getContentPane().add(b5);
		frame.getContentPane().add(b7);
		frame.getContentPane().add(b6);
		frame.getContentPane().add(b8);
		frame.getContentPane().add(b9);
		frame.getContentPane().add(bOption1);
		frame.getContentPane().add(bOption2);
		frame.getContentPane().add(bOK);
		frame.getContentPane().add(bClear);
		frame.getContentPane().add(bExit);

		// "Top Label" - Properties
		LabelTop.setBounds(261, 12, 164, 15);

		// "ATM Screen" - Properties
		screen.setEditable(false);
		screen.setBounds(30, 39, 300, 300);
		screen.setBackground(Color.GRAY);

		// "Button to Insert Card" - Properties
		InsertCard.setBounds(359, 301, 300, 37);

		// Numpad - Properties
		b0.setSize(89, 37);
		b1.setSize(89, 37);
		b2.setSize(89, 37);
		b3.setSize(89, 37);
		b4.setSize(89, 37);
		b5.setSize(89, 37);
		b6.setSize(89, 37);
		b7.setSize(89, 37);
		b8.setSize(89, 37);
		b9.setSize(89, 37);
		bOption1.setSize(173, 37);
		bOption2.setSize(173, 37);
		bOK.setSize(89, 37);
		bClear.setSize(89, 37);
		bExit.setSize(295, 24);

		b0.setLocation(384, 455);
		b1.setLocation(35, 351);
		b2.setLocation(136, 351);
		b3.setLocation(236, 351);
		b4.setLocation(35, 412);
		b5.setLocation(136, 412);
		b7.setLocation(35,472);
		b6.setLocation(236, 412);
		b8.setLocation(136, 472);
		b9.setLocation(236, 472);
		b0.setLocation(136, 532);
		bOption1.setLocation(340, 95);
		bOption2.setLocation(340, 157);
		bOK.setLocation(236, 532);
		bClear.setLocation(35, 532);
		bExit.setLocation(35, 581);
		
		bClear.setEnabled(false);	
	}
}
