import java.io.*;
import java.util.*;
public class histogram {
    public static void main(String[] args) {
        Scanner sc=new Scanner (System.in);
        int t= sc.nextInt();
        while(t>0){
            int n=sc.nextInt();
            int a[]=new int[n];
            for(int i=0;i<n;i++){
                a[i]=sc.nextInt();

            }
            int s=0;
            
            for(int i=0;i<n;i++){
                int c,d;
                if (i-1<0)
                c=0;
                else
                c=a[i-1];
                if (i+1>=n)
                d=0;
                else
                d=a[i+1];
                if (Math.max(Math.max(a[i],c),Math.max(a[i],d))==a[i]){
                    s=s-(a[i]-Math.max(c,d));
                    //System.out.println(s);
                }
            }
            s=s+a[0];
            s=s+a[n-1];
            for(int i=1;i<n;i++){
                s=s+(Math.abs(a[i]-a[i-1]));
            }
            System.out.println(s);
            t--;
        }
        
    }
}
