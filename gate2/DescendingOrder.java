public class DesendingOrder {
    public static void SortingInDescendingOrder(int[] array) {
        for (int count = 0; count  < array.length - 1; count++) {
        for (int counter = count+ 1; counter < array.length; counter++) {
               if (array[count] < array[counter]) {
                   int temp = array[count];
                    array[count] = array[counter];
                    array[counter] = temp;
               }
           }
        }

        for (int count = 0; count < array.length; count++) {
        System.out.print(array[count] + " ");
        }
    }

    public static void main(String[] args) {
    int[] array = {1, 4, 6, 2, 5};
    SortingInDescendingOrder(array);
    }
}
