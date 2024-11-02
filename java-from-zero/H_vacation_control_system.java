/*************************************
 * Vacation control system exercise.**
 * ***********************************
 
 * Zero.SA tell us to do a system which calculates the 
holidays of the workers, taking in account the following 
characteristics:

There are 3 departments in Zero.SA:
1. IT (key 1)
2. Logistics (key 2)
3. Customer service (key 3)

The workers from key 1:
- With 1 year of service they have 20 days of vacation.
- Between 2 and 6 years of service they have 30 days of vacation.
- After 7 years of service they have 45 days of vacation

The workers from key 2:
- With 1 year of service they have 22 days of vacation.
- Between 2 and 6 years of service they have 35 days of vacation.
- After 7 years of service They have 50 days of vacation.

The workers from key 3:
- With 1 year of service they have 25 days of vacation.
- Between 2 and 6 years of service they have 40 days of vacation.
- After 7 years they have 55 days of vacation.

NOTE: The system will ask for the name, the key and the seniority
of the worker, then the system will provide the name of the worker, 
the key and the days that will have. Also the system will provide a 
welcome message for the worker, before the name.
*/

/*First of all we start importing scanner due tu the info the user will privide.
* Continuing adding the public class an the MAIN method for allow running the program*/
import java.util.Scanner;
public class H_vacation_control_system{
    public static void main(String[] args) {
    /* We start declaring the variables we'll be using in the logical part of the 
    program */   
        Scanner input = new Scanner(System.in);
       
        String name = "";
        int key = 0;
        int seniority = 0;
    /** After declaring the variables, we ask for data to the user, saving the info in 
     * that previously created variables.*/
        System.out.print("What is your name? ");
        name = input.nextLine();

        System.out.println("");

        System.out.print("What's your key? ");
        key = input.nextInt();

        System.out.println("");

        System.out.print("What is your seniority? ");
        seniority = input.nextInt();

    /** Now we've all the things on the table:
     * We've the library we'll be using
     * we've all the variables declared
     * we've tha user's info inside those variables
     
     * Now the thing is to do the logic of the program, in this case
     we'll be using the if-else structures we're seeing in provious lessons.*/
        if(key == 1 ){
            if(seniority == 1){
                System.out.println(name + " " + "You have 20 days of vacation");
            } if(seniority >=2 && seniority <=6){
                System.out.println(name + " " + "You have 30 days of vacation");
            } if(seniority >=7){
                System.out.println(name + " " + "You have 45 days of vacation");
            }
        }
        if(key == 2 ){
            if(seniority == 1){
                System.out.println(name + " " + "You have 22 days of vacation");
            } if(seniority >=2 && seniority <=6){
                System.out.println(name + " " + "You have 35 days of vacation");
            } if(seniority >=7){
                System.out.println(name + " " + "You have 50 days of vacation");
            }
        }
        if(key == 3 ){
            if(seniority == 1){
                System.out.println(name + " " + "You have 25 days of vacation");
            } if(seniority >=2 && seniority <=6){
                System.out.println(name + " " + "You have 40 days of vacation");
            } if(seniority >=7){
                System.out.println(name + " " + "You have 55 days of vacation");
            }
        } else {
            system.out.println("That's an incorrect answer");
        }
    }
}
