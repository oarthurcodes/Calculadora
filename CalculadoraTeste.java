import javax.swing.JOptionPane;

public class CalculadoraTeste {
     public static void main(String[] args) {
        Calculadora calc = new Calculadora(8);

        double somar = calc.somar(2, 3);
        System.out.println(somar);

        double subtracao = calc.subtrair(2, 3);
        System.out.println(subtracao);

        System.out.println(calc.somarComPreferido);
        System.out.println(calc.subtrairComPreferido);
    }
}
