package learning.java;

import java.util.Scanner;

import learning.java.Classes.HangManObject;
import learning.java.Controller.HangControllers;

public class HangMan {
    private int antallFeilGjettinger = 5;

    private char[] fasitArray;
    private char[] riktigArray;
    private char[] gjettetArray;
    private HangMan(String settning){
        fasitArray = settning.toCharArray();
        riktigArray = new char[fasitArray.length];
        gjettetArray = new char[antallFeilGjettinger];
    }
    public void printCharInFasit(char bokstav){
        for (char c:fasitArray){
            if (c == bokstav)
                System.out.print(c+" ");
            else if (c == ' '){
                System.out.print("   ");
            }
            else System.out.print("_ ");
        }

    }
//    private String fasitSetning;
//    public int feilForsøk = 0;

    private static Scanner scan = new Scanner(System.in);

    public static void main(String[] args){
        System.out.print("Velkommen til HengMann 1.0. Tast inn ordet eller setningen du ønsker å gjette mot: ");
        HangMan hm = new HangMan(scan.nextLine().toUpperCase());

//        Flyttet til class HangMan
//        char[] fasitArray = hm.fasitSetning.toCharArray();
//        char[] riktigArray = new char[fasitArray.length];
//        char[] gjettetArray = new char[10];



//        System.out.println("Gjett en bokstav: ");
        char bokstav = scan.next().toUpperCase().charAt(0);
        hm.printCharInFasit(bokstav);


       // System.out.println("Hei");
    }
}
