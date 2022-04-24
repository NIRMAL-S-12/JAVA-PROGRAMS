import java.util.*;
public class task1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		for(int i=1;i<=n;i++)
		{
			for(int j=1;j<=i;j++)
			{
			System.out.print((char)(64+i)+" ");
			}
			System.out.println();
		}
		//System.out.println((char)(65+12));
		sc.close();

	}

}
