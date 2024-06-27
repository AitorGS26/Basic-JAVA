/*
 * Switch is a control structure, it's like if and else but with 
 some differences.

 * In if-else structure, we've some different options for different
 cases, for example, imagin you're at home and a friend calls
 yo to go out, now you've different options of clothing for 
 different situations.
 if it rains i'll have warm clothes
 if it's sunny i'll wear shorts
 if it's cloudy, i'll have warm clothes but not for rain...

 * In a switch structure, we've one condition and multiple cases.
 For example, imagin you want to order a pizza, now you have one 
 option that is order a pizza, but you've different cases.
 case 1 - peperonni
 case 2 - 4 cheese
 case 3 - bbq pizza

 As you can see, in if-else structure, we have diferent options and
 diferent case for each option, in switch-case structure,
 we've one option and different cases for this.

Example"
*/
public class I_control_structures_Switch_and_Case{
    public static void main (String [] args){
        int num_1 = 5, num_2 =3, answer = 0;
        int parameter = 4;

        switch (parameter){
            case 1 : answer = num_1 + num_2;
            System.out.println("The result of the adding is:" + answer);
                    break;
            case 2 : answer = num_1 - num_2;
                System.out.println("the answer of the subtraction is: " + answer);
                break;
            case 3 : answer = num_1 * num_2;
                System.out.println("The result of the multiply is: " + answer);
                break;
            case 4 : answer = num_1 / num_2;
                System.out.println("The result of the division is: " + answer);
                break;
            default: System.out.println("This doesnt exist");
            break;
        }
    }
}