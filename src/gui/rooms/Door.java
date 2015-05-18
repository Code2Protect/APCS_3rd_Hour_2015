package rooms;

import entity.Entity;
import utilities.Utilities;

public class Door 
{
	//Fields
	public static Door[] doors = new Door[11];
	public static final int DOOR_SIZE = 1; 
	private int x;
	private int y;
	private Room assignedRoom;
	private int id;
	
	public Door(String[] data, int id)
	{
		this.id = id;
		
		//Utilities.printArray(data);
		x = Utilities.parseInt(data[0]);
		y = Utilities.parseInt(data[1]);
		assignedRoom = Room.rooms[Utilities.parseInt(data[2])];
	}//End constructor
	
	public Room getAssignRoom()
	{
		return assignedRoom;
	}//End getAssingRoom method
	
	public boolean onDoor(int x, int y)
	{
		return (this.x == x) && (this.y == y);
	}
	
	public void movePlayerIntoRoom(Entity entity)
	{
		System.out.println("Move into room");
		assignedRoom.setPlayerInRoom(entity);
	}//End movePlayerIntoRoom method
	
	public  void movePlayerOutOfRoom(Entity entity)
	{
		System.out.println("Move out of room");
	}//End movePlayerOutOfRoom method
}//End door class
