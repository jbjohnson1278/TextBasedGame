/*
* Lamp.java
* Author: Jamison Johnson
* Submission Date: 11/7/2018
*
* Purpose: This is the lamp class of the project. This provides the lamp object's methods and variables used in Adventure.java
* The lamp is important for keeping the grue in the game away.
*
* Statement of Academic Honesty:
*
* The following code represents my own work. I have neither
* received nor given inappropriate assistance. I have not copied
* or modified code from any source other than the course webpage
* or the course textbook. I recognize that any unauthorized
* assistance or plagiarism will be handled in accordance with
* the University of Georgia's Academic Honesty Policy and the
* policies of this course. I recognize that my work is based
* on an assignment created by the Department of Computer
* Science at the University of Georgia. Any publishing
* or posting of source code for this project is strictly
* prohibited unless you have written consent from the Department
* of Computer Science at the University of Georgia.
*/

public class Lamp {

	/*
	 * Instance variables and methods go here, you're responsible for 
	 * choosing and naming them.
	 */
	
	private boolean isLit;
	
	public boolean isLit() // returns the value of isLit
	{
		return isLit;
	}
	
	public void light() // makes isLit true
	{
		isLit = true;
	}
}
