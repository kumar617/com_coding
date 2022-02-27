import java.io.*;
import java.util.*;
public class nice {
    public static void main(String[] args) {
        Scanner sc=new Scanner (System.in);
        int t= sc.nextInt();
        while(t>0){
            int n=sc.nextInt();
            int a[]=new int[n];
            int x[]=new int[n];

            int c=0;
            for(int i=0; i<n;i++){
                a[i]=sc.nextInt();
            }
            for(int i=0; i<n;i++){
                if(a[i]<0){
                    //System.out.println("NO");
                    c=-1;
                    break;
                }
                for(int j=0; j<n;j++){
                    if (Math.abs(a[i]-a[i+1])==a[j]){
                        break;
                    }
                    else{
                        x[c]=Math.abs(a[i]-a[i+1]);
                        c++;
                        if (Math.abs(a[i]-a[i+1])-Math.abs(Math.min(a[i], a[i+1]))==a[j]){
                            break;
                        }
                        else{
                            x[c]=Math.abs(a[i]-a[i+1])-Math.abs(Math.min(a[i], a[i+1]));
                            c++;
                        }
                    }

                }
            }
            
            t--;
        }
        
    }
    boolean isthere(int n, int a[]){
        for ()
        return false;
    }
}
