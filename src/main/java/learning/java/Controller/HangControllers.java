package learning.java.Controller;

import learning.java.HangMan;

public class HangControllers extends HangMan{

    public boolean sjekkBokstav(char[] fasitArray,char bokstav){
        for (int i = 0;i<fasitArray.length;i++){
            if(fasitArray[i]==bokstav){
                return true;
            }
        }
        return false;
    }

    public boolean harDuVunnet(){

    }

    public boolean harDuTapt(int feilForsøk){
        if (feilForsøk >= 10){
            return true;
        }
        else {
            return false
        }
    }
}
