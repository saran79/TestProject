package collections;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class DrivingLicense {
    String myName;
    int agents;
    ArrayList<String>  customers= new ArrayList<String>();
    String[] customerNames = {"Adam", "Caroline", "Rebecca", "Frank"};
    int processTime = 20;

    public void enterDetails() {
        System.out.println("Enter your Name capitalised");
        Scanner scanner = new Scanner(System.in);
        myName = scanner.nextLine();
        System.out.println("My name is :" + myName);
        System.out.println("Enter the no of Agents");
        agents = scanner.nextInt();
    //    System.out.println("No of Agents available:" + agents);


        for (int i = 0; i < 4; i++) {
            customers.add(customerNames[i]);
             System.out.println("The Name(s) of the customer are  "+customers.toString());
        }
        customers.add(myName);
        System.out.println("The Name(s) of the customer are  "+customers.toString());

    }
    public void sortNames() {
        Collections.sort(customers);
        for(String counter: customers)
            System.out.println(counter);
    }

    public void timeTakenForMyLicense() {
        int indexOfMyName = customers.indexOf(myName);
        System.out.println(indexOfMyName);
        if (agents >= 5) {
            System.out.println("My Driving License Processing time is: " + processTime);
        } else if (agents == 4) {
            if (indexOfMyName == 4) {
                System.out.println("My Driving License Processing time is: " + (processTime * 2));
            } else {
                System.out.println("My Driving License Processing time is: " + processTime);
            }
        } else if (agents == 3) {
            if (indexOfMyName < 3) {
                System.out.println("My Driving License Processing time is: " + processTime);
            } else {

                System.out.println("My Driving License Processing time is: " + (processTime * 2));
            }

        } else if (agents == 2) {
            if (indexOfMyName < 2) {
                System.out.println("My Driving License Processing time is: " + processTime);
            } else if (indexOfMyName < 4) {
                System.out.println("My Driving License Processing time is: " + (processTime * 2));
            } else
                System.out.println("My Driving License Processing time is: " + (processTime * 3));
        }
        else {
            if(indexOfMyName==0)
                System.out.println("My Driving License Processing time is: " + processTime);
            else if(indexOfMyName==1)
                System.out.println("My Driving License Processing time is: " + (processTime * 2));
            else if(indexOfMyName==2)
                System.out.println("My Driving License Processing time is: " + (processTime * 3));
            else if(indexOfMyName==3)
                System.out.println("My Driving License Processing time is: " + (processTime * 4));
            else
                System.out.println("My Driving License Processing time is: " + (processTime * 5));

        }
    }

    public static void main(String[] args) {
        DrivingLicense drivingLicense = new DrivingLicense();
        drivingLicense.enterDetails();
        drivingLicense.sortNames();
        drivingLicense.timeTakenForMyLicense();
    }
}
