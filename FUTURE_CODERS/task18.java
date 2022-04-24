import java.util.*;
public class task18 {
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        int i,j,n = sc.nextInt();
        char ch = 'A';
        for(i = 1; i <= n; i++)
        {
            
            for(j = 1; j <= n; j++)
            {
                if(i==1||i==n||j==n||j==1)
                {
                    System.out.print("* ");
                }
                else
                {
                    System.out.print(ch++ + " ");
                    if(ch>'Z')
                    ch = 'A';
                }
            }
            System.out.println();
        }
    }
    
}
