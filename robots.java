import java.util.Scanner;

public class robots {
    public static void main(Strings args[])throws IOException{
        Scanner sc= new Scanner(System.in);
        int n=sc.nextInt();
        int w=sc.nextInt();
        int p[]=new int[w+1];
        int d[]=new int[w+1];
        for(int i=1; i<=n;i++){
            int temp=sc.nextInt();
            p[temp]=temp;
        }
        for(int i=1; i<=n;i++){
            
            if(p[i]!=0){
                String temp=sc.nextLine();
                if(temp.equalsIgnoreCase("R"))
                d[i]=1;
                else
                d[i]=-1;

            }
            
        }
        int t=0;
        while(true){

            for(int i=1;i<=n;i++){
                p[i]=p[i]+d[i];

            }
            t++;
        }

    }
}
