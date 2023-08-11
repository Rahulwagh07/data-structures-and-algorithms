public class CheckRotation {
    public static boolean isRotation(String s1, String s2){
        int n = s1.length();
        int m = s2.length();

        if(n != m){
            return false;
        }
        int startIdx = 0;
        for(int i=0; i<s2.length(); i++){
            if(s1.charAt(0) == s2.charAt(i)){
                startIdx = i;
            }
        }
        for(int i=0; i<s1.length(); i++){
             
            if(s1.charAt(i) != s2.charAt((startIdx + i) % m)){
                return false;
            }
        }
        return true;
    }
    public static void main(String[] args) {
        String s1 = "ABCDEFGH";
        String s2 = "EFGHABCD";
        System.out.println(isRotation(s1, s2));
        
    }
}
