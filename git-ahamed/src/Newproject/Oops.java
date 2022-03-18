package Newproject;

public class Oops {
	public static void main(String[] args) {
		
	
	GoodDog undertaker=new GoodDog();
	undertaker.execute(new biscuit());
	
	}
}
class Dog{
	public void play(String item) {
		if(item.equals("stick")) {
			System.out.println("dog bites......");
		}
		else if(item.equals("stone")) {
			System.out.println("dog barks.....");
		}
		else if(item.equals("biscuit")) {
			System.out.println("dog wags tail....");
		}
	}
}

abstract class Item{
	public abstract void action();
}
class stick extends Item{
	public void action() {
		System.out.println("Dog bites.....");
	}
}
class stone extends Item{
	public void action() {
		System.out.println("Dog Barks....");
		
	}
}
class biscuit extends Item{
	public void action() {
		System.out.println("Dog wags the tail....");
	}
}

class GoodDog{
	public void execute(Item item) {
		item.action();
		}
}