package Lab6;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class TestSortingStudentsByGPA {
    public static void main(String args[]) {

        // creat array
        Students arrayStudents[] = creatArrayStudents();

        // show dafault array
        System.out.println("Defaul List");
        TestStudents.showArrayStudents(arrayStudents, 5);

        //use Collection with comparator
//        System.out.println("\nSort with comparator");
//        sortWithCollectionComparator(arrayStudents);
//        TestStudents.showArrayStudents(arrayStudents, 5);

        // use quick sort
        System.out.println("\nQuick Sort");
        quickSortArrayStudents(arrayStudents);
        TestStudents.showArrayStudents(arrayStudents, 5);
    }

    public static Students[] creatArrayStudents() {
        Students arrayStudents[] = new Students[5];
        arrayStudents[0] = new Students("Mac", 1514, 8);
        arrayStudents[1] = new Students("Tom", 1672, 10);
        arrayStudents[2] = new Students("Zac", 2871, 7);
        arrayStudents[3] = new Students("John", 1020, 9);
        arrayStudents[4] = new Students("Herry", 1111, 10);
        return arrayStudents;
    }

    public static void quickSortArrayStudents(Students arrayStudents[]) {
        SortingStudentsByGPA.quickSortArrayStudents(arrayStudents, 0, 4);
    }

    public static void sortWithCollectionComparator(Students arrayStudents[]) {
        List<Students> listStudents = Arrays.asList(arrayStudents);
        Collections.sort(listStudents, new SortingStudentsByGPA()); // method references
    }
}
