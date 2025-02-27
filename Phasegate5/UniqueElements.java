public class UniqueElements {

    public static String reorderString(String input1, String input2) {
        String result = " ";
        
   
        for (int count = 0; count < input2.length(); count++) {
            char character = input2.charAt(count);
            if (result.indexOf(character) == -1) { 
                result += character;
            }
        }
        
     
        for (int count = 0; count < input1.length(); count++) {
            char character = input1.charAt(count);
            if (result.indexOf(character) == -1) { 
                result += character;
            }
        }
        
        return result;
    }

    public static void main(String[] args) {
        String input1 = "abcdefd";
        String input2 = "d";
        String output = reorderString(input1, input2);
        
        System.out.println("Output: " + output);
    }
}
