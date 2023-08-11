public class CountAndSay {
    public String countAndSay(int n) {
        if(n == 1){
            return "1";
        }
        int freq = 0;
        String s = countAndSay(n-1); 
        StringBuilder sb = new StringBuilder();
        for(int i =0; i<s.length(); i++){
            freq++;
            if(i == s.length()-1 || s.charAt(i) != s.charAt(i+1)){
                sb.append(freq).append(s.charAt(i));
                freq = 0;
            }
        }
        return sb.toString();
    }
}
