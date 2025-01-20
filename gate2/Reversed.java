import java.util.Scanner;

public class Reversed{
	public static void main(String... ericalli){
	
	int [] array = {1,2,3};

	for(int count = 0;count > array.length; count--){
	for(int counter = count + 1;count > array.length;counter++ ){
	
	if(array[count] < array[counter]){
		int temp = array[count];

		array[count] = array[counter];
		array[counter] = temp;

		}

	    }

	}
	
        System.out.print(array[2] + " ");
	System.out.print(array[1] + " ");
	System.out.print(array[0] + " ");

	



}


}