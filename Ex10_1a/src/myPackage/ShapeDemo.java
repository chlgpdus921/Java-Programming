package myPackage;

public class ShapeDemo {
	public static void main(String[] args){
		Shape[] f = new Shape[]{
			new Circle(3), new Rectangle(5,6), new RightTriangle(3,4)};
		Shape[] f2 = new Shape[]{
				new Circle(5), new Rectangle(5,6), new RightTriangle(3,3)};
			
		System.out.println(f[0].toString());
		System.out.println(f[1].toString());
		System.out.println(f[2].toString());
		System.out.println();

		System.out.println(f2[0].toString());
		System.out.println(f2[1].toString());
		System.out.println(f2[2].toString());
		System.out.println();

		System.out.println(f[0].equals(f2[0]));
		System.out.println(f[1].equals(f2[1]));
		System.out.println(f[2].equals(f2[2]));
		
	}

}
