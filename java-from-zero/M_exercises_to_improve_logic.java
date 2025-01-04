/*
 * Lets do some exercises for applying what we've learned:
 * 1.-  1,2,3,4,5,6,7,8,9,10
 * 2.-  1,99,2,98,3,97,4,96,5,95
 * 3.-  0,1,1,2,3,5,8,13,21,34 (fibonacci, the next class will be for this)
 */

public class M_exercises_to_improve_logic {

    public static void main(String[] args) {
        System.out.println(" ");
        System.out.println("********************************");
        System.out.println("Lets go with the first exercise");
        System.out.println("********************************");
        System.out.println(" ");
        System.out.println("First exercise with FOR");
        int i = 0;
        for (i = 1; i < 11; i++) {
            if (i < 11) {
                System.out.print(i + ", ");
            } else {
                System.out.print(i);
            }
        }
        System.out.println(" ");
        System.out.println("First exercise with WHILE");

        i = 1;
        while (i < 11) {
            System.out.print(i + ", ");
            i++;
        }

        System.out.println(" ");
        System.out.println("First exercise with DO-WHILE");

        i = 1;
        do {
            System.out.print(i + ", ");
            i++;
        } while (i < 11);

//Now we start with the second exercise.
/*In this second exercise, we've two variables to introduce inside one loop, how will we do it?
 * We know the program will be inside the loop until the condition is solved so, after if-else
   structure, we'll add the secon variable's decrease, doing this we'll have the first's increase and second's decrease
         */
        System.out.println(" ");
        System.out.println("*********************************");
        System.out.println("Lets go with the second exercise");
        System.out.println("*********************************");
        System.out.println(" ");

        int j = 1;
        int k = 99;

        System.out.println("Second exercise with FOR");
        for (j = 1; j <= 5; j++) {
            if (j <= 5) {
                System.out.print(j + ", ");
                System.out.print(k + ", ");
            } else {
                System.out.print("j");
                System.out.print("k");
            }
            k--;

        }

        System.out.println(" ");

        j = 1;
        k = 99;

        System.out.println("Second exercise with WHILE");

        while (j <= 5) {
            if (j <= 5) {
                System.out.print(j + ", ");
                System.out.print(k + ", ");
            } else {
                System.out.print("j");
                System.out.print("k");
            }
            j++;
            k--;
        }
        System.out.println(" ");

        j = 1;
        k = 99;
        System.out.println("Second exercise with DO-WHILE");

        do {
            if (j <= 5) {
                System.out.print(j + ", ");
                j++;
                System.out.print(k + ", ");
                k--;
            } else {
                System.out.print("j");
                System.out.print("k");
                break;
            }
        } while (j <= 5);

    }
}
