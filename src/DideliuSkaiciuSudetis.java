public class DideliuSkaiciuSudetis {

    public static void main(String[] args) {

        byte[] didelisSkaicius1 = new byte[10];
        byte[] didelisSkaicius2 = new byte[10];

        // 7893
        didelisSkaicius1[0] = 3;
        didelisSkaicius1[1] = 9;
        didelisSkaicius1[2] = 8;
        didelisSkaicius1[3] = 7;

        // 1236
        didelisSkaicius2[0] = 6;
        didelisSkaicius2[1] = 3;
        didelisSkaicius2[2] = 2;
        didelisSkaicius2[3] = 1;

        spausdinti(didelisSkaicius1);
        System.out.print(" + ");
        spausdinti(didelisSkaicius2);

        byte[] rezultatas = suma(didelisSkaicius1, didelisSkaicius2);
        System.out.print(" = ");
        spausdinti(rezultatas);

        System.out.println();
        System.out.println("--------------");

        spausdinti(didelisSkaicius1);
        System.out.print(" * 4 = ");
        byte[] rezultatas2 = daugyba(didelisSkaicius1, 4);
        spausdinti(rezultatas2);

    }


    // 0007893
    // 0001236
    // -------
    //   ...29
    static byte[] suma(byte[] p1, byte[] p2) {
        byte[] resultatas = new byte[p1.length];

        int mintyje = 0;
        for (int i = 0; i < p1.length; i++) {
            int x = p1[i] + p2[i] + mintyje;
            if (x <= 9) {
                resultatas[i] = (byte) x;
                mintyje = 0;
            } else {
                // 17 -> 7,1   16 -> 6,1  21 -> 1,2
                resultatas[i] = (byte) (x % 10);
                mintyje = x / 10;
            }
        }

        return resultatas;
    }

    static byte[] daugyba(byte[] p, int k) {
        byte[] resultatas = new byte[p.length];

        int mintyje = 0;
        for (int i = 0; i < p.length; i++) {
            int x = p[i] * k + mintyje;
            if (x <= 9) {
                resultatas[i] = (byte) x;
                mintyje = 0;
            } else {
                // 17 -> 7,1   16 -> 6,1  21 -> 1,2
                resultatas[i] = (byte) (x % 10);
                mintyje = x / 10;
            }
        }

        return resultatas;
    }


    static void spausdinti(byte[] skaicius) {
        for (int i = skaicius.length - 1; i >= 0; i--) {
            System.out.print(skaicius[i]);
        }
    }

}
