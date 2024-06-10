/*
* Primitive data examples
* COMPLETE NUMBERS
* byte = -128 to 127
* short = -32.768 to 32.767
* int = longer
* long = longest
*
* NUMBERS WITH DECIMALS
* float=7 numbers after the,
* double= 15 numbers after the ,
* OTHERS
* char= only one character
* boolean= true or false
*
* OBJECT ONES
* String = text chains
*
* VARIABLES
* A space of the memory where we can allocate information 
about numbers or text.
* We need 2 things, the type of data and a name
* */

public class C_Variables_and_data_types  {
    public static void main (String[] arg){

        int shots = 40;
        int weeks = 52;
        int illness = 0;

        illness=shots * weeks;
        System.out.println("don't take so much shots man" + " " + illness + " " + "you'll be ill");

    }
}

