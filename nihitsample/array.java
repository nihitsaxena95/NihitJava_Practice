import java.util.Scanner;

class Arr {
public static void main(String a[]) {
Scanner sc = new Scanner(System.in);
int[][] arr = new int[3][3];
for(int i=0;i<3;i++) {
for(int j=0;j<3;j++) {
arr[i][j] = sc.nextInt();
}
}
int k=0;
int[] temp = new int[3];
for(int i=0;i<3;i++) {
for(int j=2;j>=0;j--) {
temp[k]=arr[i][j];
k++;
}
k=0;
for(int j=0;j<3;j++) {
arr[i][j]=temp[j];
}
}

for(int i=0;i<3;i++) {
for(int j=0;j<3;j++) {
System.out.print(arr[i][j]+" ");
}
System.out.println("");
}
}
}