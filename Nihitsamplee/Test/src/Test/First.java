package Test;

public class First {
public int multi(int x,int y) {
	if(x>999) {
		throw new IllegalArgumentException("X should be less than 1000");
	}
	return x*y;
}

public int add(int x,int y) {
	return x + y;
}
public int sub(int x,int y) {
	return x -  y;
}
}
