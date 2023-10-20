import java.util.Scanner;

public class Bmi {
    public static void main(String[] args){
        Scanner s= new Scanner(System.in);
    System.out.println("enter the height"); 
   float a = s.nextFloat();
    System.out.println("enter the weight"); 
   float b = s.nextFloat();
   float bmi=a/b*b;
   System.out.println("BMI+bmi");
   System.out.println((bmi<20)?"underweight":(bmi==20 || bmi<=25)?"normal weight":(bmi>25 ||bmi<28)?"over weight":"obses");

}
    
}
