public class IntegerPalindromeCheck {
    public static boolean isPalindrome(int number) {
        int original = number;
        int reversed = 0;          

        while (number != 0) {
            int lastDigit = number % 10; 
            reversed = reversed * 10 + lastDigit; 
            number /= 10; 
        }

        return original == reversed;
    }

    public static void main(String[] args) {
        int num1 = 3003; 
        

        System.out.println(isPalindrome(num1) );
        
    }
}
