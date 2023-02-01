import java.util.*;
class Solution {
    public String gcdOfStrings(String str1, String str2) {
        int len2=str2.length();
        int len1=str1.length();
        for(int i=len2;i>0;i--){
            if(len2%i!=0||i>len1||len1%i!=0){
                continue;
            }
            String sub=str2.substring(0,i);
            if(isGcd(sub,str2)&&isGcd(sub,str1)){
                return sub;
            }
        }
        return "";
    }
    public boolean isGcd(String sub,String target){
        String r="";
        int k=target.length()/sub.length();
        for(int i=0;i<k;i++){
            r+=sub;
        }
        return r.equals(target);
    }
}
