import java.io.*;
import java.util.*;
public class beans {
    public static void main(String[] args) {
        Scanner sc=new Scanner (System.in);
        int t= sc.nextInt();
        while(t>0){
            int r=sc.nextInt();
            int b=sc.nextInt();
            int d=sc.nextInt();
            int x=Math.min(r, b);
            int diff=Math.abs(r-b);
            if(d==0){
                if (r==b)
                System.out.println("YES");
                else
                System.out.println("NO");
            }
            else if(diff>=d){
                if((diff%d!=0 && ((diff/d)+1)<=x)||(diff%d==0 && (diff/d)<=x))
                    System.out.println("YES");
                else
                System.out.println("NO");
            }
            else
                System.out.println("NO");
            t--;
        }
        
    }
}
