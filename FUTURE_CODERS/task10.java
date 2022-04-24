import java.util.*;
public class task10 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int i,j;
        int n = sc.nextInt();
        for(i=0;i<n;i++)
        {
            for(j=0;j<n;j++)
            {
                if(i==j||i+j==n-1||j==0||j==n-1||i==0||i==n-1)
                {
                    System.out.print("*");
                }
                else
                {
                    System.out.print(" ");
                }
            }
            System.out.println();
        }
       
    }
}
