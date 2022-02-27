import java.io.*;
import java.util.*;
public class alawn  {
    public static void main(String[] args) {
        Scanner sc=new Scanner (System.in);
        int t= sc.nextInt();
        while(t>0){
            int n=sc.nextInt();
            String q=sc.nextLine();
            String w=sc.nextLine();
            int c=0;
            for(int i=0;i<n;i++){
                if(q.charAt(w.indexOf(q.charAt(i)))==w.charAt(i)){
                    c=c+1;
                }
            }
            System.out.println(c/2);
            t--;
        }
        
    }
}
