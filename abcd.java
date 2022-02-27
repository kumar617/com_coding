import java.util.*;
public class abcd
{
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        int i,j,k,no=0;
        int t=sc.nextInt();
        for (i=1;i<=t;i++){
            int n=sc.nextInt();
            for(j=1;j<=n;j++){
                String s=sc.nextLine();
                for(k=0;k<=s.length()-1;k++){
                    char ch=s.charAt(k);
                    if(ch!=s.charAt(k+1)){
                        if(s.charAt(k+1)!=s.charAt(k+2)){
                            s=swap(s,k+1,k+2);
                            no++;
                        }
                    }
                }
            }
        }
        String swap(String s,int a,int b)
        {
            char temp=s.chaAt(a);
            char temp2=s.charAt(b);
            String new_s=s.substring(0,a)+temp2+temp+s.substring(b);
            return new_s;
        }

    }
}