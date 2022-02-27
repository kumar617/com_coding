import java.io.*;
import java.util.*;
public class game_over {
    public static void main(String[] args) {
        Scanner sc=new Scanner (System.in);
        int t= sc.nextInt();
        while(t>0){
            int n=sc.nextInt();
            long a[]=new long[n];
            int b[]=new int[n];
            int c=0;
            for(int i=0;i<n;i++){
                a[i]=sc.nextLong();
            }

            for(int i=0;i<n;i++){
                if ((a[i]+i<n)&& (a[i]+i>-1) &&a[(int)a[i]+i]==(0-a[i])){
                    b[i]=1;
                    b[(int)a[i]+i]=1;
                    c++;
                }

            }
            System.out.println(n-c);
            for(int i=0;i<n;i++){
                if (b[i]!=1)
                System.out.print(i+1+" ");
            }
            System.out.println();
            t--;
        }
        
    }
}
