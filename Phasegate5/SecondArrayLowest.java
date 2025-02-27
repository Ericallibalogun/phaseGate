public class SecondArrayLowest {

    public static int[] getTwoLowestNum(int[] number) {
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

    public static void main(String... ericalli) {
        int[] number = {45, 4, 5, 6, 9, 7, 10, 90};
        int[] minimum = getTwoLowestNum(number);
        System.out.print("Two lowest numbers: " + "[" + minimum[0] + ", " + minimum[1] + "]");
    }
}
