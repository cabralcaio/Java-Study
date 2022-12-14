package poo;

public class Carro {
    String modelo;
    String marca;
    int ano;
    boolean ehFlex;
    int qtsPortas;
    double combustivelAtual;

    double consumo;
    boolean estaLigado;


    Carro(String modelo, String marca, int ano, boolean ehflex, int qtsPortas, double combustivelAtual, double consumo){
        this.modelo = modelo;
        this.marca = marca;
        this.ano = ano;
        this.ehFlex = ehflex;
        this.qtsPortas = qtsPortas;
        this.combustivelAtual = 30.0;
        this.consumo = consumo; //quantos km por litro
        this.estaLigado = false;
    }


    //Abastecer
    void abastecer (double total){
        this.combustivelAtual += total;
    }

    //Ligar
    void ligar(){
        this.estaLigado = true;
    }
    //Desligar
    void desligar(){
        this.estaLigado = false;
    }
    //viajar
    boolean viajar(String local, double distancia) {
        if (this.estaLigado) {
            this.ligar();

        }

        double totalLitros = distancia / this.consumo;

        if(this.combustivelAtual - totalLitros > 0){
            this.combustivelAtual -= totalLitros;
            System.out.println("A viagem para " + local + " aconteceu. Sobrou " + this.combustivelAtual + " L");
            return true;
        }else{
            System.out.println("A viagem não aconteceu, faltou gasolina");
            return false;
        }
    }


    public static void main(String[] args) {
        Carro carro1 = new Carro("XY", "Ferrari", 2019, true, 4,40, 20);
        Carro carro2 = new Carro("Z", "Ford", 2000, false, 2, 50, 20);

        System.out.println(carro1.combustivelAtual);
        carro1.abastecer(5);
        System.out.println(carro1.combustivelAtual);

        System.out.println(carro1.estaLigado);
        carro1.ligar();
        System.out.println(carro1.estaLigado);

        System.out.println(carro1.ano); // 2019
        carro1.ano = 2022;
        System.out.println(carro1.ano); // 2022

        boolean viajou = carro1.viajar("Fortaleza", 30000);
        System.out.println(viajou);
    }

}