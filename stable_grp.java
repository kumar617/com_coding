import java.io.*;
import java.util.*;

public class stable_grp extends quicksort {
    public static void main(String[] args) {
        Scanner sc=new Scanner (System.in);
        long n= sc.nextInt();
    //while(t>0){
        long k=sc.nextInt();
        long x=sc.nextInt();
        int a[]=new int[(int)n];
        for(int i=0;i<n;i++){
            a[i]=sc.nextInt();
        }
        Arrays.sort(a);
        int c=1;
        for(int i=1;i<n;i++){
            if ((a[i]-a[i-1])>x){
                k--;
            }
            if ((((a[i]-a[i-1])>x) && k<=0)||((a[i]-a[i-1])>(2*x))){
                c++;
                
            }
            

        }
        System.out.println(c);

            
        //}
        
    }
}
