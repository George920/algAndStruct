public class Tests extends Main{
    public static void main(String[] args) {
        int[] arr = new int[N];
        fillingArr(arr);
        searchIndex(arr,81);
        searchIndex(arr,11111);
        searchValue(arr, 53);
        searchValue(arr, 0);
        delete(arr, 43);
        delete(arr, 553333);
        add(arr, 44, 44);
        add(arr, 44, 44435453);
        int[] arr1 = new int[N];
        int[] arr2 = new int[N];
        int[] arr3 = new int[N];
        int[] arr4 = new int[N];
        fillingArr(arr1);
        fillingArr(arr2);
        fillingArr(arr3);
        fillingArr(arr4);
        bubbleSort(arr1);
        insertionSort(arr2);
        selectionSort(arr3);
    }
}
