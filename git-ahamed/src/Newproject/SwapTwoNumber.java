package Newproject;

public class SwapTwoNumber {
	public static void main(String[] args) {
		float first=2.50f, second=5.5f;
		System.out.println("--Before Swap--");
		System.out.println("First Number =" +first);
		System.out.println("Second Number =" +second);
		float temporary=first;
		first=second;
		second=temporary;
		System.out.println("--After Swap");
		System.out.println("First number=" +first);
		System.out.println("Second Number=" +second);

	}
}
