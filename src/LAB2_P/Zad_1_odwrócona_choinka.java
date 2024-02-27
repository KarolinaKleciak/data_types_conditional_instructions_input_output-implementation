package LAB2_P;

public class Zad_1_odwrócona_choinka {
    public static void main(String[] args) {

        int h = 10;
        String xStr = "*";
        String xStr2 = "";
        String spcStr = "";

        for (int i = 0; i < h; i++) {
            for (int j = 0; j < h - 1 - i; j++) {
                //System.out.println(j);
                xStr2 = xStr2 + "**";
            }
            for (int j = 0; j < i; j++) {
                spcStr = spcStr + " ";
            }
            System.out.println(spcStr + xStr + xStr2);
            xStr2 = "";
            spcStr = "";
        }
    }
}
