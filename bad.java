import java.io.*;
import java.util.*;
public class bad {
    public static void main(String[] args) {
        Scanner sc=new Scanner (System.in);
        int t= sc.nextInt();
        while(t>0){
            int n=sc.nextInt();
            int m=sc.nextInt();
            int x=sc.nextInt();
            int y=sc.nextInt();
            int x1,x2,y1,y2;
            if (x<=n/2){
            x1=n;
            x2=1;}
            else{
            x1=1;
            x2=n;}
            if (y<=m/2){
            y1=m;
            y2=1;}
            else{
            y1=1;
            y2=m;}
            System.out.println(x1+" "+y1+" "+x2+" "+y2);
            t--;
        }
        
    }
}
