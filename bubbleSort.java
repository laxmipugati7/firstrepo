public class bubbleSort {
    public static void main(String[] args) {
        //-----------------------------bubble sort ----------------------------------
       int[] array = {43, 45, 65, 67, 65, 43, 34, 23};
        System.out.println("original array:");
        printArray(array);

        bubbleSort(array);

        System.out.println("sorted array");
        printArray(array);
    }

    public static void bubbleSort(int[] array) {
        int n = array.length;
        for (int i = 0; i < n - 1; i++) {
            for (int j = 0; j < n - i - 1; j++) {
                if (array[j] > array[j + 1]) {
                    int temp = array[j];
                    array[j] = array[j + 1];
                    array[j + 1] = temp;
                }
            }

    }
}
  public static void printArray(int[] array) {
        for (int num: array) {
            System.out.print(num+" ");
        }
    }

}


