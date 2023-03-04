import java.util.Arrays;

public class App1 {

	public static void main(String[] args) {
		Class c1=App1.class;
		System.out.println("c1 obj class name::"+c1.getClass());
		System.out.println("c1 obj data::"+c1.toString());

		System.out.println("c1 obj data class Name::"+c1.getName());

		System.out.println("c1 obj data class Name super class name::"+c1.getSuperclass());

		System.out.println("c1 obj class list of implemented interface::"+Arrays.toString(c1.getInterfaces()));

		System.out.println("c1 obj class list of methods:"+Arrays.toString(c1.getDeclaredMethods()));
		
		System.out.println("=================================================");
		Class c2=App1.class;
		System.out.println("c2 obj class name::"+c2.getClass());
		System.out.println("c2 obj data::"+c2.toString());

		System.out.println("c2 obj data class Name::"+c2.getName());

		System.out.println("c2 obj data class Name super class name::"+c2.getSuperclass());

		System.out.println("c2 obj class list of implemented interface::"+Arrays.toString(c2.getInterfaces()));

		System.out.println("c2 obj class list of methods:"+Arrays.toString(c2.getDeclaredMethods()));

	}

}
