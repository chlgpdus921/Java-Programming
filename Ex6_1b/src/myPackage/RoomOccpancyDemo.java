package myPackage;

public class RoomOccpancyDemo {
	public static void main(String[] args) {
		RoomOccupancy room= new RoomOccupancy(406,5);
		room.addOneToRoom();
		room.addOneToRoom();
		room.removeOneFromRoom();
		room.removeOneFromRoom();
		System.out.println("roomNumber: "+ room.getNumber());
		System.out.println("total Number: " + RoomOccupancy.getTotal()+"\n");
		
		RoomOccupancy room2 = new RoomOccupancy(104,2);
		room2.removeOneFromRoom();
		room2.removeOneFromRoom();
		room2.removeOneFromRoom();
		room2.addOneToRoom();
		room2.addOneToRoom();
		System.out.println("roomNumber: "+ room2.getNumber());
		System.out.println("total Number: " + RoomOccupancy.getTotal());
		
		
	}

}
