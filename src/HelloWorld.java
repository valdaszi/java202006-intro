import java.util.Date;
import java.util.Random;

public class HelloWorld {

    public static void main(String[] args) {

        byte b = 0b01001111;
        short s = 0b0111_1001_0001_1000;
        int i = 0xaf | 2 & 0b111;
        long l = s;

        char c = 'A';     // 16bit - arba 2byte

        c = 'Ž';
        char c2 = '\u2655';
        char c3 = '\'';
        char c4 = '\\';

        char c5 = (char) (c4 + 1);

        //  10000: "123.Afrika......104"
        //  text <- 10000
        //
        String text = 5 + 123.45 + " Afrika '" + c2 + "' \n ir \t Europa\\Azija  \"Microsoft\" " +
                (100 + 4); // ... 104
        System.out.println(text);
        System.out.println("123" + 4);

        // ...
        // textNieko <- 0
        String textNieko = null;
        Date data = null;


        /*

            bitas - 0 arba 1

            0 - 0
            1 - 1
            2 - 10
            3 - 11
            4 - 100
            5 - 101
            6 - 110
            7 - 111
            8 - 1000
            9 - 1001
           10 - 1010
           15 - 1111
           16 - 10000
           ...

           0011 +
           0001
           ----
           0100

           Sesioliktaine sistema
           0, 1, 2, 3, 4, 5, 6, 7, 8, 9, a, b, c, d, e, f

           0..9 = 0..9
           10   = a
           11   = b
           15   = f
           16   = 10
           31   = 1f = 0001 1111
                  a6 = 1010 0110

         */

        float f = 0.0f;
        double d = 123.4;

        System.out.println(d/f);

        boolean boo = true;
        boolean boo2 = !(2 > 3);
        boolean boo3 = boo || (boo2 && 10 < 9);


        System.out.println(boo2);
        System.out.println(boo3);

        System.out.println("Hello World");
        System.out.println("Labutis");
        System.out.println(123);


        //
        // Priskirimai
        //

        //
        // i1 -> 0x2000 -> 100
        // i2 -> 0x2008 -> 100
        //
        int i1 = 100;
        int i2 = i1;
        i1 = 200;
        System.out.println(i2);


        //
        //  RAM:  0x1ADD -> [10, 20, 30]
        //  i3 -> 0x2000 -> 0x1ADD
        //  i4 -> 0x2004 -> 0x1ADD
        //
        int[] i3 = {10, 20, 30}; // new int[] {10, 20, 30};
        int[] i4 = i3;
        i3[0] = 9;

        for (int index = 0; index < i4.length; index++) {
            System.out.print(i4[index] + " ");
        }
        System.out.println();

        // 0 1 2
        int[] i5 = new int[3];
        i5[2] = 99;
        for (int index = 0; index < i5.length; index++) {
            System.out.print(i5[index] + " ");
        }
        System.out.println();


        //1  abc
        //2  abc1
        //3  1abc
        //4  $abc
        //5  a_b
        //6  a-b
        //7  _ab
        //8  ežys

        int[][] m1 = {
                {10, 11, 12}, // m1[0]
                {22, 23, 24}, // m1[1]
                {30, 31}      // m1[2]
        };
        System.out.println("m1 masyvo ilgis yra: " + m1.length);
        for (int eilutesIndex = 0; eilutesIndex < m1.length; ++eilutesIndex ) {
            // atspausdinti eilute
            int[] eilute = m1[eilutesIndex];
            for (int stulpelioIndex = 0; stulpelioIndex < eilute.length; stulpelioIndex++ ) {
                System.out.print(eilute[stulpelioIndex] + " ");
            }
            System.out.println();
        }


        int[] m2 = m1[1];
        int m23 = m2[2];    // 24
        m23 = m1[1][2];     // 24

        int[][] m3 = new int[3][];
        m3[0] = new int[3];
        m3[1] = new int[3];
        m3[2] = new int[2];

        m3[2][1] = 31;

        // foreach ciklas:
        for (int[] eilute : m1) {
            for (int elem : eilute) {
                System.out.print(elem + " ");
            }
            System.out.println();
        }

        // ++x   --y
        // x++   y--

        int a1 = 10;
        //       1 + 11 (a1=11) + 11 (a1=12)
        int a2 = 1 + ++a1       + a1++;
        System.out.println("a1=" + a1 + " a2=" + a2);

        System.out.println("while:");
        int ind = 3;
        while (--ind > 0) { // 2 > 0, 1 > 0, 0 ? 0
            System.out.println(Math.random());
        }

        System.out.println("do while");
        ind = 3;
        do {
            System.out.println(Math.random());
        } while (ind-- > 0);
    }

}

/*

1   -> 1
2   -> 2
3   -> 4
4   -> 8
5   -> 16
...
n   -> 2^(n-1)

----------------------------
1   -> 1 = 2^1 - 1
2   -> 1 + 2 = 3 = 2^2 - 1
3   -> 3 + 4 = 7 = 2^3 - 1
4   -> 7 + 8 = 15 = 2^4 - 1
...
n   -> 2^n - 1

 */
