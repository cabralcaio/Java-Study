package exercicios;

public class CirculoTeste {
    public static void main(String[] args) {
        Circulo circulo1 = new Circulo(5);
        System.out.println(circulo1.calcularArea());
        System.out.println(circulo1.calcularCircunferencia());

        Circulo circulo2 = new Circulo();
        System.out.println(circulo2.calcularArea());
        System.out.println(circulo2.calcularCircunferencia());

        circulo1.mudarRaio(2);
        System.out.println(circulo1.getRaio());
    }
}