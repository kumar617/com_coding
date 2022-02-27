import java.io.*;
import java.util.*;
public class stones{
    public static void main(String[] args) {
        Scanner sc=new Scanner (System.in);
        int t= sc.nextInt();
        while(t>0){
            int n=sc.nextInt();
            int a[]=new int[n];
            int min=0,max=0,s=0;
            for (int i=0; i<n;i++){
                a[i]=sc.nextInt();

            }
            for (int i=0; i<n;i++){
                if (a[i]==1){
                min=i;
                break;}

            }
            for (int i=0; i<n;i++){
                if (a[i]==n){
                max=i;
                break;}
            }
            //System.out.println(min);
            //System.out.println(max);
            int temp=Math.min(min, max);
            max=Math.max(min, max);
            min=temp;
            int x=min;
            int y=max-min-1;
            int z=n-max-1;
            /*if ((min<=n/2 && max>n/2)||(min>n/2 && max<=n/2)){
                if(min<=n/2 && max>n/2)
                    s=min+(n-max+1);
                else
                    s=max+(n-min+1);   
            }
            else{
                if(min<=n/2 && max<=n/2)
                    s=Math.max(min, max);
                else
                    s=n-Math.min(max, min)+1;
            }
            
            if ((min>n/2 && max>n/2)){
                if(min<max){
                    s=s+(n-max+1);
                    if(min<=(max-1)/2){
                        s=s+min;
                    }
                    else
                        s=s+max-1-min+1;
                }
                else{
                    s=s+(n-min+1);
                    if(max<=(min-1)/2){
                        s=s+max;
                    }
                    else
                        s=s+min-1-max+1;
                }
            }
            else{
                
                if(min<=max){
                    s=s+min;
                    if(max<=(min+(n-min)/2)){
                        s=s+max-min;
                    }
                    else
                        s=s+(n-max+1);
                }
                else{
                    s=s+max;
                    if(min<=(max+(n-max)/2)){
                        s=s+min-max;
                    }
                    else
                        s=s+(n-min+1);
                } 
            }
            System.out.println(x);
            System.out.println(y);
            System.out.println(z);
            */
            s=x+y+z+2-Math.max(Math.max(x, y), Math.max(y, z));
            System.out.println(s);
            t--;
        }
        
    }
}
