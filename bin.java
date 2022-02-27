import java.util.*;
public class bin {
    public static void main(String []args){
        Scanner sc= new Scanner(System.in);
        int t=sc.nextInt();
        for(int i=1; i<=t;i++){
            int n=sc.nextInt();
            
            String newstr="";
            while(n>=0){
                String str=Integer.toBinaryString(n);
                System.out.println(str);
                if(n==0){
                System.out.println(0);
                break;
                }
                for(int j=0;j<str.length();j++){
                    String temp=Integer.toBinaryString(n-1);
                    System.out.println(temp);
                    newstr=newstr + (Integer.parseInt(String.valueOf(str.charAt(j)))*Integer.parseInt(String.valueOf(temp.charAt(j))));
                    n=n-1;
                    newstr=newstr+1;
                    if(Integer.parseInt(newstr,2)==0){
                        System.out.println(n);
                        break;}
                }
            }
            

        }
        
    }        
}
