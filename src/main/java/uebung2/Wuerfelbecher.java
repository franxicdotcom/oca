package uebung2;

import java.util.Random;

public class Wuerfelbecher {
    private int numberOfDices;
    private int numberOfSides;
    Random rand;
    //private int[] numbers = new int [numberOfDices];

    Wuerfelbecher(int numberOfDices, int numberOfSides){
        this.rand = new Random();
        //this.numberOfSides=numberOfSides;
        setNumberOfDices(numberOfDices);
        setNumberOfSides(numberOfSides);
    }
    Wuerfelbecher(int numberOfDices){
        this(numberOfDices,6);
    }

    Wuerfelbecher(){
        this(1,6);
    }

    public int wuerfle(int numberOfSides){
        if (numberOfSides<=0) throw new AssertionError();
        this.numberOfSides=numberOfSides;
        return rand.nextInt(numberOfSides)+1;
    }

    public int[] wuerfle(int numberOfSides, int numberOfCubes){
        if (numberOfSides <= 0 || numberOfCubes <= 0) throw new RuntimeException("Nur positive Zahlen eingeben");
        //assert false;
        int[] result = new int[numberOfCubes];
        this.numberOfSides=numberOfSides;
        for (int i = 0; i < result.length; i++){
            result[i] = wuerfle(numberOfSides);
        }
        return result;
    }

    public int[] wurfAuswerten(int[] wurf){

        int [] geworfeneZahlen = new int[numberOfSides];

        for(int i =0;i<wurf.length;i++){
            geworfeneZahlen[wurf[i]-1]++;
        }

        return geworfeneZahlen;

    }

    public void auswertungAusgeben(int[] geworfeneZahlen){
        String toPrint = "";

        toPrint = "Wurfergebnis: ";
        for (int i = 0; i<geworfeneZahlen.length;i++){
            toPrint+= geworfeneZahlen[i] + " mal "+ (i+1);
            if (i!=geworfeneZahlen.length-1)toPrint+=", ";
        }

        System.out.println(toPrint);

    }

    public void setNumberOfDices(int numberOfDices) {
        this.numberOfDices = numberOfDices;
    }

    public void setNumberOfSides(int numberOfSides) {
        this.numberOfSides = numberOfSides;
    }

}
