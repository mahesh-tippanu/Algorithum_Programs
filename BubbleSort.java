package bridgelabz;
import java.util.Arrays;
public class BubbleSort {
         /**
         * Method to perform Bubble Sort
         * @param arr takes int integer array as a parameter
         */
        void bubbleSort(int arr[]) {
            int n = arr.length;
            for (int i = 0; i < n - 1; i++)
                for (int j = 0; j < n - i - 1; j++)
                    if (arr[j] > arr[j + 1]) {
                        int temp = arr[j];
                        arr[j] = arr[j + 1];
                        arr[j + 1] = temp;
                    }
            System.out.println("Sorted array " + Arrays.toString(arr));
        }
        public static void main(String[] args) {
            BubbleSort obj = new BubbleSort();
            int[] arr = {64, 34, 25, 12, 22, 11, 90};
            obj.bubbleSort(arr);
        }
    }
