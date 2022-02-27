import java.io.*;
import java.util.*;
public class pattern {
    public static void main(String[] args) {
        Scanner sc=new Scanner (System.in);
        int t= sc.nextInt();
        sc.nextLine();

        while(t>0){
            String s=sc.nextLine();
            if (pat(s)==true){
                System.out.println("Yes");
            }
            else
            System.out.println("No");
            
            t--;
        }
        
    }
    static Boolean pat(String s){
        int x=s.length()/2;
        String s1=s.substring(0,x);
        String s2="";
        String reverse="";
        boolean palin;
        if (s.length()%2==0)
        s2=s.substring(x);
        else
        s2=s.substring(x+1);
        for ( int i = s2.length() - 1; i >= 0; i-- ){
            reverse = reverse + s2.charAt(i); 
        } 
        if (s1.equals(reverse))
        palin=true;
        else
        palin=false;
        if (s.length()==1)
        return true;
        else if (palin==true && pat(s1)==true&&pat(s2)==true)
        return true;
        else
        return false;
    }
}
