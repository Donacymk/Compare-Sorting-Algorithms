class RadixSort {

    // Using counting sort to sort the elements in the basis of significant places
    private void countingSort(long array[],int place) {
        int size = array.length;
        long[] output = new long[size + 1];
        long max = array[0];
        for (int i = 1; i < size; i++) {
            if (array[i] > max)
                max = array[i];
        }
        long[] count = new long[(int) (max + 1)];

        for (int i = 0; i < max; ++i)
            count[i] = 0;

        // Calculate count of elements
        for (int i = 0; i < size; i++)
            count[(int) ((array[i] / place) % 10)]++;

        // Calculate cummulative count
        for (int i = 1; i < 10; i++)
            count[i] += count[i - 1];

        // Place the elements in sorted order
        for (int i = size - 1; i >= 0; i--) {
            output[(int) (count[(int) ((array[i] / place) % 10)] - 1)] = array[i];
            count[(int) ((array[i] / place) % 10)]--;
        }

        for (int i = 0; i < size; i++)
            array[i] = output[i];
    }

    // Function to get the largest element from an array
    private long getMax(long[] array) {
        long max = array[0];
        int n = array.length;
        for (int i = 1; i < n; i++)
            if (array[i] > max)
                max = array[i];
        return max;
    }

    // Main function to implement radix sort
    void radixSort(long array[]) {
        // Get maximum element
        long max = getMax(array);

        // Apply counting sort to sort elements based on place value.
        for (int place = 1; max / place > 0; place *= 10)
            countingSort(array, place);
    }
}
