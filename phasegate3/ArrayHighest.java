public class ArrayHighest {

    public static int[] twoHighestNum(int[] number) {
        int[] result = {Integer.MIN_VALUE, Integer.MIN_VALUE};

        for (int num : number) {
            if (num > result[0]) {
                result[1] = result[0];
                result[0] = num;
            } else if (num > result[1] && num != result[0]) {
                result[1] = num;
            }
        }
        return result;
    }

    public static void main(String... ericalli) {
        int[] number = {45, 4, 5, 6, 9, 7, 10, 90};
        int[] maximum = twoHighestNum(number);
        System.out.print("Two highest numbers: " + "[" + maximum[0] + ", " + maximum[1] + "]");
    }
}
