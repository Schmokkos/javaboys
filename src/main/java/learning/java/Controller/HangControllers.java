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

    }

    public boolean harDuTapt(int feilForsøk){
        return (feilForsøk >= 10);
    }
}
