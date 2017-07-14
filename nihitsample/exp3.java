class Exp3 {
public static void main(String arg[]) {
String a = "Nihit";
try {
System.out.println(a.charAt(7));
}
catch(StringIndexOutOfBoundsException e) {
System.out.println("Caught"+e);
}
}
}