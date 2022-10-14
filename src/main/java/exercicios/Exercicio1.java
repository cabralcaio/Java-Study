package exercicios;

import java.util.Scanner;

public class Exercicio1 {
    public static void main(String[] args){
        Scanner entrada = new Scanner(System.in);
        System.out.println("Escolha uma opção \n 1 – Adição \n 2 – Subtração \n 3 – Multiplicação \n 4 – Divisão");
        String opcao = entrada.nextLine();

        System.out.println("Digite o primeiro numero");
        double n1 = entrada.nextDouble();
        System.out.println("Digite o segundo numero");
        double n2 = entrada.nextDouble();
        double resultado = 0;


        switch (opcao) {
            case "1":
                resultado = n1 + n2;
                break;
            case "2":
                resultado = n1 - n2;
                break;
            case "3":
                resultado = n1 * n2;
                break;
            case "4":
                resultado = n1 / n2;
                break;
        }

        System.out.println("O resultado é: " + resultado);
    }
}
