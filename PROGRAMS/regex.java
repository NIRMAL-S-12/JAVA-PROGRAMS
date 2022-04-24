import java.util.List;
import java.util.ArrayList;
import java.util.regex.*;
public class regex {
    public static void main(String[] args) 
    {
        List<String> l = new ArrayList();
        l.add("nirm20233.cs@rmkec.ac.in");
        l.add("nirmalwalkman@gmail.com");
        l.add("nir@mvei.$");
        l.add("####@&.nifn");
        l.add("$.@.@gmail.com");
        l.add("kjfefvjeojvnreovn");
        l.add("reivnivn.rvjnvoi");
        l.add(",,rkvvikvn,,,vi");
        Pattern p = Pattern.compile("(.+)@(.+)$");
        for(String i : l) 
        {
        Matcher m = p.matcher(i);
        if(m.find())
        {
            System.out.println(i+ " : yes it is mail");
        }
        else
        {
            System.out.println(i+" NO it is not mail");
        }
    }

    }
}
