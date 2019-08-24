/*
* Chest.java
* Author: Jamison Johnson
* Submission Date: 11/7/2018
*
* Purpose: This is the chest class of the project. This provides the chest object's methods and variables used in Adventure.java
* The chest is important because once it is unlocked and the contents are revealed, the game is won.
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

public class Chest {

	/*
	 * Instance variables go here, you're responsible for choosing
	 * which ones are needed and naming them
	 */
	
	private boolean isLocked;
	private String contents;
	private Key lockKey;

	/**
	 * This method is used by the Map class, you won't need to call it yourself
	 * It should result in this chest being locked and storing which key locked it.
	 */
	public void lock(Key theKey) // locks the chest and saves the key that locked it
	{
		isLocked = true;
		lockKey = theKey;
	}
	
	/**
	 * If theKey is the same key that was used to lock this chest, then
	 * the chest is unlocked.  Otherwise this method does nothing.
	 */
	public void unLock(Key theKey) // if the key is the same key that locked it, the chest will unlock
	{
		if (theKey == lockKey)
			isLocked = false;
	}
	
	/**
	 * Should return true if the chest is locked, false otherwise
	 */
	public boolean isLocked() // returns whether the chest is locked
	{
		if (isLocked)
			return true;
		else
			return false;
	}
	
	/**
	 * Return a string describing the contents of the chest.
	 */
	public String getContents() // returns the contents of the chest
	{
		return contents;
	}
	
	/**
	 * Set the contents of the chest to this string.  You should not need to call
	 * this method in your program (though you have to implement it anyway).
	 */
	public void setContents(String contents) // changes the contents of the chest
	{
		this.contents = contents;
	}
	
	
	
}
