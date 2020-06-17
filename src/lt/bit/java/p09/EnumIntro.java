package lt.bit.java.p09;

import lt.bit.java.p09.enums.*;

public class EnumIntro {

    public static void main(String[] args) {
        System.out.println("Enum Intro");

        Color spalva = Color.GREEN;
        System.out.println("spalva=" + spalva.toString());
        System.out.println("spalva.name=" + spalva.name());
        System.out.println("spalva.ordinal=" + spalva.ordinal());

        spalva = Color.RED;
        System.out.println("spalva=" + spalva);
        System.out.println("spalva.name=" + spalva.name());
        System.out.println("spalva.ordinal=" + spalva.ordinal());

        spalva = null;
        System.out.println("spalva=" + spalva);

        String tekstas;
        tekstas = null;
        System.out.println(tekstas == null ? "null" : tekstas.toString());

        tekstas = "null";
        System.out.println(tekstas);

    }
}
