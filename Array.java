public class Array {
    public static void main(String[] args) {
        int arr[] = { 111, 5, 8, 1, 2, 3, 13};
        int max = arr[0];
        for ( int i =  0; i < arr.length; i++) {
            if (arr[i] > max) {
                max = arr[i];
            }
        }
System.out.println("The max element is" + max);
    }
}
