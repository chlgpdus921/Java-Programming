package myPackage;

public class PurchaseDemo {
	public static void main(String[] args) {
		Purchase oneSale = new Purchase();
		double total = 0;
		oneSale.setName("Orange");
		oneSale.setPrice(10, 2.99);
		oneSale.setNumberBought(24);
		oneSale.writeOutput();
		System.out.println(oneSale.getName() + " cost: "+ oneSale.getTotalCost()+"\n");
		total = total + oneSale.getTotalCost();

		oneSale.setName("Eggs");
		oneSale.setPrice(12, 1.69);
		oneSale.setNumberBought(36);
		oneSale.writeOutput();
		System.out.println(oneSale.getName() + " cost: "+ oneSale.getTotalCost()+"\n");
		total = total + oneSale.getTotalCost();

		oneSale.setName("Apples");
		oneSale.setPrice(3, 1.00);
		oneSale.setNumberBought(20);
		oneSale.writeOutput();
		System.out.println(oneSale.getName() + " cost: "+ oneSale.getTotalCost()+"\n");
		total = total + oneSale.getTotalCost();

		oneSale.setName("Watermelons");
		oneSale.setPrice(1, 4.39);
		oneSale.setNumberBought(2);
		oneSale.writeOutput();
		System.out.println(oneSale.getName() + " cost: "+ oneSale.getTotalCost()+"\n");
		total = total + oneSale.getTotalCost();

		oneSale.setName("Bagels");
		oneSale.setPrice(6, 3.50);
		oneSale.setNumberBought(12);
		oneSale.writeOutput();
		System.out.println(oneSale.getName() + " cost: "+ oneSale.getTotalCost()+"\n");
		total = total + oneSale.getTotalCost();
		System.out.println("Total price : " + total);
	}
}