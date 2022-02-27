import java.io.*;
import java.util.*;
public class tit {
    public static void main(String[] args) {
        Scanner sc=new Scanner (System.in);
        int t= sc.nextInt();
        while(t>0){
            int n=sc.nextInt();
            int k=sc.nextInt();
            int a[] =new int[n];
            int i=0,c=0;
            while(i<n){
                a[i]=sc.nextInt();
                i++;
            }
            while(k>0 && c!=(n-1)){
                if (a[c]!=0){                    
                a[c]--;
                a[n-1]++;
                k--;
                }
                else
                    c++;
            }
            for(i=0;i<n;i++){
                System.out.print(a[i]+" ");
            }
            System.out.println();
            t--;
        }
        
    }
}
