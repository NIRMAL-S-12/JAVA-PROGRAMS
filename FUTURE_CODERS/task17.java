public class task17
{
    public static void main(String[] args)
    {
        int i,j,n = 5;
        for(i=1;i<=n;i++)
        {
            for(j=1;j<=i;j++)
            {
                System.out.print(j%2);
            }
            System.out.print("\n");
        }
    }
}