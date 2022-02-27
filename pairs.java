import java.io.*;
import java.util.*;
public class pairs {
    public static void main(String[] args) {
        Scanner sc=new Scanner (System.in);
        int t= sc.nextInt();
        while(t>0){
            int n=sc.nextInt();
            int r=sc.nextInt();
            int l=sc.nextInt();
            int s=0;
            int a[]=new int [n];
            for (int i=0; i<n;i++){
                a[i]=sc.nextInt();

            }
            for (int i=0; i<n;i++){
                if(a[i]<=l){
                for (int j=i+1; j<n;j++){
                    //System.out.println(s);
                    if(r<= (a[i]+a[j]) && (a[i]+a[j])<=l && j!=i){
                        //System.out.println(a[i]+""+a[j]);
                        //System.out.println("ff");
                        s=s+1;
                    }
                }}
            }      
            System.out.println(s);
            t--;
        }
        
    }
}
