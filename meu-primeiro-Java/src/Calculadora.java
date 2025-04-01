import java.util.Scanner;

public class Calculadora {
    public static void main(String[] args) {
        try (Scanner scanner = new Scanner(System.in)) {

            System.out.print("Digite o primeiro número: ");
            double num1 = scanner.nextDouble();

            System.out.print("Digite o operador (+, -, *, /): ");
            char operador = scanner.next().trim().charAt(0);

            System.out.print("Digite o segundo número: ");
            double num2 = scanner.nextDouble();

            // Switch expression moderno (Java 14+)
            double resultado = switch (operador) {
                case '+' -> num1 + num2;
                case '-' -> num1 - num2;
                case '*' -> num1 * num2;
                case '/' -> num1 / num2;
                default -> {
                    System.out.println("Operador inválido!");
                    yield 0.0;
                }
            };

            System.out.println("Resultado: " + resultado);
        }
    }
}
