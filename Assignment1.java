// Assignment #: 1
//         Name: Joseph Kharzo
//      Lecture: TTH 1:30-2:45pm
//   Time Spent: 10 minutes
//  Description: This class reads an integer from a keyboard and prints it out
//               along with other messages.

import java.util.Scanner;

public class Assignment1 {
  
    public static void main (String[] args) {
        
        // The variable that will store the user's input
        int number;
        
        // The scanner class will be used to read user input
        Scanner console = new Scanner(System.in);
        
        // Read an integer entered by a user
        number = console.nextInt();     

        // The user's input is displayed along with some supplementary information
        System.out.print("This program reads an integer from a keyboard,\n"
                      + "and prints it out on the display screen.\n"
                      + "The number is:" + number + "\n"
                      + "Make sure that you get the exact same output as the expected one!\n");
  }
}


