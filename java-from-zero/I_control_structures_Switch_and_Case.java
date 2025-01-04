/*Switch-case is a control structure, like if and else but with 
 some differences.

 * In if-else structure, we've some different options for different
 cases, for example, imagin you're at home and a friend calls
 yo to go out, now you've different options of clothing for 
 different situations.

  * if it rains i'll have warm clothes, or not
  * if it's sunny i'll wear shorts, or not
  * if it's cloudy, i'll have warm clothes but not for rain...

 * In a switch-case structure, we've one condition and multiple cases.
 For example, imagin you want to order a pizza, now you have one 
 option that is order a pizza, but you've different cases.

  * case 1 - peperonni
  * case 2 - 4 cheese
  * case 3 - bbq pizza

 As you can see, in if-else structure, we have diferent options and
 diferent cases for each option, in switch-case structure,
 we've one option and different cases for this.

Example"
 */
public class I_control_structures_Switch_and_Case {

    public static void main(String[] args) {
        int num_1 = 5, num_2 = 3, answer = 0;
        int parameter = 4; //put here your case number

        switch (parameter) {//here we've parameter, which will switch between different cases
            case 1:
                answer = num_1 + num_2;
                System.out.println("The result of the adding is:" + answer);
                break; //case one ends here
            case 2:
                answer = num_1 - num_2;
                System.out.println("the answer of the subtraction is: " + answer);
                break; //case two ends here
            case 3:
                answer = num_1 * num_2;
                System.out.println("The result of the multiply is: " + answer);
                break; //case 3 ends here
            case 4:
                answer = num_1 / num_2;
                System.out.println("The result of the division is: " + answer);
                break; //case 4 ends here
            default:
                System.out.println("This doesnt exist");
                //at the end as in if-else we add else, here we add default for wrong answers
                break;//default ends here
        }
    }
}
