public class MinSwaps {
    static int minimumNumberOfSwaps(String s){
            
         
        int open=0;
        int n=s.length();
        int ans=0;
        for(int i=0;i<n;i++){
            if(s.charAt(i)=='['){
                if(open>0)ans+=open;
                open--;
            }
            else if(s.charAt(i)==']'){
                open++;
            }
        }
        return ans;
    }
}
