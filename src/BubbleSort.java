public class BubbleSort {

    public void bubbleSort(long[] array){
        int numberOfElements = array.length;
        for(int i=0; i<numberOfElements - 1; i++) {
            for (int j = 0; j < numberOfElements - i - 1; j++) {
                if (array[j] > array[j + 1]) {
                    long temp = array[j + 1];
                    array[j + 1] = array[j];
                    array[j] = temp;
                }
            }
        }
    }

}
