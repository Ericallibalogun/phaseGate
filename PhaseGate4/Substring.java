public class Substring {
    public static void main(String... ericalli) {
        String input1 = "ABCD";
        String input2 = "BC";

        System.out.println(isSubString(input1, input2));
    }

    public static boolean isSubString(String input1, String input2) {
        int len1 = input1.length(), len2 = input2.length();

        if (len2 > len1) return false;

 
        for (int count = 0; count <= len1 - len2; count++) {
            boolean match = true;
            for (int counter = 0; counter < len2; counter++) {
            if (input1.charAt(count + counter) != input2.charAt(counter)) {
                    match = false;
                    break;
                }
            }
            if (match) {
                return true;
            }
        }
        return false;
    }
}
