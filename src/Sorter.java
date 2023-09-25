public class Sorter {
    public static void main(String[] args) {
        int[] arr1 = {9,14,3,2,43,11,58,22};
        System.out.println("Before Selection Sort");
        for(int i:arr1){
            System.out.print(i+" ");
        }
        System.out.println();

        selectionSort(arr1);//sorting array using selection sort

        System.out.println("After Selection Sort");
        for(int i:arr1){
            System.out.print(i+" ");
        }



    }
    public static void selectionSort(int[] arr){
        for (int i = 0; i < arr.length - 1; i++)
        {
            int index = i;
            for (int j = i + 1; j < arr.length; j++){
                if (arr[j] < arr[index]){
                    index = j;//searching for lowest index
                }
            }
            int smallerNumber = arr[index];
            arr[index] = arr[i];
            arr[i] = smallerNumber;
        }
    }


    // method for insertion sort
    public static void insertionSort(int[] arr) {
        int n = arr.length;
        for (int i = 1; i < n; i++) { // start at 1 because first element is already sorted
            int key = arr[i];
            int j = i - 1;
            while (j >= 0 && arr[j] > key) { // move elements of arr[0..i-1], that are greater than key, to one position ahead of their current position
                arr[j + 1] = arr[j];
                j = j - 1;
            }
            arr[j + 1] = key; // insert key into the correct position in the sorted subarray
        }
    }

    // method sort calls insertion sort
    //
    public static void sort(int arr[]) {
        insertionSort(arr);
    }


}