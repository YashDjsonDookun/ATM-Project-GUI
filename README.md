## ATM-Project-GUI

# First true implementation of a GUI

--> This was my project for my 1st year of University.. so i have no idea if i have any rights to put this here!
(until further notice, have a good time cringing at my bad code XD)

StudentName: Yash Djson Dookun


Course: BSc (Hons.) Web & Multimedia Development


What does this Program do?


- Create a Graphical User Interface (GUI) and a Java Program that mimics the
function of an ATM Machine. (with features as per – but not limited to –
requirement sheet)


Pre-Requisites:
- Some Java IDE
(Tested on:
- [x] Eclipse IDE for Enterprise Java Developers.
Version: 2019-03 (4.11.0)
- [x] IntelliJ IDEA 2019.1.1))
- [x] Java (Version Used: 11.0.2)
(Recommended same is used or Potential User will have to re-compile)
- MySQL-Connector JDBC Driver
(mysql-connector-java-8.0.15.jar used) – Included in Project Folder for ease of
use
- Basic understanding of your IDE to configure the buildpath


Included:
- 3 JAVA files (in src folder)
- [x] atm_main.java (Main Method)
- [x] atm_gui.java (GUI Class)
- [x] ConnectDatabase.java (Class Responsible to establish Primary Connection)
- mysql-connector-java-8.0.15.jar
- Basic Flowchart demonstrating the flow of ATM Execution


How to launch?
- [x] Import the Java Project Folder in IDE of choice (Tested in Eclipse and JetBrains
IntelliJ IDEA)  Project folder is ‘ATM’
- [x] Configure Buildpath to use your Java version (Tested on 11.0.2) and to link
JDBC Driver (Tested with mysql-connector-java-8.0.15.jar – Included)
- [x] Edit ‘Database Credentials’ in ConnectDatabase.java to match your own
database otherwise program will not even launch (As an additional ‘Security’
Feature)
- [x] Once again, if Primary Connection with Database is not established
successfully, GUI will NOT even launch.
- [x] Run Main Method (if everything went fine, a successful message should
appear in the Console – only for developer use; & GUI should appear for
client)


What Works?
- Simply everything that was asked in the requirements


What was Tested?
- [x] Everything
- [x] In eventuality of wrong Pin codes (both after single tries and the 3 wrong
tries)
- [x] Menu options
- [x] Successful withdrawals while updating Database
- [x] Unsuccessful withdrawals due to insufficient funds (and 3 seconds delay
after printing adequate message before automatically showing Options
Menu again)
- [x] Unsuccessful withdrawals due to Transaction exceeding Rs 2000
- [x] Unsuccessful withdrawals due to Invalid Amounts (example: withdrawing
less than Rs 100 or withdrawing non-multiples of 100)
- [x] Eventuality that someone wants to withdraw everything from his/her
account and empty the latter
- [x] Ability to clear screen if Amount input was a mistake (to note that the clear
button acts literally as a CLEAR button and not a BACKSPACE button) –
Also, to note that this works only while entering Amounts and not for Pin
Code
- [x] Ability to verify NEW balance by clicking ‘OPTION 1’ after successful
transaction without having to exit and launch program again.


KNOWN BUG:
- [x] If card is inserted again in the same launch session after having clicked Exit
(Did not bother to fix it because it is beyond Requirements Scope)
- [x] That’s all.
