public class CalculadoraTeste {
    public static void main(String[] args) {
        Calculadora calc = new Calculadora();

        double somar = calc.somar(2, 3);
        System.out.println(somar);

        double subtracao = calc.subtrair(2, 3);
        System.out.println(subtracao);
    }
}
