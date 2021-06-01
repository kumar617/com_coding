import java.io.*;
import java.util.*;
public class matrix{
    public static void main(String[] args) {
        Scanner sc=new Scanner (System.in);
        int t= sc.nextInt();
        while(t>0){
            int n=sc.nextInt();
            if(n==2)
            System.out.println(-1);
            else{
            int d=1;
            for (int i=1;i<=n;i++){
                System.out.print(d);
                int c=d;
                for (int j=1;j<=n-1;j++){
                    c=c+n;
                    if(c>(n*n)){
                        System.out.print(" "+(c-(n*n)));
                    }
                    else
                    System.out.print(" "+(c));
                }
                System.out.println();
                d=d+n-1;
            }
            }   
            t--;
        }
        
    }
}
