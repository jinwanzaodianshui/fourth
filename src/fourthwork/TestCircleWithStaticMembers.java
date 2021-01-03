package fourthwork;

public class TestCircleWithStaticMembers {
	public static void main(String[] args) {
		System.out.print("Before creating objects");
		System.out.print("The number of Circle object is " +
		 CircleWithStaticMembers.numberOfObjects);
		CircleWithStaticMembers c1 = new CircleWithStaticMembers();
		System.out.print("\nAfter creating c1");
		System.out.print("c1: radius (" + c1.radius +
				c1.numberOfObjects + ")");
		CircleWithStaticMembers c2 = new CircleWithStaticMembers(5);
		c1.radius = 9;
		System.out.print("\nAfter creating c2 and modifying c1");
		System.out.print("c1: radius (" + c1.radius +
				c1.numberOfObjects + ")");
		System.out.print("c1: radius (" + c2.radius +
				c2.numberOfObjects + ")");
	}
}
