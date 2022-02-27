import java.io.*;
import java.util.*;
public class friends {
    public static void main(String[] args) {
        Scanner sc=new Scanner (System.in);
        int t= sc.nextInt();
        while(t>0){
            int n=sc.nextInt();
            int a[]=new int[n];
            int sum=0,k=0,x=0;
            for(int i=0;i<n;i++){
                a[i]=sc.nextInt();
                sum=sum+a[i];
            }
            if (sum%n!=0){
                System.out.println(-1);
            }
            else{
                x=sum/n;
                for(int i=0;i<n;i++){
                    if (a[i]>x)
                    k++;
                }
                System.out.println(k);
            }
            t--;
        }
        
    }
}
