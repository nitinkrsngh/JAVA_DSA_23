import java.util.Scanner;

public class NetSalary {
    public static void main(String[]args){

        Scanner sc= new Scanner(System.in);
        System.out.println("enter the income");
        int x = sc.nextInt();
        sc.close();
        if(x<10000)
            System.out.println("no tax");
        else if(x>=10000&&x<200000) 
        System.out.println("10% tax");
        else if(x>=20000&&x<30000)
        System.out.println("15% tax");
        else if(x>=30000)
        System.out.println("25% tax");
      


        }
    
}
