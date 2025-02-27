public class ReverseString {
    public static String reverseString(String input) {
        String reversed = "";
        for (int count = input.length() - 1; count >= 0; count--) {
            reversed += input.charAt(count); 
        }

        return reversed; 
    }
 public static void main(String... ericalli) {
        String original = "HOW";
	String original2 = "ARE";
	String original3 = "YOU";



	
        String reversed = reverseString( original3 +" "+ original2 +" "+original);
	System.out.println("HOW ARE YOU");
        System.out.println("The reversed is == " +reversed);
    }

}
