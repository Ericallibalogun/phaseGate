public class LowestIndex {
    public static int findLowestIndex(int[] array) {
        int lowest = array[0]; 
        int index = 0;   

        for (int count = 1; count < array.length; count++) { 
            if (array[count] < lowest) {
                lowest = array[count]; 
                index = count;        
            }
        }

        return index; 
    }

    public static void main(String... ericalli) {
        int[] numbers = {-1, 2, 8, 1, 2, -7};
        int index = findLowestIndex(numbers);
        System.out.println("The index of the first lowest number is at index: " + index);
    }
}
