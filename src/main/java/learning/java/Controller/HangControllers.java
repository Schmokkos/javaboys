package learning.java.Controller;

import learning.java.HangMan;

public class HangControllers extends HangMan{

    public boolean sjekkBokstav(char[] fasitArray,char bokstav){
        for (char i:fasitArray){
            if(i==bokstav){
                return true;
            }
        }
        return false;
    }

    public boolean harDuVunnet(char[] array){
        for (char i:array){
            if (i == '\u0000'){
                return false;
            }
        }
        return true;
    }

    public boolean harDuTapt(int feilForsøk){
        return (feilForsøk >= 10);
    }
}
