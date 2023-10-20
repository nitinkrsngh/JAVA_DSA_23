import java.util.Scanner;

public class Calculator {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a,b,ch;
        System.out.println("enter any number ");
        a = sc.nextInt();
      System.out.println("enter any number");
        b = sc.nextInt();
        System.out.println("choose a operation :\n1 ADDITION\n2 SUBTRACTION\n3 MULTIPICATION\n4 DIVIDE");
        System.out.println("enter your choice");
         ch = sc.nextInt();
        switch (ch) 
        {
            case 1:
            System.out.println(" a + b ");
            break;
            case 2:
            System.out.println(" a - b ");
            break;
            case 3:
            System.out.println(" a * b ");
            break;
            case 4:
            System.out.println(" a / b ");
            break;
            default:
            System.out.println("You have entered wrong output....");

        }
        sc.close();
    } 
    
}
