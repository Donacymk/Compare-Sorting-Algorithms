public class Timetaken {

    public double timetakenbubble(){
        BubbleSort bb = new BubbleSort();
        GenerateArray gnArray = new GenerateArray();
        double startTime = System.currentTimeMillis();
        bb.bubbleSort(gnArray.generatedArray());
        double endTime = System.currentTimeMillis();
        double elapsedTime = endTime - startTime;
        return elapsedTime;
    }

    public double timetakenselectionSort(){
        SelectionSort ss = new SelectionSort();
        GenerateArray gnArray = new GenerateArray();
        double startTime = System.currentTimeMillis();
        ss.selectionSort(gnArray.generatedArray());
        double endTime = System.currentTimeMillis();
        double elapsedTime = endTime - startTime;
        return elapsedTime;
    }

    public double timetakenradixSort(){
        RadixSort rs = new RadixSort();
        GenerateArray gnArray = new GenerateArray();
        double startTime = System.currentTimeMillis();
        rs.radixSort(gnArray.generatedArray());
        double endTime = System.currentTimeMillis();
        double elapsedTime = endTime - startTime;
        return elapsedTime;
    }

    public double timetakeninsertionSort(){
        InsertionSort is = new InsertionSort();
        GenerateArray gnArray = new GenerateArray();
        double startTime = System.currentTimeMillis();
        is.insertionSort(gnArray.generatedArray());
        double endTime = System.currentTimeMillis();
        double elapsedTime = endTime - startTime;
        return elapsedTime;
    }

    public double timetakenmergeSort(){
        MergeSort ms = new MergeSort();
        GenerateArray gnArray = new GenerateArray();
        double startTime = System.currentTimeMillis();
        ms.mergeSort(gnArray.generatedArray(),0,gnArray.generatedArray().length-1);
        double endTime = System.currentTimeMillis();
        double elapsedTime = endTime - startTime;
        return elapsedTime;
    }


    public double timetakenquickSort(){
        QuickSort qs = new QuickSort();
        GenerateArray gnArray = new GenerateArray();
        double startTime = System.currentTimeMillis();
        qs.quickSort(gnArray.generatedArray(),0,gnArray.generatedArray().length-1);
        double endTime = System.currentTimeMillis();
        double elapsedTime = endTime - startTime;
        return elapsedTime;
    }
}
