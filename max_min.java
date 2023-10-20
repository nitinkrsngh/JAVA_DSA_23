public class max_min {
    public static void main(String[] args) {
        int arr[] = { 2, 8, 3, 7, 5, 4 };
        int max = arr[0];
        int min = arr[0];
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] > max) {
                max = arr[i];
            }
            if (arr[i] < min) {
                min = arr[i];
            }
        }
System.out.println("The max element is" + max);
System.out.println("The min element is" + min);
    }
}
 
