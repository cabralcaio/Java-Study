public class Exercicio3 {
    public static void main(String[] args) {
        int[] array1 = {1,22,333,4444};
        int[] array2 = {11,22,333,89};
        int count = 0;

        for (int i = 0; i <= array1.length - 1; i++){
            if (array1[i] == array2[i]){
                count ++;
            }
        }
        System.out.println("Quantidade de valores idênticos: " + count);
    }
}
