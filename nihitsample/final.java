class A {
	final int i = 0;
	void use() {
		System.out.print(i);
	}
	public static void main() {
		A a = new A();
		a.use();
	}
}