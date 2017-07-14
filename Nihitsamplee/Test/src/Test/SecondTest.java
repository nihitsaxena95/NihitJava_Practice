package Test;

public class SecondTest {

	public String check(int x) {
		if(x ==10) {
			return "10";
		}
		else if(x == 20) {
			return("20");
		}
		else if( x > 50 && x < 100) {
			return("50-100");
		}
		else if( x > 100) {
			return("I am more than 100");
		} 
		else {
			throw new IllegalArgumentException("Not valid");
		}
	}
}
