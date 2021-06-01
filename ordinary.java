import java.io.*;
import java.util.*;
public class ordinary {
    public static void main(String[] args) {
        Scanner sc=new Scanner (System.in);
        int t= sc.nextInt();
        
        while(t>0){
            int c=0;
            int n=sc.nextInt();
            if (n<10)
            System.out.println(n);
            else{
                for (int i=10;i<=n;i++){
                    int j=i,k=i,count=0,x=0;
                    while(k!=0){
                        count++;
                        k=k/10;
                    }
                    
                    int a[]=new int [count];
                    int temp=count-1;
                    while(j!=0){
                        a[temp]=j%10;
                        temp--;
                        j=j/10;
                    }
                    for(int f=1; f<count; f++){
                        if (a[f]!=a[f-1]){
                            x=1;
                            break;
                        }
                    }
                    if(x==0)
                        c++;
                    
                }
                System.out.println(9+c);
                
            }

            t--;
        }
        
    }
}
