package Test;

public class Forthtest {
private String mess;
Forthtest(String mess) {
	this.mess = mess;
}

String prtmess() {
	System.out.println(mess);
	return mess;
}

public String modmess() {
	mess = "hi" + mess;
	System.out.println(mess);
	return mess;
}
}
