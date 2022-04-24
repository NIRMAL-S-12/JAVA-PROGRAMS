import java.util.*;
public class task6 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int i,j;
        char ch='A';
        for(i=n;i>=1;i--)
        {
            ch='A';
        	for(j=1;j<=i;j++)
        	{
        		System.out.print(j);
                System.out.print(ch);
        		ch++;
        	}
        	System.out.println();
        }
        sc.close();
	}

}
