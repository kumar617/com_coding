import java.util.*;
import java.io.*;
public class nastia {
    public static void main(String args[])throws IOException{
        //BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
        Scanner sc=new Scanner(System.in);
        int t=(sc.nextInt());
        while(t>0){
            int a=(sc.nextInt());
            int b=(sc.nextInt());
            if(b!=1){
            System.out.println("YES");
            System.out.println((long)a+" "+ (long)a*b+" "+ (long)a*(b+1));
            }
            else{
            System.out.println("NO");
            }
            t--;
        }
        //br.close();
    }
}
