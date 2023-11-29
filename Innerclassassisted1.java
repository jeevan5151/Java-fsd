package project1;


public class Innerclassassisted1 {

	 private String msg="Welcome to Java"; 
	 
	 class Inner{  
	  void hello(){System.out.println(msg+", Let us start learning Inner Classes");}  
	 }  


	public static void main(String[] args) {

		Innerclassassisted1 obj=new Innerclassassisted1();
		Innerclassassisted1.Inner in=obj.new Inner();  
		in.hello();  
	}
}
