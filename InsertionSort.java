public class InsertionSort {
    public static void insertionSort(int arr[]){
        int key,j;
        for (int i = 1; i < arr.length; i++) {
            key = arr[i];
            j = i-1;
            while (j>=0&&arr[j]>key) {
                arr[j+1] = arr[j];
                j--;
            }
            arr[j+1] = key;
        }
    }
    public static void main(String[] args) {
        int a[] = {12, 54, 65, 60, 7 ,23, 9};
        insertionSort(a);
        for (int i = 0; i < a.length; i++) {
            System.out.print(a[i]+" ");
        }
    }
    
}
