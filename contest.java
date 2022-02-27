import java.io.*;
import java.util.*;
public class contest  {
    public static void main(String[] args) {
        Scanner sc=new Scanner (System.in);
        int t= sc.nextInt();
        while(t>0){
            long n=sc.nextInt();
            long k=sc.nextInt();
            long tt=sc.nextInt();
            long sum=0;
            long x=tt/k;
            for(long i=1;i<=n;i++){
                
                //System.out.println(i);
                
                
                if(n-i>=x)
                sum=sum+x;
                else
                sum=sum+n-i;
                //System.out.println("sum: "+sum);
            }
            System.out.println(sum);
            t--;
        }
        
    }
}
