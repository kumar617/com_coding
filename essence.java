import java.util.*;
public class essence
{
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        int t=sc.nextInt();
        int i,j,hcf=0;
        for (i=1;i<=t;i++){
            int e=sc.nextInt();
            if(100%e==0){
            int w=100/e;
            System.out.println(w);
            }
            else{
                for(j = 1; j <= 100 || j <= e; j++) {
                    if( 100%j == 0 && e%j == 0 )
                    hcf = j;
                }
                System.out.println(100/hcf);
            }
        }
    }
}
