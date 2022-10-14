package exercicios;

import java.util.Scanner;

public class mult {
    public static void main(String[] args){
        Scanner entrada = new Scanner(System.in);
        System.out.println("Insira um número: ");
        int num1 = entrada.nextInt();
        int resultado;

        for (int i = 1; i <= 10; i ++){
            resultado = i * num1;
            System.out.printf("%d x %d = %d\n", num1, i, resultado);
        }
    }
}
