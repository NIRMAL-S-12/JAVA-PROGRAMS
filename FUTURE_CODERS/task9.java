import java.util.*;
public class task9
{
    public static void main(String[] args)
    {
        int i,j,s;
        int n = 5;
        for(i = 1; i <=n;i++){
            for(s = 1;s<=n-i;s++){
                System.out.print(" ");
            }
            for(j=1;j<=2*i-1;j++){
                System.out.print("*");
            }
            System.out.print("\n");
        }
        for(i = n; i >=1;i--){
            for(s = 1;s<=n-i;s++){
                System.out.print(" ");
            }
            for(j=1;j<=2*i-1;j++){
                System.out.print("*");
            }
            System.out.print("\n");
        }
    }
}