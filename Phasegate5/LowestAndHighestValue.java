import java.util.Arrays;
public class LowestAndHighestValue{
	public static int [] getHighestNum(int [] number){
	int highest = number [0];
	int [] newArray = new int[1];

for(int count = 0;count < number.length;count++){
	if(number[count] >  highest){
		highest = number[count];
		newArray[0] = highest;
		}
	}
	return newArray;
}
public static int [] getLowestNum(int [] number){
	int lowest = number [1];
	int [] newArray = new int[1];

for(int count = 0;count < number.length;count++){
	if(number[count] <  lowest){
		lowest = number[count];
		newArray[0] = lowest;
		}
	}
	return newArray;
}
public static void main(String... ericalli){
	int [] number = {1,0,5,6,9,7,-5,9};
	int [] highest =  getHighestNum(number);
	int [] lowest = getLowestNum(number);
	System.out.print("The Highest and lowset respectively is:" + Arrays.toString(highest) + Arrays.toString(lowest));

	
}

} 

