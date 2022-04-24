public class remove {
    public static void main(String[] args)
    {
        String str1 = "nirmal";
        String str2 = "anagh";
        int f = 1;
        for(int i = 0; i < str1.length(); i++)
        {
            f = 1;
            for(int j = 0; j < str2.length(); j++)
            {
                if(str1.charAt(i) == str2.charAt(j))
                {
                    f = 0;
                    break;
                }
            }
            if(f == 1)
            System.out.println(str1.charAt(i));
        }
    }
    
}
