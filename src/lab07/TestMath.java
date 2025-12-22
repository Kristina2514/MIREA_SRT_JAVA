package lab07;

public class TestMath {
    public static void main(String[] args) {
        MathFunc calc = new MathFunc();
        double pow_calc = calc.pow(2, 8);
        double mod_calc = calc.modCompl(5, 2);

        System.out.println("Степень: " + pow_calc);
        System.out.println("Модуль комплексного числа: " + mod_calc);

        MathFunc func = calc;
        double r = 4;
        double len = func.circle(r);

        System.out.println("Длина окружности: " + len);
    }
}
