
public class Solution {
    public String reverseWords(String s) {
        String a[] = s.trim().split("\\s+");
        int n = a.length;
        String rev;
        if(n == 0){
            rev = "";
        }
        else{
            if(n == 1){
                rev = "" + a[0];
                
            }
            else{
                rev = "";
                for(int i = n-1; i > 0; i--){
                    rev = rev + a[i] + " ";
                    
                }
                rev = rev + a[0];
            }
        }
        return rev;
        
    }
}
