import java.util.*;

class Palin {
public static void main(String a[]) {
Scanner sc = new Scanner(System.in);
System.out.println("Enter the string");
String sample = sc.nextLine();
System.out.println("you entered "+sample);
char temp[] = sample.toCharArray();
char[] rev = new char[temp.length];int j=0;
for(int i=temp.length-1;i>=0;i--) {
rev[j]=temp[i];
j++;}
String rever = new String(rev);
System.out.println(rever);
if(sample.equals(rever)) {
System.out.println("Is paliondrome");}
else {
System.out.println("Not");
}}}