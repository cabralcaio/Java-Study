package exercicios;

public class EmpregadoTeste {
    public static void main(String[] args) {
        Empregado empregado = new Empregado("Caio", "Cabral", 6000);

        System.out.println(empregado.salarioAnual());
        System.out.println(empregado.aumentarSalario(350));
        System.out.println(empregado.nomeCompleto());
    }
}