package lab07;

public class MathFunc implements MathCalculable {
    public double pow(double base, double expon) {
        return Math.pow(base, expon);
    }

    public double modCompl(double real, double im) {
        return Math.sqrt(real*real + im*im);
    }

    public double circle(double r) {
        return 2*PI*r;
    }
}
