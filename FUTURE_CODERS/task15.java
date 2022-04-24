import java.util.*;
public class task15
{
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int i,j,s;
        for(i=0;i<n;i++)
        {
            for(s=0;s<n-i-1;s++)
            {
                System.out.print(" ");
            }
            for(j=0;j<(i+1);j++)
            {
                System.out.print(i+1);
            }
            System.out.print("\n");
        }

    }
}