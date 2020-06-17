package lt.bit.java.p09.namai;

public class Namai {

    /*
        Lemputes savybes:
        1. Lemputes vieta
        2. Lemputes pavadinimas
        3. Lemputes busena - ijungta/isjungta

     */


    static int lempuciuSkaicius = 2;
//    static String[] vietos = new String[lempuciuSkaicius];
//    static String[] pavadinimai = new String[lempuciuSkaicius];
//    static Status[] busenos = new Status[lempuciuSkaicius];
    static Lempute[] lemputes = new Lempute[lempuciuSkaicius];

    public static void main(String[] args) {

//        vietos[0] = "Svetaine";
//        pavadinimai[0] = "Prie teliko";
//        busenos[0] = Status.OFF;
        Lempute lempute1 = new Lempute();
        lempute1.vieta = "Svetaine";
        lempute1.pavadinimas = "Prie teliko";
        lempute1.busena = Status.OFF;
        lemputes[0] = lempute1;

//        vietos[1] = "Virtuve";
//        pavadinimai[1] = "Po spintele";
//        busenos[1] = Status.UNKNOWN;
        Lempute lempute2 = new Lempute();
        lempute2.vieta = "Virtuve";
        lempute2.pavadinimas = "Po spintele";
        lempute2.busena = Status.UNKNOWN;
        lemputes[1] = lempute2;

        print(0);
        print(1);

        ijungti(0);
        print(0);

        isjungti(0);
        print(0);
    }

    static void print(int indeksas) {
//        System.out.println(vietos[indeksas] + " " +
//                pavadinimai[indeksas] + " " +
//                busenos[indeksas]);
        System.out.println(lemputes[indeksas].vieta + " " +
                lemputes[indeksas].pavadinimas + " " +
                lemputes[indeksas].busena);
    }


    static void ijungti(int indeksas) {
        // busenos[indeksas] = Status.ON;
        lemputes[indeksas].busena = Status.ON;
    }

    static void isjungti(int indeksas) {
        // busenos[indeksas] = Status.OFF;
        lemputes[indeksas].busena = Status.OFF;
    }

}
