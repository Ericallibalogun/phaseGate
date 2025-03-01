public class DivisibleBy3{ 
	public static int  getDivisorsByThree(int number) {
	int sum = 0;
	int temp = 0;

	for(int count = 3;count <= 30;count++){
	if(count % 3 == 0){
	temp = count;
	sum += count;
	   }	  
	}
	return sum;
   }

public static void main(String... ericalli){
int  number = 30;
System.out.println(getDivisorsByThree(number));
} 
}