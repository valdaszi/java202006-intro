package lt.bit.java.p09.mokiniai;

import java.util.*;

public class Main {

    static int mokiniuSkaicius = 50000;
    static Mokinys[] mokiniai = new Mokinys[mokiniuSkaicius];
    static Random random = new Random();

    public static void main(String[] args) {
        //ivestiPradiniusDuomenis();
        sugeneruotiMokinius();
//        print("Pradiniai duomenys:");
//
//        pagalKlase();
//        print("Sulygiuota pagal klase:");
//
//        pagalVarda();
//        print("Lygiuot pagal varda:");

        Mokinys[] kopija = new Mokinys[mokiniai.length];
        for (int i = 0; i < mokiniai.length; i++) {
            kopija[i] = mokiniai[i];
        }

        pagalKlasePavardeVarda();
        System.out.println("Musu ciklu skaicius: " + musuMetodas);
//        print("Lygiuot pagal klase, pavarde ir varda");


        for (int i = 0; i < mokiniai.length; i++) {
            mokiniai[i] = kopija[i];
        }

        pagalKlasePavardeVardaStd();
        System.out.println("Std ciklu skaicius: " + stdMetoddas);
//        print("Lygiuot pagal varda, pavarde ir klase");


//        System.out.println("\nDemo spausdinimas: " + Arrays.toString(mokiniai));
    }


    static void ivestiPradiniusDuomenis() {
        Mokinys mokinys1 = new Mokinys();
        mokinys1.setKlase(1);
        mokinys1.setPavarde("Jonas Petras II");
        mokinys1.setTrimestras(new int[] {7, 8, 5, 6});
        mokiniai[0] = mokinys1;

        Mokinys mokinys2 = new Mokinys();
        mokinys2.setKlase(2);
        mokinys2.setVardas("Ona III");
        mokinys2.setTrimestras(new int[] {5, 7, 9, 10});
        mokiniai[1] = mokinys2;

        mokiniai[2] = new Mokinys("Petras", "Jonaitis", 1, new int[] {5, 7, 9, 10, 7});

        Mokinys mokinys4 = new Mokinys();
        mokinys4.setKlase(1);
        mokinys4.setVardas("Jurga");
        mokinys4.setPavarde("Jurgaite");
        mokinys4.setTrimestras(new int[] {5, 7, 9, 10, 5});
        mokiniai[3] = mokinys4;

        Mokinys mokinys5 = new Mokinys();
        mokinys5.setKlase(2);
        mokinys5.setVardas("Antanas");
        mokinys5.setPavarde("Antanaitis");
        mokinys5.setTrimestras(new int[] {5, 7, 9, 10, 4});
        mokiniai[4] = mokinys5;
    }

    static void sugeneruotiMokinius() {
        for (int i = 0; i < mokiniai.length; i++) {
            mokiniai[i] = sugeneruotasMokinys();
        }
    }

    static Mokinys sugeneruotasMokinys() {
        Mokinys mokinys = new Mokinys();

        mokinys.setKlase(random.nextInt(12) + 1);
        int[] trimestras = new int[10];
        for (int i = 0; i < trimestras.length; i++) {
            trimestras[i] = random.nextInt(7) + 4;
        }
        mokinys.setTrimestras(trimestras);
        mokinys.setVardas(generuotiTeksta());
        mokinys.setPavarde(generuotiTeksta());

        return mokinys;
    }

    static String generuotiTeksta() {
        int ilgis = random.nextInt(6) + 5;
        char pirmaRaide = (char) ('A' + random.nextInt(26));
        String tekstas = "" + pirmaRaide;
        for (int i = 1; i < ilgis; i++) {
            tekstas += (char) ('a' + random.nextInt(26));
        }
        return tekstas;
    }

    static void print(int indeksas) {
        System.out.println(mokiniai[indeksas].getKlase() + " " +
                mokiniai[indeksas].pilnasVardas());
    }

    static void print(String title) {
        System.out.println();
        System.out.println(title);
        for (int i = 0; i < mokiniai.length; i++) {
            print(i);
        }
    }



    /*

     indeksas: 0  1  2 3 4 5
     korta:    4  8  5 7 1 2
     0:        1* 8  5 7 4 2
     1:        1  2* 8 7 5 4


     0. Turime is kortu nuo 0 iki 5 isrinkti maziausia ir padeti ja i 0 (!) pozicija
     1. Turime is kortu nuo 1 iki 5 isrinkti maziausia ir padeti ja i 1 pozicija
     ...
     n. Turime is kortu nuo n iki 5 isrinkti maziausia ir padeti ja i n pozicija

     */


    static void sukeiciamMokinius(int i, int j) {
        Mokinys mokinys = mokiniai[i];
        mokiniai[i] = mokiniai[j];
        mokiniai[j] = mokinys;
    }

    static void pagalKlase() {
        for (int zingsnis = 0; zingsnis < mokiniai.length - 1; zingsnis++) {

            for (int i = zingsnis; i < mokiniai.length; i++) {

                if (mokiniai[i].getKlase() < mokiniai[zingsnis].getKlase()) {
                    // mokiniai[i] <-> mokiniai[zingsnis]
                    sukeiciamMokinius(i, zingsnis);
                }
            }
        }
    }

    static void pagalVarda() {
        for (int zingsnis = 0; zingsnis < mokiniai.length - 1; zingsnis++) {

            for (int i = zingsnis; i < mokiniai.length; i++) {

                if (mokiniai[i].getVardas().compareTo(mokiniai[zingsnis].getVardas()) < 0) {
                    // mokiniai[i] <-> mokiniai[zingsnis]
                    sukeiciamMokinius(i, zingsnis);
                }
            }
        }
    }

    static int musuMetodas;

    static void pagalKlasePavardeVarda() {
        for (int zingsnis = 0; zingsnis < mokiniai.length - 1; zingsnis++) {

            for (int i = zingsnis; i < mokiniai.length; i++) {

                musuMetodas++;

                if (mokiniai[i].getKlase() < mokiniai[zingsnis].getKlase()) {
                    sukeiciamMokinius(i, zingsnis);

                } else if (mokiniai[i].getKlase() == mokiniai[zingsnis].getKlase()) {
                    if (mokiniai[i].getPavarde().compareTo(mokiniai[zingsnis].getPavarde()) < 0) {
                        sukeiciamMokinius(i, zingsnis);

                    } else if (mokiniai[i].getPavarde().compareTo(mokiniai[zingsnis].getPavarde()) == 0) {
                        if (mokiniai[i].getVardas().compareTo(mokiniai[zingsnis].getVardas()) < 0) {
                            sukeiciamMokinius(i, zingsnis);
                        }
                    }
                }
            }
        }
    }

    static int stdMetoddas = 0;

    static void pagalKlasePavardeVardaStd() {
        Arrays.sort(mokiniai, (m1, m2) -> {
            stdMetoddas++;

            int pagalKlase = Integer.compare(m1.getKlase(), m2.getKlase());
            if (pagalKlase != 0) return pagalKlase;

            int pagalPavarde = m1.getPavarde().compareTo(m2.getPavarde());
            if (pagalPavarde != 0) return pagalPavarde;

            return m1.getVardas().compareTo(m2.getVardas());
        });
    }
}
