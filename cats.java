import java.io.*;
import java.util.*;
public class cats {
    public void add()
    {
        vvn;
    }
    public static void main(String[] args) {
        cats obj=new cats();
        cats obj1 =new cats();
        obj.add();

        Scanner sc=new Scanner (System.in);
        int t= sc.nextInt();
        while(t>0){
            int n=sc.nextInt();
            int a[]=new int[n];
            for(int i=0;i<n;i++){
                a[i]=i+1;
                //System.out.println(a[i]);

            }
            //a[0]=a[n];
            int temp=0;
            for(int i=0;i<n-1;i++){
                
                temp=a[i];
                a[i]=a[i+1];
                a[i+1]=temp;
                i++;
                

            }
            if (n%2==1){
                temp=a[n-2];
            a[n-2]=a[n-1];
            a[n-1]=temp;
            }
            for(int i=0;i<n;i++){
                System.out.print(a[i]+" ");
            }
            System.out.println();
            t--;
        }
        
    }
}
