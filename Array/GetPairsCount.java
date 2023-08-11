import java.util.HashMap;
//Given an array of N integers, and an integer K, find the number of pairs of
// elements in the array whose sum is equal to K.

// The concept of using the complement in this context is derived from the fact 
// that if you have two numbers a and b such that a + b = K, then b = K - a. 
// This means that if you know one number (a) and the desired sum (K), 
// you can easily calculate the other number (b) that would complete the sum
public class GetPairsCount {
    int getPairsCount(int[] arr, int n, int k) {
        HashMap<Integer, Integer> map = new HashMap<>();
        int count = 0;
        
        for(int num : arr){
            int complement = k-num;
            if(map.containsKey(complement)){
                count += map.get(complement);
            }
            map.put(num, map.getOrDefault(num, 0) + 1);
        }
        return count;
    }
}
