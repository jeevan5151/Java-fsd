package project1;



	abstract class AnonymousInnerClass {
		   public abstract void display();
		}


		public class Innerclassassisted3 {

		public static void main(String[] args) {
		AnonymousInnerClass i = new AnonymousInnerClass() {

		         public void display() {
		            System.out.println("Anonymous Inner Class");
		         }
		      };
		      i.display();
		}
		}
		
