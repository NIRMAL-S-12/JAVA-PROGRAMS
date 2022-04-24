import java.util.*;
public class task5 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int rows = sc.nextInt();
		for(int i=0;i<rows;i++)
		{
			for(int s=0;s<rows-i-1;s++){
				System.out.print(" ");
			}
			for(int j=0;j<2*i+1;j++)
			{
				System.out.print("*");
			}
			System.out.println();
			sc.close();
		}

	}

}
