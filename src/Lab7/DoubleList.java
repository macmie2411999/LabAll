package Lab7;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Stream;

public class DoubleList {
    // fields
    private String nameList;
    List<Double> list = new ArrayList<Double>();

    // getter
    public String getNameList() {
        return nameList;
    }

    // constructors
    public DoubleList(String nameList) {
        this.nameList = nameList;
    }

    // show list
    public void showElements() {

        if(!list.isEmpty()) {
            System.out.print("Elements of list: ");
            for (int i = 0; i < list.size(); i++) {
                System.out.print(" " + list.get(i));
            }
        } else {
            System.out.println("List empty.");
        }
    }

    // show element at specified position
    public void showSpecifiedElement(int position) {
        System.out.println("Elements at position " + position + " is: " + list.get(position - 1));
    }

    // return size of list
    public void showSizeOfList() {
        System.out.println("Size of list is: " + this.list.size());
    }

    // remove element at specified position
    public void removeSpecifiedElement(int position) {
        list.remove(position - 1);
        System.out.println("Deleted element " + this.list.get(position - 1) + " from list.");
    }

    // remove all elements of list
    public void removeElements() {
        list.clear();
        System.out.println("List is empty now.");
    }

    // add element to list
    public void addElement(double value){
        this.list.add(value);
    }

    // add element to list
    public void addManyElements() {
        Scanner sc = new Scanner(System.in);
        System.out.print("Number of elements: ");
        int numberOfElement = sc.nextInt();
        sc.nextLine();
        System.out.print("Enter values: ");
        for(int i = 0; i< numberOfElement; i++){
            addElement(sc.nextInt());
        }
        sc.nextLine();
        System.out.print("Add successfully.");
    }

    // change value at specified position
    public void changeValueAtSpecifiedPosition(int position, double newValue) {
        list.set(position - 1, newValue);
        System.out.println("Change successfully.");
        System.out.println("Now value os element at position " + position + " is: " + this.list.get(position - 1));
    }

    // search position of value
    public void searchPositionofValue(double value) {
        if (list.contains(value)) {
            System.out.print("Value " + value + " exit at position:");
            for (int i = 0; i < list.size(); i++) {
                if (list.get(i) == value) {
                    System.out.print(" " + (i+1));
                }
            }
        } else {
            System.out.println("Value " + value + " does not exit in this list.");
        }
    }

    // show information of list
    public  void showInformation(){
        System.out.println("---------------INFORMATION------------------");
        System.out.println("Name of list: " + this.getNameList());
        System.out.println("Size of list: " + this.list.size());
        this.showElements();
    }
}
