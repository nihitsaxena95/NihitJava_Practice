package sample;

class Lamba {
	final static String sal = "Hello";

	public static void main(String[] args) {
		Greet grt = mess ->
			System.out.print(sal + mess);
			grt.sayMess("Nihit");
	}
	interface Greet {
	void sayMess(String mess);
}
}

