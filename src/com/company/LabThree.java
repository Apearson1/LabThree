package com.company;


        


 public class LabThree

 }{





      /*

Prompt the user to enter an integer//
display a table of squares and cubes from 1 to the value entered//
Ask if the user wants to continue//
Only continue if the user agrees to//
assume that the user will enter vail data//

*/




public static void integers(int number) {

        System.out.println(" Learn your squares and cubes!");
        System.out.println();

        Scanner sc = new Scanner(System.in);
        String choice = "y";

        while (choice.equalsIgnoreCase("y")) {
            //  input from the user
            System.out.println("Enter an Integer: ");
            int integerNext = sc.nextInt();

            System.out.println("Number" + "  " + "Squared" + "  " + "Cubed");
            System.out.println("======" + "  " + "======" + "  " + "======");

            for (int i = 1; i <= integerNext; i++) {
                i = integerNext;
                int numberSquared = (int) Math.pow(i, 2);
                int numberCubed = (int) Math.pow(i, 3);

                String message = "\n" + i + "       " + numberSquared + "       " + numberCubed;

                System.out.println(message);
                System.out.println();

                // Ask if the user wants to continue//
                System.out.print("Continue? (y/n): ");
                choice = sc.next();
                System.out.println();
            }
        }
    }
}










