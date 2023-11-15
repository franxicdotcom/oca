package uebung2;

public class WuerfelbecherTest {
    public static void main(String[] args) {
        Wuerfelbecher wb = new Wuerfelbecher();
        int einzelwurf = wb.wuerfle(6);
        System.out.println(einzelwurf);

        int [] mehrereWuerfel = wb.wuerfle(3,10);
       //wb.wurfAuswerten(mehrerewuerfel);
        wb.auswertungAusgeben(wb.wurfAuswerten(mehrereWuerfel));

        int einWuerfel = wb.wuerfle(6);
        System.out.println("Sie haben eine " + einWuerfel+" gewuerfelt!");
    }
}
