import java.util.Scanner;

public class Greatestamong{
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        System.out.print("enter three number");
        int a = sc.nextInt();
        int b = sc.nextInt();
        int c = sc.nextInt();
        sc.close();
        System.out.print("greatest number is :");
        System.out.println(a>b && b>c ? a:b>c?b:c);

    }
    
}
