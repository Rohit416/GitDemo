package MultilevelInheritance;

public class MultiLevel {

	public static void main(String[] args) {
		A a1 = new A(3);
		B b1 = new B(6,9);
		C c1 = new C(3,6,9);
		System.out.println("****A Class ***");
		System.out.println(a1.i);
		System.out.println("****B Class ****");
		System.out.println(b1.i);
		System.out.println(b1.j);
		System.out.println("**** C Class ***");
		System.out.println(c1.i);
		System.out.println(c1.j);
		System.out.println(c1.k);
		
	}
		// TODO Auto-generated method stub

	}


