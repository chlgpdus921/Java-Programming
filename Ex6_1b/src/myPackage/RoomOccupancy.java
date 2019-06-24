package myPackage;

public class RoomOccupancy {
	private int roomNumber, peopleInRoom;
	private static int totalNumber = 0;

	RoomOccupancy(int roomNumber, int peopleInRoom) {
		this.roomNumber = roomNumber;
		this.peopleInRoom = peopleInRoom;
		totalNumber += peopleInRoom; 
	}

	public void addOneToRoom() {
		peopleInRoom++;
		totalNumber++;
	}

	public void removeOneFromRoom() {
		if ((peopleInRoom > 0) && (totalNumber > 0)) {
			peopleInRoom--;
			totalNumber--;
		} else
			System.out.println("people is not here");
	}

	public int getNumber() {
		return roomNumber;
	}

	public static int getTotal() {
		return totalNumber;
	}
}
