import java.util.Scanner;

public class Starpattern {
    public static void main(String[] args) {
 Scanner scan=new Scanner(System.in); 
int size,i,j;
  
System.out.print("Please enter the size: ");
 size=scan.nextInt();
for (i=1; i<=size; i++){
for (j=1; j<=size; j++){
System.out.print("*");       
 }
  System.out.print("\n");
}
}
}
