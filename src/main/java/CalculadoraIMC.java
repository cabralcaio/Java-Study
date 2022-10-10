import java.util.Scanner;

public class CalculadoraIMC {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in); // cria uma forma de prompt para entrada de dados
        System.out.println("Qual seu nome?");
        String nome = entrada.nextLine(); // chama a variavel que abre espaço para entrada de dados

        System.out.println("Qual a sua idade?");
        int idade = entrada.nextInt();

        System.out.println("Qual sua altura em metros?");
        double altura = entrada.nextDouble();

        System.out.println("Olá" + nome + ", sua idade é " + idade + " e sua altura é " + altura);
    }
}
