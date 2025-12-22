package lab24.Task1;

public class Complex {
    private int real;
    private int imag;

    public Complex(int real, int imag) {
        this.real = real;
        this.imag = imag;
    }

    public Complex() {
        this(0, 0);
    }

    public int getReal() {
        return real;
    }

    public void setReal(int real) {
        this.real = real;
    }

    public int getImag() {
        return imag;
    }

    public void setImag(int imag) {
        this.imag = imag;
    }

    public Complex add(Complex other) {
        return new Complex(
                this.real + other.real,
                this.imag + other.imag
        );
    }

    public Complex subtract(Complex other) {
        return new Complex(
                this.real - other.real,
                this.imag - other.imag
        );
    }

    @Override
    public String toString() {
        if (imag >= 0) {
            return real + " + " + imag + "i";
        } else {
            return real + " - " + (-imag) + "i";
        }
    }
}
