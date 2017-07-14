import java.io.*;

class File {
public static void main(String arg[]) {
try{
FileOutputStream f = new FileOutputStream("File1.txt");
String data = "Hey i am Nihit";
byte a[] = data.getBytes();
f.write(a);
f.close();
}
catch(Exception e) {
System.out.println(e);
}
}
}