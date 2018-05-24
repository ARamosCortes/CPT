import java.util.*;

public class CPT {

    public static void main(String[] args) {

        Scanner response = new Scanner(System.in);

        

        System.out.println("Press any key to start.");

        String start1 = response.next();

        

        System.out.println("Welcome to [placeholder]!");

        System.out.println("Press any key to start a new game.");

        String start2 = response.next();

        

        System.out.println("Would you like to see the index? (y/n)");

        String index1 = response.next();

        

            if (index1.equals("y")) {

                System.out.println("Note, all enemies have the same values.\n\nHP = Health Points\n(health value)\n\nAP = Action Points\n(Amount of actions you may do before the end of your turn)\n\nAR = Armour Rating\n(Enemies must roll above this number, added to their attack value, in order to do damage to you)\n\nAT = Attack\n(An added amount to your roll; AT + roll value = new AT, AT mus be greater than AR to do DMG.)\n\nDMG = Damage\n(The amount of damage you do to enemies).");

                System.out.println("Press any key to continue.");

        }

            if (index1.equals("n")) {
                System.out.println("Press any key to continue.");
        }
            else {
                System.out.println("Invalid response, please try again.");
        }
