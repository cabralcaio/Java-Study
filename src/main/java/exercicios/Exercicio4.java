package exercicios;

import java.util.Scanner;

public class Exercicio4 {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);

        System.out.println("Digite sua idade:");
        int idade = entrada.nextInt();

        if (idade > 17) {
            System.out.println("Maior de idade");
        } else {
            System.out.println("Menor de idade");
        }

    }

}
