package project1;
import project2.A;

public class Accessmodifier {
	

		public static void main(String[] args) {

			A a1 = new A();
			
			a1.method1A();
			
			int result = a1.method2A(3);
			System.out.println("result = "+result);
			
		}

	}

