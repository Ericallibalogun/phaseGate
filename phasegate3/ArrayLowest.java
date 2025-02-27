import java.util.Arrays;
public class ArrayLowest {

    public static int[] twoLowestNum(int[] number) {
        int[] result = {Integer.MAX_VALUE, Integer.MAX_VALUE};

        for (int num : number) {
            if (num < result[0]) {
                result[1] = result[0];
                result[0] = num;
            } else if (num < result[1] && num != result[0]) {
                result[1] = num;
            }
        }
        return result;
    }

public static String getLargest(int[] array) {
	int largest = array[0];	
for (int count = 0; count < array.length; count++) {
	largest = count;
for (int counter = count + 1; counter < array.length; counter++) {
	if (array[counter] < array[largest]) {
		largest = counter;
	}
}
	int temp = array[largest];
	array[largest] = array[count];
	array[count] = temp;
}
	return Arrays.toString(array);
}

    public static void main(String... ericalli) {
        int[] number = {0, 4, 5, 6, 9, 7, 10, 9};
	System.out.print(getLargest(number));
    	 int[] minimum = twoLowestNum(number);
       System.out.print("Two lowest numbers: " + "[" + minimum[0] + ", " + minimum[1] + "]");
    }
}
