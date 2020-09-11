package Lab6;

import java.util.Comparator;

public class SortingStudentsByGPA implements Comparator<Students> {

    @Override
    public int compare(Students o1, Students o2) {
        return (int) ((int) o2.getGPA() - o1.getGPA());
    }

    // quick sort
    public static void quickSortArrayStudents(Students arrayStudents[], int low, int high) {
        if (low < high) {
            int pi = partition(arrayStudents, low, high);
            quickSortArrayStudents(arrayStudents, low, pi - 1);
            quickSortArrayStudents(arrayStudents, pi + 1, high);
        }
    }

    public static int partition(Students arrayStudents[], int low, int high) {
        Students pivot = arrayStudents[high];
        int left = low;
        int right = high - 1;
        while (true) {
            while (left <= right && arrayStudents[left].getGPA() > pivot.getGPA()) left++;
            while (right >= left && arrayStudents[right].getGPA() < pivot.getGPA()) right--;
            if (left >= right) break;

            // swap
            Students temps = arrayStudents[left];
            arrayStudents[left] = arrayStudents[right];
            arrayStudents[right] = temps;

            left++;
            right--;
        }

        // swap
        Students temps = arrayStudents[left];
        arrayStudents[left] = arrayStudents[high];
        arrayStudents[high] = temps;

        return left;
    }
}
