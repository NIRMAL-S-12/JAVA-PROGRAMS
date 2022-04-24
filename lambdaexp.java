import java.util.*;
interface lam
{
    public int fun(int a, int b);
}
public class lambdaexp
{
    public static void main(String[] args)
    {
        lam l = (a,b) -> { 
            a = a+b;
            return a;
        };
        System.out.println(l.fun(20,30));
    }
}