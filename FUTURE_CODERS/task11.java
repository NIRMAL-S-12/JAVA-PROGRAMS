public class task11
{
    public static void main(String[] args)
    {
        int n = 10,i,j;
        for(i=n;i>0;i--){
            for(j=1;j<=i;j++){
                System.out.print("* ");
            }
            System.out.print("\n");
        }
        for(i=1;i<=n;i++){
            for(j=1;j<=i;j++){
                System.out.print("* ");
            }
            System.out.print("\n");
        }
    }
}