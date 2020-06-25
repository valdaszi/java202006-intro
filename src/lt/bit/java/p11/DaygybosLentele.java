package lt.bit.java.p11;

import java.io.*;

public class DaygybosLentele {

    static void blokas(int nuo) {
        for (int i = 2; i <= 10; i++) {
            for (int j = nuo; j < nuo + 3; j++) {
                if (nuo == 1 && j == 1) {
                    System.out.print("             ");
                } else {
                    System.out.print(j + " x " + i + " = " + (i * j) + "    ");
                }
            }
            System.out.println();
        }
        System.out.println();
    }

    public static void main(String[] args) throws UnsupportedEncodingException {
        blokas(1);
        blokas(4);
        blokas(7);
    }
}
