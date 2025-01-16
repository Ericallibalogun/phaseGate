import java.util.Scanner;

	public class PrimeNumber{
	public static void main(String... args){

	Scanner userInput =new Scanner(System.in);

	System.out.println("Enter a number :");
	int integer = userInput.nextInt();		
	

	if(integer % 2 == 1){
	System.out.println("true");
	}

	if(integer % 2 == 0){
	System.out.println("false");
	}


	
	

}
	

}