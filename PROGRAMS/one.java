import java.util.*;
//import java.lang.*;
public class one{
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        String str="hElLo niRmal! How Are yOu? niRmal!";
        String s = "niRmal!";
        String ch = " kishore!!";
        String a = "niRmal!niRmal!niRmal";
        String c = "      niRmal!niRmal      ";
        System.out.println("lenght = " +str.length());
        System.out.println("char at 15 " + str.charAt(15));
        System.out.println("print substring = " +str.substring(5,19));
        System.out.println("check for substring = " +str.contains("nirmal"));
        System.out.println("to upper = " +str.toUpperCase());
        System.out.println("delete = " +str.join("!", "iam exl"));
        /*System.out.println("to lower = " +str.toLowerCase());
        System.out.println("Checks for equality = " +str.equals(s));
        System.out.println("str comparison = " +s.compareTo(ch));
        System.out.println("is empty checks for null String = "+str.isEmpty()); 
        System.out.println("String concatenation = "+str.concat(ch));
        System.out.println("Replace string = "+str.replace(s,ch));
        System.out.println("Replace all = "+str.replaceAll(s,ch));
        System.out.println("split = "+a.split(s));
        System.out.println("index of = " +str.indexOf(s));
        System.out.println("last index of = " +str.lastIndexOf(s));
        System.out.println("trim = "+c.trim());
        */
        sc.close();
    }
}