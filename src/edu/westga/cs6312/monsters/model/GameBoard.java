package edu.westga.cs6312.monsters.model;

/**
 * A class that creates a GameBoard to keep track of gameplay.
 * @author Allen Pierson
 * @version 02132019
 */
public class GameBoard {
	private Room[] theMap;
	private Player thePlayer; 
	private int currentRoom;
	
	/**
	 * Constructor that instantiates the instance variables
	 */
	public GameBoard() {
		this.setupBoard();
	}
	
	private void setupBoard() {
		this.thePlayer = new Player();
		this.theMap = new Room[10];
		for (int current = 0; current < this.theMap.length; current++) {
			this.theMap[current] = new Room(current);
		}
		this.currentRoom = 0;
	}
	
	/**
	 * Getter method for the current Player
	 * @return the current Player object
	 */
	public Player getPlayer() {
		return this.thePlayer;
	}
	
	/**
	 * Getter method for the current room number
	 * @return the current room number
	 */
	public int getCurrentRoom() {
		return this.currentRoom;
	}

	@Override
	public String toString() {
		return this.thePlayer.toString() + " that is currently in " + this.theMap[this.getCurrentRoom()].toString();
	}
}
