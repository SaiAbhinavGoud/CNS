import java.util.*;
import java.io.*;
 
public class task1 {
    public static void main(String[] args) {
        Scanner sc =new Scanner(System.in);
        int x = sc.nextInt();
        String s1 = sc.next();
        String ans = "";System.out.println(s1);
        for(int i =0 ; i< s1.length();i++){
            char c = s1.charAt(i);
            char c1 = c;
            if(c>='A'&&c<='Z'){
                c = (char)(c+ (x%26)); 
                if(c>'Z'){
                    c = (char)(c-26);
                }
            }
            else{
                c = (char)(c+ (x%26)); 
                if(c>'z'){
                    c = (char)(c-26);
                }
            }
            ans+=c;
        }
        System.out.println(ans);
        String dec = "";
        for (int i = 0; i < ans.length(); i++) {
            char c = ans.charAt(i);
            char c1 = c;
            if(c>='A'&&c<='Z'){
                c = (char)(c- (x%26)); 
                if(c<'A'){
                    c = (char)(c+26);
                }
            }
            else{
                c = (char)(c- (x%26)); 
                if(c<'a'){
                    c = (char)(c+26);
                }
            }
            dec+=c;
        }
        System.out.println(dec);

    }
}