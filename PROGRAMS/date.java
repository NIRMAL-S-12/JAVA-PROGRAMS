import java.util.regex.*;
import java.util.List;
import java.util.ArrayList;
public class date {
    public static void main(String[] args) {
        List<String> l = new ArrayList();
        l.add("12/09/2002");
        l.add("239/29/1232");
        l.add("12/93/1032");
        l.add("2002/12/24");
        String regex ="^(1[0-2]|0[1-9])/(3[01]"+"|[12][0-9]|0[1-9])/[0-9]{4}$";
        Pattern p = Pattern.compile("regex");
        for(String i : l)
        {
            Matcher m = p.matcher(i);
            if(m.find()){
                System.out.println(i+" valid dob");
            }
            else
            {
                System.out.println(i+" invalid dob");
            }

        }
    }
}
