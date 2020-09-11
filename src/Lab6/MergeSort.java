package Lab6;

import java.util.ArrayList;
import java.util.Arrays;

public class MergeSort {
    void merge(Students arrayStudents[], int l, int m, int r) {
        // Find sizes of two subarrays to be merged
        int n1 = m - l + 1;
        int n2 = r - m;

        /* Create temp arrays */
        Students L[] = new Students[n1];
        Students R[] = new Students[n2];

        /*Copy data to temp arrays*/
        for (int i = 0; i < n1; ++i)
            L[i] = arrayStudents[l + i];
        for (int j = 0; j < n2; ++j)
            R[j] = arrayStudents[m + 1 + j];

        //Students arrayL[] = (Students[]) Arrays.stream(L).toArray();
        //Students arrayR[] = (Students[]) Arrays.stream(R).toArray();

        /* Merge the temp arrays */

        // Initial indexes of first and second subarrays
        int i = 0, j = 0;

        // Initial index of merged subarry array
        int k = l;
        while (i < n1 && j < n2) {
            int temp = L[i].getName().compareTo(R[j].getName());
            if (temp < 1) {
                arrayStudents[k] = L[i];
                i++;
            } else {
                arrayStudents[k] = R[j];
                j++;
            }
            k++;
        }

        /* Copy remaining elements of L[] if any */
        while (i < n1) {
            arrayStudents[k] = L[i];
            i++;
            k++;
        }

        /* Copy remaining elements of R[] if any */
        while (j < n2) {
            arrayStudents[k] = R[j];
            j++;
            k++;
        }
    }

    // Main function that sorts arr[l..r] using
    // merge()
    public Students[] sort(Students arrayStudents[], int l, int r) {
        if (l < r) {
            // Find the middle point
            int m = (l + r) / 2;

            // Sort first and second halves
            sort(arrayStudents, l, m);
            sort(arrayStudents, m + 1, r);

            // Merge the sorted halves
            merge(arrayStudents, l, m, r);
        }
        return arrayStudents;
    }
}
