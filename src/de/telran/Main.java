package de.telran;

public class Main {

    public static void main(String[] args) {
        System.out.println("Divided to Three " + dividedThree(9));
        System.out.println("Divided to Five or to Seven " +dividedFiveOrSeven(35));
        System.out.println("Divided to Five or to Seven " +dividedFiveOrSeven(20));
        System.out.println("Divided to Five or to Seven " +dividedFiveOrSeven(21));
        System.out.println("Integer Between and inclusiv is even is " + integerBetween(1020));
        System.out.println("Integer Between and inclusiv is even is " + integerBetween(100));
    }

    static boolean dividedThree(int x) {
        return x % 3 == 0 & x > 0;
    }

    static boolean dividedFiveOrSeven(int x) {
        return x % 5==0 | x % 7 == 0;
    }

    static boolean integerBetween(int x) {
        return x >= 100 & x % 2 <= 200;
    }

   /* static boolean bank(int x) {
        boolean masha = 490 ;
        boolean plan = 1150 ;
        boolean petea = masha *0.8;
        boolean vasea = masha/2;
        boolean total =vasea+masha+petea<1150*0.8==1150|petea+masha
        return x
    }*/
}
