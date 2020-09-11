package Lab6;

// define class
class Students {
    // fields
    private String name;
    private int IDNumber;
    private double GPA;

    // constructor
    public Students(String name, int IDNumber, double GPA) {
        this.name = name;
        this.IDNumber = IDNumber;
        this.GPA = GPA;
    }

    // getter and setter
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getIDNumber() {
        return IDNumber;
    }

    public void setIDNumber(int IDNumber) {
        this.IDNumber = IDNumber;
    }

    public double getGPA() {
        return GPA;
    }

    public void setGPA(double GPA) {
        this.GPA = GPA;
    }

    // return information
    public void showInformation() {
        System.out.println("Name: " + this.getName() + " - ID: " + this.getIDNumber() + " - GPA: " + this.getGPA());
    }
}

public class TestStudents {
    public static void main(String args[]) {

        // creat array
        Students arrayStudents[] = creatArrayStudents();

        // show default list
        System.out.println("Dafault list");
        showArrayStudents(arrayStudents, 5);

        // sort and show result
        insertionSort(arrayStudents, 5);
        System.out.println("\nSorted list with ID");
        showArrayStudents(arrayStudents, 5);
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

    public static Students[] insertionSort(Students arrayStudents[], int numberElements) {
        int i, j;
        Students tempValue;
        for (i = 1; i < numberElements; i++) {
            tempValue = arrayStudents[i];
            j = i - 1;
            while (j >= 0 && arrayStudents[j].getIDNumber() > tempValue.getIDNumber()) {
                arrayStudents[j + 1] = arrayStudents[j];
                j = j - 1;
            }
            arrayStudents[j + 1] = tempValue;
        }
        return arrayStudents;
    }

    // show array
    public static void showArrayStudents(Students arrayStudents[], int numberElements) {
        System.out.println("---------------LIST STUDENTS----------------");
        for (int i = 0; i < numberElements; i++) {
            arrayStudents[i].showInformation();
        }
    }
}


