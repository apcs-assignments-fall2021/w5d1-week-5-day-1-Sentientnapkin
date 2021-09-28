import java.util.Arrays;

public class MyMain {
    // Sorting:
    // Implement the selection sort algorithm that we discussed in class
    // to sort our code
    // This algorithm returns the sorted array
    public static int[] selectionSort(int[] arr) {
        int smallest = Integer.MAX_VALUE;
        int between = 0;
        int smallestIndex = 0;
        for(int i = 0;i<arr.length;i++){
            for(int j = i;j<arr.length;j++){
                smallest = Math.min(smallest,arr[j]);
            }
            for(int k = i;k<arr.length;k++){
                if (arr[k] == smallest)
                    smallestIndex = k;
            }
            between = arr[i];
            arr[i] = arr[smallestIndex];
            arr[smallestIndex] = between;
            smallest = Integer.MAX_VALUE;
        }
        return arr;
    }

    // Implement the insertion sort algorithm that we discussed in class
    // to sort our code
    // This algorithm returns the sorted array
    public static int[] insertionSort(int[] arr) {
        int between = 0;
        for(int i = 0;i<arr.length;i++){
            for(int j = 0;j<i;j++){
                if (arr[i]<arr[j]){
                    between = arr[j];
                    arr[j]=arr[i];
                    arr[i] = between;
                }
            }
        }
        return arr;
    }

    public static void main(String[] args) {
        System.out.println("Selection Sort Tests");
        System.out.println(Arrays.toString(selectionSort(new int[] {6, 1, 3, 8, 2, 9}))); // [1, 2, 3, 6, 8, 9]
        System.out.println(Arrays.toString(selectionSort(new int[] {12, 5, 23, 74, 15, 86, 2}))); // [2, 5, 12, 15, 23, 74, 86]

        System.out.println("Insertion Sort Tests");
        System.out.println(Arrays.toString(insertionSort(new int[] {6, 1, 3, 8, 2, 9}))); // [1, 2, 3, 6, 8, 9]
        System.out.println(Arrays.toString(insertionSort(new int[] {12, 5, 23, 74, 15, 86, 2}))); // [2, 5, 12, 15, 23, 74, 86]
    }
}