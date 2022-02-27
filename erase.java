import java.io.*;
import java.util.*;
public class erase {
    public static void main(String[] args) {
        Scanner sc=new Scanner (System.in);
        int n= sc.nextInt();
        
        int k=sc.nextInt();
        sc.nextLine();
        String st=sc.nextLine();
        int p=0;
        //int a[]=new int[n];
        char min='z';
        for(int i=0;i<n;i++){
            if (st.charAt(i) <= min)
            min = st.charAt(i);
            
        }
        p=st.lastIndexOf(min);
        //System.out.println(min);   
        String s=st.substring(0, p+1);
        String s1=st.substring(0, p+1);
        //System.out.println(s);
        while(s.length()<=k){
            s=s+s1;
        }
        if (s.length()>k){
            s=s.substring(0, k);

        }
        System.out.println(s);
        
    }
}
