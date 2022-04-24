import java.util.*;
public class task13
{
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int i,j,k = 1;
        for(i=1;i<=n;i++)
        {
            for(j=1;j<=i;j++)
            {
                for(k=1;k<j;k++)
            {
                System.out.print(k+" ");
            }
                System.out.print(j+" ");
            }
            
            System.out.print("\n");
        }
    }
}