package learning.java.Classes;

class HangManObject {
    private int antallFeilGjettinger = 5;

    private char[] fasitArray;
    private char[] riktigArray;
    private char[] gjettetArray;
    public HangManObject(String settning){
        fasitArray = settning.toCharArray();
        riktigArray = new char[fasitArray.length];
        gjettetArray = new char[antallFeilGjettinger];
    };
}
