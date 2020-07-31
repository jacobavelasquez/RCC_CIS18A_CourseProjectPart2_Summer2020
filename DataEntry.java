/* The purpose of this code is to help with the submission 
process when attempting to request for time-off, submit hours worked,
or contact a manager at Best Buy. */

//Files that need to be implemented and gathered from various resources
import java.util.Scanner;
import java.util.*;
import java.io.*;



class Tools
{
    int input;
    String name;
    Scanner in;

    Tools(){
        in = new Scanner(System.in);
    }
}

public class DataEntry extends Tools //Main class to implement program
{
    public static void main(String buffer[]) {
        Master obj = new Master();

        System.out.print("What is your name? : ");
        obj.name = obj.in.nextLine();
        System.out.println();

        System.out.println("Hello!\nPlease press '1' to enter hours worked this week.\n");
        System.out.println("Please press '2' to request time off or to leave Best Buy.\nMessage will be sent to manager John V.\n");
        System.out.print("Please Press '6' to cancel your request.\n");
        System.out.print("\n--> ");
        obj.input = obj.in.nextInt();
        System.out.println();


//First selection of the first input

        if (obj.input == 1) {
            System.out.println("Alrighty so you want to enter your hours to track.\nPlease press '1' if you worked exactly 40 hours\n");
            System.out.println("Please press '2' if you worked over 40 hours\n");
            System.out.println("Please press '3' if you worked under 40 hours\n");
            System.out.print("--> ");
            obj.input = obj.in.nextInt();
            System.out.println();

            if (obj.input == 1) {
                System.out.println(obj.name + " you worked 40 hours this week!");
            }
            if (obj.input == 2) {
                while (obj.input == 2) {
                    System.out.print("Please enter the number of hours you worked: ");
                    obj.input = obj.in.nextInt();
                    System.out.println();

                    if (obj.input <= 40) {
                        System.out.println("Oh no it seems the number entered was entered wrong ");
                        obj.input = 2;
                    }

                }

                System.out.println(obj.name + " you worked " + obj.input + " hours this week ");
                System.out.println();
            }
            if (obj.input == 3) {
                while (obj.input == 3) {
                    System.out.print("Enter the number of hours you worked: ");
                    obj.input = obj.in.nextInt();
                    System.out.println();

                    if (obj.input >= 40) {
                        System.out.println("The number entered is invalid ");
                        obj.input = 3;
                    }

                }

                System.out.println(obj.name + " you worked " + obj.input + " hours this week ");
                System.out.println();
            }
        }

// This is the end of the first selection of the first input

        /**/


// This is the second selection when entered 2

        if (obj.input == 2) {
            System.out.println("Alrighty so lets get in touch with John V.\nPlease press '1' if you are trying to report a sick or vacation day");
            System.out.print("\nPlease press '3' if you are trying submit your two weeks notice, which we hope you would reconsider\n--> ");
            obj.input = obj.in.nextInt();
            System.out.println();

            if (obj.input == 1) {
                while (obj.input == 1) {
                    System.out.println("Sick or Vaction Day --> Please press '1' for Monday\n");
                    System.out.println("Sick or Vaction Day --> Please press '2' for Tuesday\n");
                    System.out.println("Sick or Vaction Day --> Please press '3' for Wednesday\n");
                    System.out.println("Sick or Vaction Day --> Please press '4' for Thursday\n");
                    System.out.println("Sick or Vaction Day --> Please press '5' for Friday\n");
                    System.out.println("Sick or Vaction Day --> Please press '6' for Saturday\n");
                    System.out.print("Sick or Vaction Day --> Please press '7' for Sunday\n-->");
                    obj.input = obj.in.nextInt();
                    System.out.println();

                    if (obj.input != 1 && obj.input != 2 && obj.input != 3 && obj.input != 4 && obj.input != 5 && obj.input != 6 && obj.input != 7) {
                        System.out.println("Oh no the day you entered is invalid ");
                        System.out.println();
                        obj.input = 1;
                    } else {
                        switch (obj.input) {
                            case 1:
                                System.out.println("The day you selected is Monday.\nYour message has been logged and John V. will get to you as soon as possible.\nThank you!\n");
                                System.out.println();
                                obj.input = -1;
                                break;
                            case 2:
                                System.out.println("The day you selected is Tuesday.\nYour message has been logged and John V. will get to you as soon as possible.\nThank you!\n");
                                System.out.println();
                                break;
                            case 3:
                                System.out.println("The day you selected is Wednesday.\nYour message has been logged and John V. will get to you as soon as possible.\nThank you!\n");
                                System.out.println();
                                break;
                            case 4:
                                System.out.println("The day you selected is Thursday.\nYour message has been logged and John V. will get to you as soon as possible.\nThank you!\n");
                                System.out.println();
                                break;
                            case 5:
                                System.out.println("The day you selected is Friday.\nYour message has been logged and John V. will get to you as soon as possible.\nThank you!\n");
                                System.out.println();
                                break;
                            case 6:
                                System.out.println("The day you selected is Saturday.\nYour message has been logged and John V. will get to you as soon as possible.\nThank you!\n");
                                System.out.println();
                                break;
                            case 7:
                                System.out.println("The day you selected is Sunday.\nYour message has been logged and John V. will get to you as soon as possible.\nThank you!\n");
                                System.out.println();
                                break;
                            default:
                                break;
}
}
}
}
            if (obj.input == 3) {
                System.out.println(obj.name + " sorry to see you go but your notice has been submitted and we will respect your decision. We Wish You The Best In Life! ");

            }

// This ends the second selection when 2 is pressed 

/**/


// This is the selection if 6 is pressed

            if (obj.input == 6) {
                System.out.println("Oh okay exit was selected ");
            }

            System.out.println();
            System.out.println("Program Terminated ");

        }
// This is the end of the file
    }

}
