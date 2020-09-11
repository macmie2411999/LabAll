package Lab7;

import java.util.Scanner;

public class TestDoubleList {
    public static void main(String args[]) {
        DoubleList obj = new DoubleList("Defaul");
        executeFunction(obj);
    }

    public static void executeFunction(DoubleList obj) {
        Scanner sc = new Scanner(System.in);
        boolean check = true;
        while (check) {
            showFunction();
            System.out.print("Your choose? (1-11) ");
            int button = sc.nextInt();
            sc.nextLine();
            switch (button) {
                case 1:
                    System.out.print("Name of list: ");
                    obj = new DoubleList(sc.nextLine());
                    System.out.print("Creat new list successfull.");
                    break;
                case 2:
                    obj.showElements();
                    break;
                case 3:
                    System.out.print("Position of value need to search: ");
                    obj.showSpecifiedElement(sc.nextInt());
                    sc.nextLine();
                    break;
                case 4:
                    obj.showSizeOfList();
                    break;
                case 5:
                    System.out.print("Position of value need to remove: ");
                    obj.removeSpecifiedElement(sc.nextInt());
                    sc.nextLine();
                    break;
                case 6:
                    obj.removeElements();
                    break;
                case 7:
                    System.out.print("Position of new value: ");
                    int tempPosition = sc.nextInt();
                    sc.nextLine();
                    System.out.print("New value: ");
                    Double newValue = sc.nextDouble();
                    sc.nextLine();
                    obj.changeValueAtSpecifiedPosition(tempPosition, newValue);
                    break;
                case 8:
                    System.out.print("Value need to search: ");
                    obj.searchPositionofValue(sc.nextInt());
                    sc.nextLine();
                    break;
                case 9:
                    obj.showInformation();
                    break;
                case 10:
                    System.out.print("Value need add to list: ");
                    obj.addElement(sc.nextDouble());
                    sc.nextLine();
                    break;
                case 11:
                    obj.addManyElements();
                    break;
            }
            System.out.println("\nCountinues?(true/false): ");
            check = sc.nextBoolean();
            sc.nextLine();
        }
        sc.close();
    }

    public static void showFunction() {
        System.out.println("------------FUNCTION--------------");
        System.out.println("Press 1: Creat new list.");
        System.out.println("Press 2: Show elements of list.");
        System.out.println("Press 3: Show element at specified position.");
        System.out.println("Press 4: Size of list.");
        System.out.println("Press 5: Remove element at specified position.");
        System.out.println("Press 6: Remove all elements of list.");
        System.out.println("Press 7: Change value at specified position.");
        System.out.println("Press 8: search position of value.");
        System.out.println("Press 9: Show all information of list.");
        System.out.println("Press 10: Add one element to list.");
        System.out.println("Press 11:Add many elements to list.");
    }
}
