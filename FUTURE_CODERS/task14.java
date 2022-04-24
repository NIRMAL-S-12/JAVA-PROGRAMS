import java.util.*;
public class task14 {
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter no of rows: ");
        int n = sc.nextInt();
        int i,j,k=0,s;
        for(i=0;i<n;i++)
        {
            for(s=0;s<n-i-1;s++)
            {
                System.out.print("  ");
            }
            for(j=0;j<i+1;j++)
            {
                if(j==0)
                 k = 1;
                else 
                 k = k*(i-j+1)/j;
                System.out.print(k+"   ");
            }
            System.out.println();
        }
    }
   
}
