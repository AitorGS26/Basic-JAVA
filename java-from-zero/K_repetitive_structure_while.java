/*
 * Continuing with the loops in java, we have the "while" structure.
 This is simmilar but different of "for".
 
 * First of all the variable will be declared outside the brackets
 there is no option for declaring it inside the structure as "for".
 * Previously we've learned that "for" structure is the following:
 for(start; condition; increase)
 
 In this case "while" structure works different, inside the brackets
 we only have to put the condition (we've already declared the variable)

 * Then we'll print the result and AFTER this,we'll put the increase.
 
 */

 class K_repetitive_structure_while{
    public static void main(String[] args) {
        int i =10;
        while (i<1000000){
        System.out.print(i + ", ");
        i+=10;
        }
    }
 }