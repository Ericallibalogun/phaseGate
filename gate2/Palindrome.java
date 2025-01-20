public class Palindrome{
public static boolean CheckIfItsAPalindrome(int number){

	if(number % 10 ==0){
	number /= 10;
	return true;
	}else if{
	(number % 10 != 0);
	return false;
	}
	}

public static void main(String... ericalli){
int number = 11211;
System.out.println(CheckIfItsAPalindrome(number));
}


}