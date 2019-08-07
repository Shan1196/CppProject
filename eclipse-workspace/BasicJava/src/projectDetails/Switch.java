package projectDetails;

import java.util.Scanner;

public class Switch {
    public  static void main(String [] args){
        
		
		@SuppressWarnings("resource")
		Scanner input = new Scanner ( System.in );
        System.out.println (" please enter a command:");
        String text = input. nextLine ();

        switch (text){
            case  "start":
                System.out.println (" Machine started !");
                break;

            case "stop":
                System.out.println ("Machine stopped");
                break;

            default:
                System.out.println ("Commend not recognized");
        }

    }
}

