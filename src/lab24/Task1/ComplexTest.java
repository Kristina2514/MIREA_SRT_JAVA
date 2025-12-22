package lab24.Task1;

public class ComplexTest {
    public static void main(String[] args) {
        ComplexAbstractFactory factory = new ConcretFactory();
        Complex c1 = factory.createComplex();
        System.out.println(c1);

        Complex c2 = factory.createComplex(5, -3);
        System.out.println(c2);

        Complex c3 = factory.createComplex(2, 1);
        Complex c4 = factory.createComplex(3, 4);
        Complex sum = c3.add(c4);
        System.out.println(sum);
    }
}
