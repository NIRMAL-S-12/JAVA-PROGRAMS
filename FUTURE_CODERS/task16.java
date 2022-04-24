import java.util.*;
public class task16 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int i,j,s,n=sc.nextInt();
        for(i=0;i<n;i++)
        {
           for(j=0;j<n;j++)
           {
               if(i==j)
               System.out.print(i+1);
               else
               System.out.print(" ");
           }
           System.out.print("\n");
        }
    }
    
}
