/*
 * Name:Allanah Brisebois
 */
package wizardthings;

import java.util.Scanner;

public class WizardThings {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("Hello! Welcome to the Wizarding World!");
        System.out.println("First we must test that you're a true witch or wizard...");
        System.out.println("Have you ever caused something that you can't explain? We don't judge if you accidentally blew up your aunt, we promise (yes/maybe/no)");
        
        boolean butterbeer = false;

        do {
            String magic = input.nextLine();
            
            if (magic.equalsIgnoreCase("Yes")) {
                System.out.println("You are a wizard/wizard!!! Welcome!");
                System.out.println("Are you male or female?");
                
            } else if (magic.equalsIgnoreCase("Maybe")) {
                System.out.println("This requires further investigation!");

            } else if (magic.equalsIgnoreCase("No")) {
                System.out.println("You muggle..");
            } else {
                System.out.println("You may have drank too much butterbeer.. Please enter yes/no/maybe.");
                butterbeer = true;
            }

        } while (true);

    }

}
