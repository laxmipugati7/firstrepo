public class reverseString {

    public String reverseString(String str) {
        String rev = "";

        for (int i = str.length() - 1; i >= 0; i--) {
            rev = rev + str.charAt(i);
        }
        return rev;
    }
    public static void main(String[] args) {
        reverseString rs = new reverseString();

        String str ="laxmi pugati";
        String rev= rs.reverseString(str);

        System.out.println(str);
        System.out.println(rev);

    }

}

