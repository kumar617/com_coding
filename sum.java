import java.io.*;
import java.util.*;
public class sum{
    public static void main(String[] args) {
        Scanner sc=new Scanner (System.in);
        int t= sc.nextInt();
        while(t>0){
            long n= sc.nextLong();
            long s=0;
            if(n>=2050 && n%2050==0){
                n=(long)n/2050;
                String st=""+n;
                for(int i=0;i<st.length();i++){
                    s=s+(st.charAt(i)-'0');
                }
                
                System.out.println(s);
            }
            else
                System.out.println(-1);
            t--;
        }
        
    }
}
