import java.util.ArrayList;
import java.util.Arrays;

public class SortZeroOneTwoArray {
    public static void main(String[] args) {
        int[] arr = {1,0,1,1,2,2,2,2,0,0,1,1,0,0,1,0,0};
        usingWhile(arr);
    }

    private static void usingWhile(int[] arr) {
        int lowIndex = 0;
        int highIndex = arr.length-1;
        int midIndex = 0;
        int temp = 0;
        while(midIndex<=highIndex){
            switch (arr[midIndex]){
                case 0: {
                    temp = arr[lowIndex]  ;
                    arr[lowIndex]= arr[midIndex];
                    arr[midIndex] = temp;
                    lowIndex++;
                    midIndex++;
                    break;
                }
                case 1:{
                    midIndex++;
                    break;
                }
                case 2:{
                    temp = arr[midIndex];
                    arr[midIndex] = arr[highIndex];
                    arr[highIndex] = temp;
                    highIndex--;
                    break;
                }

            }
        }

        for (int i = 0; i < arr.length-1; i++){
            System.out.print(arr[i] +
                    " ");
        System.out.println("");
    }
    }
}
