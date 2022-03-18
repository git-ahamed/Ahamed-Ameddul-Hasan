package Newproject;

public class ClassAndObject {
	public static void main(String[] args) {
		House obj=new House();
		obj.room1();
		obj.room3();
		obj.room2();
	}
}

class House{
	void room1(){
		System.out.println("There are two people...");
	}
	void room2() {
		System.out.println("There are three people....");
		
	}
	void room3() {
		System.out.println("There are four people...");
		
	}
}
