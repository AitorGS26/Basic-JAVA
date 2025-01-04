/*In Java we can make loops, sometimes we'll need to repeat an action
 so on and so on until you need to finish, you can do it manually,
 but is not the same to do it for 3-4 repetitions or a million 
 repetitions, for this actions we've different type of variables.
 
 * In this case we'll work with "for" structure. 

 We've to have something into account when using this structure:

 The structure of "for" is the following:
 * for(start the loop; condition; increase){
 * instruction
 * }
 
 * When we use for, the variable we'll have to work with is "i"

 * If the variable we're using is only for "for" structure, we can
 declare it inside the structure. If not, we must declare it
 outside the structure. In my personal opinion declaring it
 outside will be the best option for having the code well 
 structured.
 
 * In a loop we'll search for having an increment or a decrease of
 something, the form for this will be ++ or -- next to the variable
 for increasing or decreasing one by one (i++ or i--).
 If we want to increase or decrease more than one by one, we'll do
 the following => i+=(number for increasing or decreasing by itself)

 You'll understand better with an example.
 */
public class J_loops_or_repetitive_structure_For {

    public static void main(String[] args) {
        int i = 10; //here we declare the variable i
        for (i = 10; i < 10010; i += 10) { //start; condition; increase
            System.out.print(i + ", ");//printing results
        }
    }
}
