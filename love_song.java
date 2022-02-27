import java.io.*;
import java.util.*;
public class love_song {
    public static void main(String[] args) {
        Scanner sc=new Scanner (System.in);
        long n= sc.nextInt();
        long q= sc.nextInt();
        sc.nextLine();
        String s=sc.nextLine();

        
        while(q>0){
            int l=sc.nextInt();
            int r= sc.nextInt();
            String st=s.substring(l-1,r);
            long sum=0;
            for(int i=0;i<st.length();i++){
                char ch=st.charAt(i);
                sum+=(int)ch-96;


            }
            System.out.println(sum);
            q--;
        }
        
    }
}
