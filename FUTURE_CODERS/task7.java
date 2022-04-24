import java.util.*;
public class task7 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        int c=0,i=0;
        int a[] = new int[10];
        while(num>0) 
        {
            int r = num%10;
            a[c] = r;
            c++;
            num/=10;
        }
        int j,temp = c;
        for(i=0;i<c;i++)
        {
            for(j=0;j<c;j++)
            {
                if(i==j){
                    if(temp>-1)
                    {
                    temp--;
                    System.out.print(a[temp]+"  ");
                    } 
                    
                }
                else if((i+j)==c-1)
                {
                    System.out.print(a[i]+"  ");
                    
                }
                else
                System.out.print("  ");
            }
            System.out.println("\n");
        }

        sc.close();
        
    }
}
