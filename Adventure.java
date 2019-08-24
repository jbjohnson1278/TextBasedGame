/*
* Adventure.java
* Author: Jamison Johnson
* Submission Date: 11/7/2018
*
* Purpose: This is the main method class to run the UGA Adventures game. This class creates a player, map, and room object that are used to
* display information about the room's description and item from the Map.java class. This program runs a text-based adventure game. The goal of the game
* is to find the key in the caverns. Once you have found the key, you must find the chest and get the treasure inside into beat the game.
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

import java.util.Scanner;
public class Adventure {

	public static void main(String args[])
	{
		Scanner in = new Scanner(System.in);
		String response = "";
		Player player = new Player();
		Map map = new Map();
		Room room = map.getRoom(0,0);
		int x = 1;
		
		System.out.println("Welcome to UGA Adventures: Episode I");
		System.out.println("The Adventure of the Cave of Redundancy Adventure");
		System.out.println("By: Jamison Johnson");
		
		// loop for the game to run
		while (room.getChest() == null || x == 1)
		{
			//updates room
			room = map.getRoom(player.getX(), player.getY());
			// tells player a grue might be near if they do not have lamp or lamp is not lit and room is dark
			if (room.isDark() && (player.getLamp() == null || player.getLamp().isLit() != true))
				System.out.println("It is pitch black, you can't see anything. You may get eaten by a grue!");
			else if (response.equalsIgnoreCase("Look")) //prints what is in the room if response equals look
			{
				System.out.println(room.getDescription());
				if (room.getLamp() != null)
					System.out.println("There is an old lamp here that was made long ago");
				else if (room.getKey() != null)
					System.out.println("You see the outline of a key on a dusty shelf that's covered in dust");
				else if (room.getChest() != null)
					System.out.println("There is a large, wooden, massive, oaken chest here with the word \"Chest\" carved into it");
				if (room.canGoEast() || room.canGoWest() || room.canGoNorth() || room.canGoSouth()) // prints what the exits are
				{
					System.out.print("Exits are:");
					if (room.canGoNorth())
						System.out.print(" north");
					if (room.canGoSouth())
						System.out.print(" south");
					if (room.canGoEast())
						System.out.print(" east");
					if (room.canGoWest())
						System.out.print(" west");
					System.out.println("");
				}
				
			}
			else
				System.out.println(room.getDescription()); //prints information about the room
			
			response = in.nextLine(); // gets response
			
			if (response.equalsIgnoreCase("get lamp")) //gets lamp if room has one
			{
				if (room.getLamp() != null)
				{
					player.setLamp(room.getLamp());
					room.clearLamp();
					System.out.println("OK");
				} else
					System.out.println("No lamp present");
			}
			else if (response.equalsIgnoreCase("light lamp")) // lights lamp if player has one
			{
				if (player.getLamp() != null)
				{
					player.getLamp().light();
					System.out.println("OK");
				}else
				{
					System.out.println("You don't have the lamp to light");
				}
			}
			else if (response.equalsIgnoreCase("North")) // moves player north if they can, and if they have lamp and not eaten by grue
			{
				if (room.isDark() && (player.getLamp() == null || player.getLamp().isLit() != true))
				{
					System.out.println("You have stumbled into a passing grue, and have been eaten.");
					System.exit(0);
				}
				else if (room.canGoNorth())
				{
					player.setX(player.getX() - 1);
				}
				else
					System.out.println("You cannot go North from here");
			}
			else if (response.equalsIgnoreCase("South")) // moves player south if they can, and if they have lamp and not eaten by grue
			{
				if (room.isDark() && (player.getLamp() == null || player.getLamp().isLit() != true))
				{
					System.out.println("You have stumbled into a passing grue, and have been eaten.");
					System.exit(0);
				}
				else if (room.canGoSouth())
				{
					player.setX(player.getX() + 1);
				}
				else
					System.out.println("You cannot go South from here");
			}
			else if (response.equalsIgnoreCase("East")) // moves player east if they can, and if they have lamp and not eaten by grue
			{
				if (room.isDark() && (player.getLamp() == null || player.getLamp().isLit() != true))
				{
					System.out.println("You have stumbled into a passing grue, and have been eaten.");
					System.exit(0);
				}
				else if (room.canGoEast())
				{
					player.setY(player.getY() + 1);
				}
				else
					System.out.println("You cannot go East from here");
			}
			else if (response.equalsIgnoreCase("West")) // moves player west if they can, and if they have lamp and not eaten by grue
			{
				if (room.isDark() && (player.getLamp() == null || player.getLamp().isLit() != true))
				{
					System.out.println("You have stumbled into a passing grue, and have been eaten.");
					System.exit(0);
				}
				else if (room.canGoWest())
				{
					player.setY(player.getY() - 1);
				}
				else
					System.out.println("You cannot go West from here");
			}
			else if (response.equalsIgnoreCase("Look")) // look actions are at the beginning of the loop, so the program will go back to the beginning
				continue;
			else if (response.equalsIgnoreCase("Get Key")) // gets key if there is one present
			{
				if (room.getKey() != null)
				{
					player.setKey(room.getKey());
					System.out.println("OK");
					room.clearKey();
				}else
					System.out.println("No Key Present");
			}
			else if (response.equalsIgnoreCase("Open Chest")) //opens chest if chest is unlocked and there is a chest
			{
				if (room.getChest() != null && room.getChest().isLocked() == false)
				{
					System.out.println(room.getChest().getContents());
					System.exit(0);
				}
				else if (room.getChest() == null)
					System.out.println("No chest present");
				else
					System.out.println("The chest is locked");
			}
			else if (response.equalsIgnoreCase("Unlock Chest")) // unlocks chest if there is a chest and player has the key
			{
				if (player.getKey() != null && room.getChest() != null)
				{
					player.getKey().use(room.getChest());
					System.out.println("OK");
				}else if (player.getKey() == null && room.getChest() != null)
					System.out.println("Need a key to do any unlocking!");
				else
					System.out.println("No chest to unlock");
			}
			else // if response is not one of these choices, the program will say this
				System.out.println("I'm sorry I don't know how to do that.");
	}
	}
}
