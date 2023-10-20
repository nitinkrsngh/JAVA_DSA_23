import java.util.Scanner;

public class Rombusopposite {
    public static void main(String[] args) {
        Scanner scan=new Scanner(System.in);
        
        System.out.println("Enter the size : ");
	int size=scan.nextInt();	 
 
	for(int i=1;i<=size;i++)
               {
	        for(int j=1;j<=size-i;j++)
                
                        {
                               System.out.print(" ");
                        }
                       for(int j=1;j<=size;j++)
                
                        {
                               System.out.print("*");
                        }
                   
                            System.out.println();
    }
    
}
}
