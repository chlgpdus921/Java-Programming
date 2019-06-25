package myPackage;

public class PersonDemo {
	public static void main(String[] args) {
		Person p = new Person();
		System.out.println(p.getName() + "  " + p.getAge());

		p = Person.createAdult();
		System.out.println(p.getName() + "  " + p.getAge());

		p = Person.createToddler();
		System.out.println(p.getName() + "  " + p.getAge());

		p = Person.createPreschooler();
		System.out.println(p.getName() + "  " + p.getAge());

		p = Person.createAdolescent();
		System.out.println(p.getName() + "  " + p.getAge());

		p = Person.createTeenager();
		System.out.println(p.getName() + "  " + p.getAge());

		p.setName("HyeYeon");
		p.setAge(23);
		System.out.println(p.getName() + "  " + p.getAge());
		p.setName("HyeYeon", "Choi");
		p.setAge(20);
		System.out.println(p.getName() + "  " + p.getAge());

	}

}
