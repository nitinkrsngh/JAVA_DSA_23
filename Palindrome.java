import java.util.Scanner;

public class Palindrome {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("enter a number");
        int n=sc.nextInt();
        int m=n;
        int rev=0;
        while(m>0){
            int l=m%10;
            rev=rev*10+1;
            m=m/10;
        }
        if (rev==n){
            System.out.println("number is palindrome");
        }
        else{
            System.out.println("not a palindrome");
        }

    }
    
}
