import java.io.*;
import java.util.*;
public class sm_diff {
    public static void main(String[] args) {
        Scanner sc=new Scanner (System.in);
        int t= sc.nextInt();
        while(t>0){
            int sum=0;
            int l=sc.nextInt();
            int a[]=new int[l];
            int b[]=new int[l];
            for(int i=0;i<l;i++){
                a[i]=(sc.nextInt()-i);
            }
            for(int i=0;i<l;i++){
                for(int j=i+1;j<l;j++){
                    if(a[i]==a[j])
                    b[i]=b[i]+1;
                    
                }
                sum=sum+b[i];
            }
            System.out.println(sum);
            t--;
        }
        
    }
}
