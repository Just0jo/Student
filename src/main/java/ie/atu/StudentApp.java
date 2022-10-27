package ie.atu;

import java.util.Scanner;

public class StudentApp {
    public static void main(String[] args) {
        System.out.println("Please enter Student name:");
        Scanner input = new Scanner(System.in);
        String name = input.nextLine();
        System.out.println("You Entered : "+ name);

    }

}
