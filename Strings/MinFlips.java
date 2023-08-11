public class MinFlips {
    public int minFlips(String s) {
        // Code here
        int n=s.length();
        int c1=0,c2=0;
        for(int i=0;i<n;i++)
        {
            char ch=s.charAt(i);
            
            //0101 pattern
            if((i%2==0 && ch=='1')||(i%2==1 && ch=='0'))
            {
                c1++;
            }
            
            //1010 pattern
            if((i%2==0 && ch=='0')||(i%2==1 && ch=='1'))
            {
                c2++;
            }
        }
        return Math.min(c1,c2);
    }
}
