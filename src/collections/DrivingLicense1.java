package collections;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class DrivingLicense1 {

    String myName;
    int agents;
    ArrayList<String> customers = new ArrayList<String>();
    String customerNames;
    int processTime = 20;

    public void enterDetails() {
        System.out.println("Enter your Name capitalised");
        Scanner scanner = new Scanner(System.in);
        myName = scanner.nextLine();
        System.out.println("My name is :" + myName);

        System.out.println("Enter the no of Agents");
        agents = Integer.parseInt(scanner.nextLine());
        System.out.println("No of Agents available:" + agents);

        // input 4 names from command line
        System.out.println("Enter 4 Customer's names with space in between:");
        customerNames = scanner.nextLine();

        String[] name = customerNames.split("\\s", 0);
        String customerOne = name[0];
        String customerTwo = name[1];
        String customerThree = name[2];
        String customerFour = name[3];

        customers.add(myName);
        customers.add(customerOne);
        customers.add(customerTwo);
        customers.add(customerThree);
        customers.add(customerFour);
        System.out.println("The Name(s) of the customer are  " + customers.toString());

    }

    public void sortNames() {
        Collections.sort(customers);
        for (String counter : customers)
            System.out.println(counter);
    }

    public void timeTakenForMyLicense() {
        int indexOfMyName = customers.indexOf(myName);
        System.out.println(indexOfMyName);
        if (agents >= 5) {
            System.out.println("My Driving License Processing time is: " + processTime+ " Minutes");
        } else if (agents == 4) {
            if (indexOfMyName == 4) {
                System.out.println("My Driving License Processing time is: " + (processTime * 2)+ " Minutes");
            } else {
                System.out.println("My Driving License Processing time is: " + processTime+ " Minutes");
            }
        } else if (agents == 3) {
            if (indexOfMyName < 3) {
                System.out.println("My Driving License Processing time is: " + processTime+ " Minutes");
            } else {

                System.out.println("My Driving License Processing time is: " + (processTime * 2)+ " Minutes");
            }

        } else if (agents == 2) {
            if (indexOfMyName < 2) {
                System.out.println("My Driving License Processing time is: " + processTime + " Minutes");
            } else if (indexOfMyName < 4) {
                System.out.println("My Driving License Processing time is: " + (processTime * 2)+ " Minutes");
            } else
                System.out.println("My Driving License Processing time is: " + (processTime * 3)+ " Minutes");
        } else {
            if (indexOfMyName == 0)
                System.out.println("My Driving License Processing time is: " + processTime+ " Minutes");
            else if (indexOfMyName == 1)
                System.out.println("My Driving License Processing time is: " + (processTime * 2)+ " Minutes");
            else if (indexOfMyName == 2)
                System.out.println("My Driving License Processing time is: " + (processTime * 3)+ " Minutes");
            else if (indexOfMyName == 3)
                System.out.println("My Driving License Processing time is: " + (processTime * 4)+ " Minutes");
            else
                System.out.println("My Driving License Processing time is: " + (processTime * 5)+ " Minutes");
        }
    }

    public static void main(String[] args) {
        DrivingLicense1 drivingLicense1 = new DrivingLicense1();
        drivingLicense1.enterDetails();
        drivingLicense1.sortNames();
        drivingLicense1.timeTakenForMyLicense();
    }
}




