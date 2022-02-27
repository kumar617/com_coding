import java.io.*;
import java.util.*;
public class poor_man {
    public static void main(String args[]) {
        Scanner sc=new Scanner (System.in);
        int t=sc.nextInt();
        while(t>0){
            int n=sc.nextInt();
            if (n%2!=0){
                System.out.println("Bob");
                t--;
                continue;

            }
            int c=0;
            while(n%2==0){
                c++;
                n=n/2;
            }
            if (n>1)
            System.out.println("Alice");
            else if(c%2==0)
            System.out.println("Alice");
            else{
            System.out.println("Bob");}

            t--;
        }
    }
        
}

