import java.util.Stack;

public class CountReversal {
    int countRev (String s)
    {   Stack<Character> st = new Stack<>();
        int n = s.length();
        if(n % 2 == 1){
            return -1;
        }
        for(int i=0; i<n; i++){
            char ch = s.charAt(i);
            if(ch == '{'){
                st.push(ch);
            }
            else{
                if(!st.isEmpty() && st.peek() == '{'){
                    st.pop();
                } else {
                    st.push(ch);
                }
            }
        }
        //invalid expression
        int a=0; int b=0;  //a-> open count b-> close count
        while(!st.isEmpty()){
            if(st.peek() == '{'){
                a++;
            } else {
                b++;
            }
            st.pop();
        }
        int count = (a + 1)/2 + (b + 1)/2;
        return count;
        
    }
}
