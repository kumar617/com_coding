import java.io.*;
import java.util.*;
public class price {
    public static void main(String[] args) {
        Scanner sc=new Scanner (System.in);
        int n=sc.nextInt();
            long prev=0;
            long sum=0;
        while(n>0){
            long a=sc.nextLong();
            long b=sc.nextLong();
            //for(int i=1;i<=n;i++){
                
                
                if (a+prev<=b){
                sum+=(2*a);
                }
                else{
                sum+=a;
                }
                System.out.println("dcb"+sum);
                prev+=b;
            

            
            

            n--;
        }
        System.out.println(sum);
        
    }
}
