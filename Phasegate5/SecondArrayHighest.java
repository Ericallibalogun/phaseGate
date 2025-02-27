public class SecondArrayHighest {

    public static int[] getTwoHighestNum(int[] number) {
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
        int[] number = {46, 4, 5, 6, 9, 7, 10, 89};
        int[] maximum = getTwoHighestNum(number);
        System.out.print("Two highest numbers: " + "[" + maximum[0] + ", " + maximum[1] + "]");
    }
}
