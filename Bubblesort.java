public class Bubblesort {
    public static int[] BubbleSort(int arr[]) {
        for (int i = 0; i < arr.length - 1; i++) {
            for (int j = 0; j < arr.length - i - 1; j++) {
                if (arr[j] > arr[j + 1]) {
                    // swap arr[j] and arr[j+1]
                    int temp = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = temp;
                }
            }
        }
        return arr;
    }

    public static void main(String[] args) {
        int arr[] = {7, 8, 3, 1, 2};
        BubbleSort(arr);
        for (int i : arr) {
            System.out.print(i + " ");
        }
    }
}
