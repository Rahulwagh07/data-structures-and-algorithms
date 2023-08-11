public class Removeconsecutive {
    public String removeConsecutiveCharacter(String S){
        char ch='a';
        String s1="";
        for(int i=0;i<S.length();i++){
            if(i==0){
                ch=S.charAt(i);
                s1=s1+ch;
        }
        else{
            if(ch==S.charAt(i)){
                continue;
            }
            else{
                ch=S.charAt(i);
                s1=s1+ch;
            }
        }
    }
    return s1;
    }
}
