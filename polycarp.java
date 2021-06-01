import java.io.*;
import java.util.*;
public class polycarp{
    public static void main(String[] args) {
        Scanner sc=new Scanner (System.in);
        int t= sc.nextInt();
        int c=0;
        while(t>0){
            int n=sc.nextInt();
            String st= sc.next();
            if (n<3)
            c=0;
            else{
                for (int i=0; i<st.length();i++)
                {   
                    char temp=st.charAt(i);
                    for (int j=i+1;j<st.length();j++){
                        if((temp==st.charAt(j)) && (st.charAt(j-1)!=st.charAt(j))){
                            System.out.println()
                            c=1;
                            break;
                        }
                    }
                    if(c==1)
                    break;
                }
            }
            if(c==1)
            System.out.println("NO");
            else
            System.out.println("YES");
            t--;
        }
        
    }
}
