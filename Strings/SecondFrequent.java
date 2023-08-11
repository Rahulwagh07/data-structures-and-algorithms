import java.util.HashMap;
import java.util.Map;

public class SecondFrequent {
    String secFrequent(String arr[], int N)
    {
        HashMap<String, Integer> countMap = new HashMap<>();
        
        for (String s : arr) {
            countMap.put(s, countMap.getOrDefault(s, 0) + 1);
        }
        
        int firstMaxCount = Integer.MIN_VALUE;
        int secondMaxCount = Integer.MIN_VALUE;
        
        for (int count : countMap.values()) {
            if (count > firstMaxCount) {
                secondMaxCount = firstMaxCount;
                firstMaxCount = count;
            } else if (count > secondMaxCount && count < firstMaxCount) {
                secondMaxCount = count;
            }
        }
      
        for (Map.Entry<String, Integer> entry : countMap.entrySet()) {
            if (entry.getValue() == secondMaxCount) {
                return entry.getKey();
            }
        }
        
        return "";
    
    
    }
}
