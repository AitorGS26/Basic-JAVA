/*
if => When this happens...
else=> if the previous order doesn't happen...
 */

/*
Practice. Do a program who calculates the average of 
The following subjets and which tell us
if the fella has approved or not.

Math: 4
Gym: 9
Biology: 6

For having a pass! you've to have an average higher than 6


 */

 public class D_If_else_structures {

    public static void main(String[] args){

        int math= 4;
        int gym= 9;
        int bio= 6;
        int average= 0;

        average = (math + gym + bio)/3;
            if (average >= 6) {
                System.out.println("You've passed!");
            } else {
                    System.out.println("Study more for the next time");
                }

            }

    }


