import java.util.Scanner;

public class ATM {
    public static void main(String[] args) {
        int balance = 10000;
        int withdrawl=0, deposits=0;
        Scanner sc = new Scanner(System.in);
        int choice;
        System.out.println("what you have to do...?\n1.check your BALANCE\n2.WITHDRAWAL\n3.DEPOSITS :");
        System.out.println("enter your choice");
        choice = sc.nextInt();
        switch(choice){
            case 1:
            balance =(balance+ deposits)-withdrawl;
            System.out.println("current balance" + balance );
            break;
            case 2:
            System.out.println("enter the amount: ");
            withdrawl = sc.nextInt();
            System.out.println("amount you withdrawl +withdrawl");
            balance = balance-withdrawl;
            System.out.println("current balancece + balance");
            break;
            case 3:
            System.out.println("enter the amount: ");
            withdrawl = sc.nextInt();
            System.out.println("amount you deposits + deposist");
            balance = balance + deposits;
            System.out.println("current balance + balance");
            break;
            default:
            System.out.println("you have enterd wrong choice...");


        }
        sc.close();

    }
    
}
