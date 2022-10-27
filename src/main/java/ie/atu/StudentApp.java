package ie.atu;

import java.util.Scanner;

public class StudentApp {
    public static void main(String[] args) {
        // created first instance of student app
        System.out.println("Please enter Student name:");
        Scanner input = new Scanner(System.in);
        String name = input.nextLine();
        Student stuAPP = new Student();
        stuAPP.setName(name);
        System.out.println("You Entered : "+ stuAPP.getName());

        System.out.println("Please enter Student course:");
        String course = input.nextLine();
        stuAPP.setCourse(course);
        System.out.println("You Entered : "+ stuAPP.getCourse());

        System.out.println("Please enter email:");
        String email = input.nextLine();
        stuAPP.setEmail(email);
        System.out.println("You Entered : "+ stuAPP.getEmail());


        // created second instance of student app
        Student stuAPP2 = new Student();
        System.out.println("Please enter second Student name:");
        String name2 = input.nextLine();
        stuAPP2.setName(name2);
        System.out.println("You Entered : "+ stuAPP2.getName());



        System.out.println("Please enter second Student course:");
        String course2 = input.nextLine();
        stuAPP2.setCourse(course2);
        System.out.println("You Entered : "+ stuAPP2.getCourse());

        System.out.println("Please enter second email:");
        String email2 = input.nextLine();
        stuAPP2.setEmail(email2);
        System.out.println("You Entered : "+ stuAPP2.getEmail());




    }

}
