package lab24.Task1;

class ConcretFactory implements ComplexAbstractFactory {
    @Override
    public Complex createComplex() {
        System.out.println("Комплексное число по умолчанию");
        return new Complex();
    }

    @Override
    public Complex createComplex(int real, int imag) {
        System.out.println("Создаю комплексное число: " +
                real + " + " + imag + "i");
        return new Complex(real, imag);
    }
}
