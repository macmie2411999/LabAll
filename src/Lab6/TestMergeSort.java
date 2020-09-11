package Lab6;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;

public class TestMergeSort {
    public static void main(String args[]) {
        Students[] bigList = combineTwoList(creatlist1(), creatlist2());

        // show list default
        System.out.println("-------------------List Default------------------");
        showArrayStudents(bigList);

        // merge sort
        MergeSort newSort = new MergeSort();
        Students[] sortedArray = executeMergeSort(bigList, newSort);

        // show list after sort
        System.out.println("\n----------------------Sorted List (alphabet)--------------------");
        showArrayStudents(sortedArray);
    }

    // create 2 list
    public static Students[] creatlist1() {
        Students[] list = new Students[5];
        list[0] = new Students("Dumbledore", 15172, 10);
        list[1] = new Students("Harry", 16943, 9);
        list[2] = new Students("Snape", 34368, 10);
        list[3] = new Students("Jame", 25718, 9);
        list[4] = new Students("Lily", 15172, 9);
        return list;
    }

    public static Students[] creatlist2() {
        Students[] list = new Students[5];
        list[0] = new Students("Voldemort", 31234, 10);
        list[1] = new Students("Bellatrix", 15739, 7);
        list[2] = new Students("Malefoy", 17752, 6);
        list[3] = new Students("Hermione", 29513, 10);
        list[4] = new Students("Ron", 217746, 8);
        return list;
    }

    // combine 2 lists
    public static Students[] combineTwoList(Students[] list1, Students[] list2) {
        Students[] bigList = new Students[10];
        for (int i = 0; i < 5; i++) {
            bigList[i] = list1[i];
        }

        for (int i = 0; i < 5; i++) {
            bigList[i + 5] = list2[i];
        }

        return bigList;
    }

    // merge sort
    public static Students[] executeMergeSort(Students[] bigList, MergeSort newSort) {
        Students[] newArrayStudent = newSort.sort(bigList, 0, bigList.length - 1);
        return newArrayStudent;
    }

    // show list
    public static void showArrayStudents(Students[] arrayStudents) {
        Iterator<Students> iterator = Arrays.stream(arrayStudents).iterator();
        while (iterator.hasNext()) {
            Students element = iterator.next();
            element.showInformation();
        }
    }
}
