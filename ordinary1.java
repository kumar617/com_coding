import java.io.*;
import java.util.*;
public class ordinary1 {
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
                    int x=0;
                    String st=""+i;
                    for(int f=1; f<st.length(); f++){
                        if (st.charAt(f)!=st.charAt(f-1)){
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
