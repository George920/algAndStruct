import java.util.Random;

public class Main {
    public static final int N = 100000;
    public static final int MAXSIZE = 250;
    public static final int MINSIZE = -250;

    protected static int[] fillingArr(int[] arr) {
        Random rnd = new Random();
        for (int i = 0; i < arr.length; i++) {
            arr[i] = rnd.nextInt(MAXSIZE-MINSIZE +1) + MINSIZE;
        }
        return arr;
    }

    protected static void printArr(int[] arr) {
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
            if (i % 10 == 9 && i > 0) {
                System.out.println();
            }
        }
    }

    protected static void searchIndex(int[] arr, int ind) {
        if (ind >= 0 && ind < arr.length) {
            System.out.println("Значение элемента с индексом " + ind + ": " + arr[ind]);
        } else {
            System.out.println("Эллемент с индексом " + ind + " не найден");
        }

    }

    protected static void searchValue(int[] arr, int val) {
        int b = 0;
        if (val<MINSIZE || val>MAXSIZE)
        {
            System.out.println("Введенное число выходит за рамки значений данного массива");
        } else {
            System.out.print("Список индексов эллементов: ");
            for (int i = 0; i < arr.length; i++) {
                if (arr[i] == val) {
                    System.out.print(i + " ");
                    b++;
                }
            }
            System.out.println();
            if (b == 0) {
                System.out.println("Эллемент со значением " + val + " не найден");
            }
        }
    }

    protected static void delete(int[] arr, int ind) {
        if (ind >= 0 && ind < arr.length) {
            System.out.println("Удален эллемент с индексом: " + ind + " и значением: " + arr[ind]);
            arr[ind] = 0;
        } else {
            System.out.println("Эллемента с индексом " + ind + " не существует");
        }
    }

    protected static void add(int[] arr, int value, int ind) {
        if (value<MINSIZE || value>MAXSIZE)
        {
            System.out.println("Введенное число выходит за рамки значений данного массива");
        } else {
            if (ind >= 0 && ind < arr.length) {
                System.out.println("Значение эллемента с индексом " + ind + " изменино с " + arr[ind] + " на " + value);
                arr[ind] = value;
            } else {
                System.out.println("Эллемента с индексом " + ind + " не существует");
            }
        }
    }
    protected static void bubbleSort (int[] arr){
        long a = System.currentTimeMillis();
        boolean sort = false;
        int cell;
        while (!sort){
            sort = true;
            for (int i = 0; i < arr.length-1; i++) {
                if (arr[i]>arr[i+1]){
                    cell = arr[i];
                    arr[i] = arr[i+1];
                    arr[i+1] = cell;
                    sort = false;
                }
            }
        }
        System.out.println("Сортировка bubbleSort закончила свою работа за: " + (System.currentTimeMillis()-a));
    }
    protected static void insertionSort (int[] arr){
        long a = System.currentTimeMillis();
        for (int i = 1; i < arr.length; i++) {
            int cell = arr[i];
            int j = i - 1;
            while (j>0 && cell<arr[j]){
                arr[j+1] = arr[j];
                j--;
            }
            arr[j+1] = cell;
        }
        System.out.println("Сортировка insertionSort закончила свою работа за: " + (System.currentTimeMillis()-a));
    }
}