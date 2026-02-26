class QuickSort {

    // Quick Sort function
    void quickSort(int[] a, int low, int high) {
        if (low < high) {
            int pivotIndex = partition(a, low, high);
            quickSort(a, low, pivotIndex);      // Left side
            quickSort(a, pivotIndex + 1, high); // Right side
        }
    }

    // Partition using first element as pivot
    int partition(int[] a, int low, int high) {

        int key = a[low];       // pivot = first element
        int i = low + 1;        // i starts from second element
        int j = high;           // j starts from last element

        while (true) {

            // Move i to the right until a[i] > key
            while (i <= high && a[i] <= key) {
                i++;
            }

            // Move j to the left until a[j] < key
            while (a[j] > key) {
                j--;
            }

            // If i crosses j, stop
            if (i >= j) {
                break;
            }

            // Swap a[i] and a[j]
            int temp = a[i];
            a[i] = a[j];
            a[j] = temp;
        }

        // Swap pivot (key) with a[j]
        int temp = a[low];
        a[low] = a[j];
        a[j] = temp;

        return j; // Return pivot final position
    }

    // Main to test
    public static void main(String[] args) {
        int[] arr = {24, 9, 29, 14, 19, 27};

        QuickSort qs = new QuickSort();
        qs.quickSort(arr, 0, arr.length - 1);

        System.out.println("Sorted array:");
        for (int x : arr) {
            System.out.print(x + " ");
        }
    }
}

