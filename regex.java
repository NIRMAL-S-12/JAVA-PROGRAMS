import java.util.regex.*;
public class regex {
    public static void main(String[] args) 
    {
        String str = "nirm20233.cs@rmkec.ac.in";
        String reg = "[@.]";
        Pattern p = Pattern.compile("@");
        Matcher m = p.mat cher(str);
        if(m.find()) {
            System.out.println("yes");
        }
        else
        {
            System.out.println("No");
        }
    }
    
}
