import java.util.*;
public class chair
{
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        int n=sc.nextInt();
        int i,j,time=0;
        int a[]=new int[n];
        for (i=0;i<n;i++){
            a[i]=sc.nextInt();
        }
        for (i=0;i<n;i++){
            if(a[i]==1){
                for (j=i+1;j<n;j++){
                    if(a[j]==0){
                        int x=j;
                        a[j]=-1;
                        a[i]=-2;
                        time=time+(j-i);
                        break;
                    }
                }
                
            }
        }
        for (i=n-1;i>0;i--){
            if(a[i]==1){
                
            }
        }
        System.out.println(time);
        
    }

}
