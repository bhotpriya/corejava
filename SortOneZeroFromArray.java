import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class SortOneZeroFromArray {

    public static void main(String[] args) {
        usingArray();
        usingArrayList();
    }

    private static void usingArrayList() {
        int[] arr = {0, 1, 1, 1, 0, 0, 0};
        List arrayList = new ArrayList<>();
        for (int i = 0; i <= arr.length - 1; i++) {
            if (arr[i] == 0) {
                arrayList.add(0, arr[i]);
            } else {
                arrayList.add(arr[i]);
            }
        }
        arrayList.forEach(System.out::println);
    }

    private static void usingArray() {
        int[] arr = {0, 1, 1, 1, 0, 0, 0};
        int size = arr.length;
        int[] newarr = new int[size];
        int startIndex = 0;
        int endIndex = size - 1;
        for (int i = 0; i <= size - 1; i++) {
            if (arr[i] == 0) {
                newarr[startIndex] = arr[i];
                startIndex++;
            } else {
                newarr[endIndex] = arr[i];
                endIndex--;
            }
        }
        Arrays.stream(newarr).forEach(System.out::println);
    }
}
