import java.util.*;
import java.util.Collections;

public class BucketSort{

        // Function to sort arr[] of size n
        // using bucket sort
        public void bucketSort(long array[])
        {
            int n = array.length;
            if (n <= 0)
                return;

            // 1) Create n empty buckets
            @SuppressWarnings("unchecked")
            Vector<Long>[] buckets = new Vector[n];

            for (int i = 0; i < n; i++) {
                buckets[i] = new Vector<Long>();
            }

            // 2) Put array elements in different buckets
            for (int i = 0; i < n; i++) {
                int idx = (int) (array[i] * n);
                buckets[idx].add(array[i]);
            }

            // 3) Sort individual buckets
            for (int i = 0; i < n; i++) {
                Collections.sort(buckets[i]);
            }

            // 4) Concatenate all buckets into arr[]
            int index = 0;
            for (int i = 0; i < n; i++) {
                for (int j = 0; j < buckets[i].size(); j++) {
                    array[index++] = buckets[i].get(j);
                }
            }
        }
}

