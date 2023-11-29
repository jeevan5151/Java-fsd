package project1;

public class Innerclassassisted2 {


private String msg="Inner Classes";

 void display(){  
	 class Inner{  
		 void msg(){
			 System.out.println(msg);
		 }  
  }  
  
  Inner l=new Inner();  
  l.msg();  
 }  

 
public static void main(String[] args) {
	Innerclassassisted2   ob=new Innerclassassisted2  ();  
	ob.display();  
	}
}

