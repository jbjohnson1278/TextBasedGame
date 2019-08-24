/*
* Player.java
* Author: Jamison Johnson
* Submission Date: 11/7/2018
*
* Purpose: This is the player class of the project. This provides the player object's methods and variables used in Adventure.java
* The player represents the user going through the world in game.
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

public class Player {

	
	private int x = 0;
	private int y = 0;
	private Lamp playerLamp;
	private Key playerKey;
	
	public void setLamp(Lamp lamp) // sets the lamp found to the player's lamp
	{
		playerLamp = lamp;
	}
	
	public Lamp getLamp() // returns the lamp the player has
	{
		return playerLamp;
	}
	
	public void setKey(Key key) // sets the key found to the player's key
	{
		playerKey = key;
	}
	
	public Key getKey() // returns the key the player has
	{
		return playerKey;
	}
	
	public void setX(int x) // changes the player's x coordinate
	{
		this.x = x;
	}
	
	public int getX() // returns the player's x coordinate
	{
		return x;
	}
	
	public void setY(int y) // changes the player's y coordinate
	{
		this.y = y;
	}
	
	public int getY() //returns the player's y coordinate
	{
		return y;
	}
}
