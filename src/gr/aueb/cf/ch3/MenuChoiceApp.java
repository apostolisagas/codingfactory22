package gr.aueb.cf.ch3;

import java.util.Scanner;

/**
 * Εμφανίζει ένα μενού και ο χρήστης
 * δίνει μία επιλογή και λαμβάνει ένα
 * αντίστοιχο feedback/confirmation.
 */
public class MenuChoiceApp {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int choice = 0;

        do {
            System.out.println("Επιλέξτε ένα από τα παρακάτω:");
            System.out.println("1. Εισαγωγή");
            System.out.println("2. Ενημέρωση");
            System.out.println("3. Διαγραφή");
            System.out.println("4. Αναζήτηση");
            System.out.println("5. Έξοδος");

            choice = in.nextInt();

            if (choice < 1 || choice > 5) {
                System.out.println("Μη έγκυρη επιλογή");
                continue;
            }

            if (choice == 5) {
                System.out.println("Eπιλέξατε Έξοδο");
            }

            if (choice == 1) {
                System.out.println("Eπιλέξατε Εισαγωγή");
            } else if (choice == 2)  {
                System.out.println("Eπιλέξατε Ενημέρωση");
            } else if (choice == 3)  {
                System.out.println("Eπιλέξατε Διαγραφή");
            } else {
                System.out.println("Eπιλέξατε Αναζήτηση");
            }
        } while (choice != 5);
    }
}
