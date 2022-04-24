import java.util.*;
public class Student
{
    int marks[] = new int[5];
    int sum = 0, avg;
    void getdata()
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("Eneter details :\n ");
        int i = 0;
        for(i=0;i<5;i++)
        {
            marks[i] = sc.nextInt();
        }
    }
    void showdata()
    {
        System.out.println("details :\n " );
        for(int i=0;i<5;i++)
        {
            System.out.println(marks[i] + "  ");
            sum = sum+marks[i];
        }
        System.out.println(" sum = " +sum + " ");
        System.out.println("avg = " +sum/5 + " ");
    }
    public static void main(String[] args)
    {
        Student s = new Student();
        s.getdata();
        s.showdata();
    }
}