import java.util.Scanner;

public class Factors{
	public static void main(String... ericalli){

	Scanner userInput = new Scanner(System.in);
	
	System.out.println("Enter a number: ");
	int number = userInput.nextInt();
	int factor = number;

	System.out.println("The factor of " + number + " is ");
	while(factor > 0){
		if(number % factor == 0){
	System.out.println(factor);
	}
	factor--;
	}
	

	}
}