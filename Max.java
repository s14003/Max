import java.util.Arrays;
import java.util.Comparator;
class Max {
    public static void main(String[] args) {
        System.out.println(max3(1,2,3));
    }

    int max(int a, int b) {
        return Math.max(a,b);
    }

    static int max3(int a, int b, int c) {
        Integer[] arrays = {a, b, c};
        Arrays.sort(arrays, Comparator.reverseOrder());
        return arrays[0];
    }
}
