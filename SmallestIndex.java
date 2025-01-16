public class SmallestIndex{
	public static void main(String... ericalli){

	int[] numbers = {1,5,3,4,5,5};
	
		int maximum = numbers[0];
		for(int count = 1; count < numbers.length; count++)
			if(numbers[count] > maximum){
			maximum = numbers[count];
			}

	
System.out.println("\nThe largest element is : " + maximum);


}
}