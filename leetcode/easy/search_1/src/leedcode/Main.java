package leedcode;
public class Main {

    /*
    You're given strings J representing the types of stones that are jewels,
    and S representing the stones you have.  Each character in S is a type of stone you have.
    You want to know how many of the stones you have are also jewels.

    The letters in J are guaranteed distinct, and all characters in J and S are letters.
    Letters are case sensitive, so "a" is considered a different type of stone from "A".
    */

    public static void main(String[] args) {
        System.out.println(numJewelsInStones("aA", "aAAbbbb")); // 3
        System.out.println(numJewelsInStones("z", "ZZ")); // 0
    }

    public static int numJewelsInStones(String J, String S) {
        int count = 0;

        for (int i = 0; i< S.length(); i++) {
            if (J.indexOf(S.charAt(i)) !=  -1) count++;
        }
        
        return count;
    }
}
