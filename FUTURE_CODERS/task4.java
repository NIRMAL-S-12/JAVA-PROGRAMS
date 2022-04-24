/* 
 1 1
 1 2 2 1
 1 2 3 3 2 1
 1 2 3 4 4 3 2 1
 */
import java.util.*;
public class task4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int i,j,k,m;
		int n = sc.nextInt();
		for(i=1;i<=n;i++)
		{
			for(j=1;j<=i;j++)
			{
				System.out.print((j)+" ");
			}
			k = j-1;
			for(m=k;m>=1;m--)
			{
				System.out.print((m+" "));
			}
			System.out.println();
		}
		sc.close();
	}

}
