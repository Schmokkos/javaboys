package learning.java;

import java.util.Scanner;

public class HangMan {

    private String fasitSetning;
    private int feilForsøk = 0;

    private static Scanner scan = new Scanner(System.in);

    public static void main(String[] args){
        HangMan hm = new HangMan();
        System.out.print("Velkommen til HengMann 1.0. Tast inn ordet eller setningen du ønsker å gjette mot: ");
        hm.fasitSetning = scan.nextLine().toUpperCase();
        char[] fasitArray = hm.fasitSetning.toCharArray();
        char[] riktigArray = new char[fasitArray.length];
        char[] gjettetArray = new char[10];



//        System.out.println("Gjett en bokstav: ");
//        char bokstav = scan.next().toUpperCase().charAt(0);
//
//        for (char c:fasitArray){
//            if (c == bokstav)
//                System.out.print(c+" ");
//            else if (c == ' '){
//                System.out.print("   ");
//            }
//            else System.out.print("_ ");
//        }

       // System.out.println("Hei");
    }
}
