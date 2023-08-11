public class SplitBinaryString {
    public static int maxSubstr(String s){
        int count0 = 0;
        int count1 = 0;
        int count = 0;
        for(int i =0; i< s.length(); i++){
            if(s.charAt(i) == '0'){
                count0++;
            } else{
                count1++;
            }
            if(count0 == count1){
                count++;
            }
        }
        if(count0 != count1){
            return -1;
        }
        return count == 0 ? -1 : count;
    }
    public static void main(String[] args) {
       String str = "010011001";
       System.out.println(maxSubstr(str));
    }
}
