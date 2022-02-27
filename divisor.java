import java.io.*;
import java.util.*;
public class divisor {
    public static void main(String[] args) {
        Scanner sc=new Scanner (System.in);
        int t= sc.nextInt();
        while(t>0){
            int n=sc.nextInt();
            int x=0;
            int i;
            if (n==1)
            System.out.println("Bob");
            else{
                
                for(i=n-1;i>=2;i--){
                    if(n%i==0){
                        //x=n/i;
                        //System.out.println(x+" "+i);
                        break;
                    }
                }
                //System.out.println(x+" "+i);
                if (i%2==0)
                System.out.println("Alice");
                else            
                System.out.println("Bob");
            }
            t--;
        }
        
    }
}
