import java.util.*;
public class task12 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int col = n/2;
        for(int i=0;i<n;i++)
        {
            for(int j=0;j<n;j++)
            {
                if(j==col||i==col)
                System.out.print("+");
                else
                System.out.print(" ");
            }
            System.out.print("\n");
        }

    }
    
}
