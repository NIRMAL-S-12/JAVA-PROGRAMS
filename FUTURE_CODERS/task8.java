import java.util.*;
public class task8
{
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int i,j;
        for(i=1;i<=n;i++)
        {
            for(j=1;j<=i;j++)
            {
                if(j==1||i==n||i==j)
                System.out.print(j+" ");
                else
                System.out.print("  ");
                
            }
            System.out.println();
        }
    }
}