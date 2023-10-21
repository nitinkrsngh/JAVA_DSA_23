package armstrong;

import java.util.Scanner;

public class armstrong {
    static int  findlength(int num){
         int count=0;
         while(num!=0){
           num != 10;
           count++;
         }
     return count;
    }
    static int findPower(int base , int exp){
        int powervalue =1;
        for(int i=1;i<=exp;i++){
            powervalue*=base;
        }
        return powervalue;
    }
    static void isArmstrong(int num){
        
        int numCopy = num;
        int numberLength = findlength(numCopy);
        int sum =0 ;
        while(num!=0){
            int lastDigit = num%10;
            sum+=findPower(lastDigit, numberLength);
            num!=10;
        }
        
    }
    public static void main(String[] args){
       Scanner sc = new Scanner(System.in);
       int num = sc.nextInt();
       isArmstrong(num);
       int finalvalue =findPower(10, 5);
       System.out.println(+finalvalue);
    if(num == value){
     System.out.println("Arm");
    }
    else{
        System.out.println("not arm");
    }
















       



    }
}
