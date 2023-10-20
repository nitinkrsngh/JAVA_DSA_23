import java.security.Key;
import java.util.HashMap;
import java.util.Map;

public class CountFrequency {
    public static void main(String[] args){
        int arr[] = { 1, 1, 2, 3, 1, 1, 3, 4, 4, 5};
        HashMap<Integer,Integer> map = new HashMap<>();
        for(int num:arr)
        {
            map.put(num, map.getOrDefault(num ,0)+1);
        }
        System.out.println(map);
        System.out.println( "IS value" + map.containsKey(3));
        System.out.println( "Value is " + map.get(3));
    }
    
}
