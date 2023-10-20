public class Hollow_rhombus {
    public static void main(String[] args) {
        {
            int i, j;
            int rows =6;
            for (i=1; i<=rows; i++)
            {
                for (j=1; j<=rows - i; j++)
                    System.out.print(" ");
                  
                if (i==1 || i==rows)
                    for (j=1; j<=rows; j++)
                        System.out.print("*");
                      
                else
                    for (j=1; j<=rows; j++)



    if (j==1 || j==rows)
                            System.out.print("*");
                        else
                            System.out.print(" ");
                System.out.println();
             }
        }
    }
}
