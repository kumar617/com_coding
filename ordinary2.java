import java.io.*;
import java.util.*;
public class ordinary2 {
    public static void main(String[] args) {
        Scanner sc=new Scanner (System.in);
        int t= sc.nextInt();
        
        while(t>0){
            int c=0;
            int n=sc.nextInt();
            if (n<10)
            System.out.println(n);
            else{
                String st=""+n;
                int l=st.length();
                c=(l-1)*9;
                int no=0;
                int d=st.charAt(0)-'0';
                for (int i=l-1;i>=0;i--)
                {
                    no=no+d*(int)Math.pow(10, i);
                }
                if (n>=no){
                    System.out.println(c+d);
                }
                else
                System.out.println(c+d-1);
            }
            t--;
        }
        
    }
}
