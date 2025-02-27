public class SortArrays {

    
    public static int[] descendingOrder(int[] array1, int[] array2) {
        int[] joinedArray = new int[array1.length + array2.length];
        int index = 0;

   
        for (int count = 0;count < array1.length;count++) {
            joinedArray[index++] = array1[count];
        }

        for (int count = 0;count < array2.length;count++) {
            joinedArray[index++] = array2[count];
        }

        for (int count = 0; count < joinedArray.length - 1; count++) {
        for (int counter = count + 1;counter < joinedArray.length;counter++) {
                if (joinedArray[count] < joinedArray[counter]) 

                    int temp = joinedArray[count];
                    joinedArray[count] = joinedArray[counter];
                    joinedArray[counter] = temp;
                }
            }
        }

        return joinedArray;
    }
public static void main(String[] args) {
        int[] array1 = {3, 5, 7, 9};
        int[] array2 = {4, 2, 8, 6};

        int[] result = descendingOrder(array1, array2);

        for (int count = 0;count < result.length;count++) {
            System.out.print(result[count] + (count < result.length - 1 ? ", " : ""));
        }
        System.out.println();
    }

}
}