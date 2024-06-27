/*
 * Lets do the last exercise of the loop section.
 * We're going to do fibonacci sequence
 */

 public class N_fibonacci_sequence{
    public static void main(String[] args) {
     
        System.out.println("**********************");
        System.out.println("Fibonacci sequence");
        System.out.println("**********************");

        int i=0;
        int a=0;
        int b=1;
        int c=0;

        System.out.println("Fibonacci's first 15 numbers with FOR");

        for(i=0; i<15; i++){
            if (i<14){
                System.out.print(a +", ");
                c=a+b;
                a=b;
                b=c;
            }else{
                System.out.print(a);
            }
        }
        System.out.println(" ");
        System.out.println("Fibonacci's first 15 numbers with WHILE");

        i=0;
        a=0;
        b=1;
        c=0;

        while(i<14){
            if (i<14){
                System.out.print(a +", ");
                c=a+b;
                a=b;
                b=c;
            }else{
                System.out.print(a);
            }i++;
        }
        System.out.println(" ");
        System.out.println("Fibonacci's first 15 numbers with DO-WHILE");

        i=0;
        a=0;
        b=1;
        c=0;

        do { 
            if (i<14){
                System.out.print(a +", ");
                i++;
                c=a+b;
                a=b;
                b=c;
            }else{
                System.out.print(a);
            }
        } while (i<14);

    }
 }