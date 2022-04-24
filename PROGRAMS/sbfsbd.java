public class sbfsbd{
    public static void main(String[] args) {
        StringBuffer sbf = new StringBuffer("Nirmal");
        
        sbf.append(" from RMK ");
        System.out.println(sbf);
        StringBuilder sbd = new StringBuilder("KISHORE");
        sbd.append(" from stj");
        System.out.println(sbd);
        String s = "srini";
        s = s+"jaya";
        System.out.println(s);// string is immutable here it creating one more reference to store the values in the memory
    }
}
