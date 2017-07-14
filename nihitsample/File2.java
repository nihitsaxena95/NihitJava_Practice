import java.io.*;

class File {
public static void main(String arg[]) {
try{
FileInputStream f = new FileInputStream("File1.txt");
int i=0;
while((i=f.read())!=-1) {
System.out.print((char)i);
}}
catch(Exception e) {
System.out.println(e);
}
}
}