package lt.bit.java.p13;

public class Triangle extends Figure {

    private double a, b, c;

    public Triangle(String name, double a, double b, double c) {
        setName(name);
        this.a = a;
        this.b = b;
        this.c = c;
    }

    // geteriai ir seteriai

    public double getA() {
        return a;
    }

    public void setA(double a) {
        this.a = a;
    }

    public double getB() {
        return b;
    }

    public void setB(double b) {
        this.b = b;
    }

    public double getC() {
        return c;
    }

    public void setC(double c) {
        this.c = c;
    }

    @Override
    public double area() {
        double s = (a + b +c) / 2;
        return Math.sqrt(s * (s - a) * (s - b) * (s - c));
    }
}
