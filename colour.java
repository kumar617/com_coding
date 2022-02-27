import java.io.*;
import java.util.*;
public class colour {
    public static void main(String[] args) {
        Scanner sc=new Scanner (System.in);
        int t= sc.nextInt();
        while(t>0){
            int n=sc.nextInt();
            int m=sc.nextInt();
            int c=0;
            sc.nextLine();
            String st[]=new String[n];
            for(int i=0;i<n;i++){
                //System.out.print(i);
                st[i]=sc.nextLine();
                
            }
            for(int i=0;i<n;i++){
                for(int j=0;j<m-2;j++){
                    if (st[i].charAt(j)!=st[i].charAt(j+2) && st[i].charAt(j)!='.'&&st[i].charAt(j+2)!='.'){
                        System.out.println("NO");
                        c=1;
                    }
                    
                }
                if(c==1)
                break;
                
                
            }
            if(c!=1){
            System.out.println("YES");
            for (int i=0;i<n;i++){
            int r=st[i].indexOf('R');
            int w=st[i].indexOf('W');
            String newst="";
                for (int j=0;j<m;j++){

                    if ((r%2==0 || w%2!=0)||(r==-1&& w==-1)){
                        if(j%2==0){
                            newst=newst+'R';
                        }
                        else
                            newst=newst+'W';
                    }
                    else if(r%2!=0 || w%2==0){
                        if(j%2==0)
                            newst=newst+'W';
                        else
                            newst=newst+'R';
                    }
                }
                System.out.println(newst);
            }
            }
            t--;
        }
        
    }
}
