package myPackage;

public class CounterDemo {
	public static void main(String[] args){
		ClassCounter cnt = new ClassCounter();

		cnt.increase();
		cnt.increase();
		cnt.increase();
		System.out.println("current counter: "+ cnt.getCount());
		cnt.decrease();
		cnt.decrease();
		cnt.decrease();
		System.out.println("current counter: "+ cnt.getCount());
		cnt.decrease();
		System.out.println("current counter: "+ cnt.getCount());
	}

}
