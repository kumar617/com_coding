import java.io.*;
import java.util.*;
public class berland {
    public static void main(String[] args) {
        Scanner sc=new Scanner (System.in);
        int t= sc.nextInt();
        int max=1;
        while(t>0){
            int n=sc.nextInt();
            int a[] =new int[n];
            for(int i=0; i<n;i++){
                a[i]=sc.nextInt();
                if (a[i]>=max)
                max=a[i];
            }
            for (int i=1; i<=max;i++){
                String b="b"+i;
                int b[]=new int[n];
                
            }

            t--;
        }
        
    }
}
