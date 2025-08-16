public class MergeSort {
    public static void merge(int arr[], int mid, int low, int high) {
        int b[] = new int[100];  
        int i = low, j = mid + 1, k = low;

        while (i <= mid && j <= high) {
            if (arr[i] < arr[j]) {
                b[k++] = arr[i++];
            } else {
                b[k++] = arr[j++];
            }
        }

        while (i <= mid) {
            b[k++] = arr[i++];
        }

        while (j <= high) {
            b[k++] = arr[j++]; 
        }

        for (i = low; i <= high; i++) {
            arr[i] = b[i]; 
        }
    
    }

    public static void mergeSort(int arr[], int low, int high) {
        if (low < high) {
            int mid = low + (high - low) / 2;
            mergeSort(arr, low, mid);
            mergeSort(arr, mid + 1, high);
            merge(arr, mid, low, high);
        }
    }

    public static void main(String[] args) {
        int a[] = {9, 14, 4, 8, 7, 5, 6};
        mergeSort(a, 0, a.length - 1);
        for (int i = 0; i < a.length; i++) {
            System.out.print(a[i] + " ");
        }
    }
}
