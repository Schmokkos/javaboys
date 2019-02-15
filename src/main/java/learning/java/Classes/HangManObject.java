package learning.java.Classes;

public class HangManObject {
    private int antallFeilGjettinger = 5;

    private char[] fasitArray;
    private char[] riktigArray;
    private char[] gjettetArray;
    public HangManObject(String settning){
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
}
