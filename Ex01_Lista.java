public class Ex01_Lista {
    public static void main(String[] args) {

        // Criação e Impressão de Elementos Crie um array de inteiros com 5 posições.
        // Atribua um valor a cada posição e, em seguida, imprima o valor do elemento no
        // índice 2 e o do último elemento.

        int[] numero = new int[] { 1, 4, 10, 5, 30 };

        System.out.println("Lista de números");
        for (int i : numero) {
            System.out.println(i);
        }
        System.out.println("");
        System.out.println("Elemento do indice 2 é " + numero[2]);
        System.out.println("O ultimo elemento é: " + numero[numero.length - 1]);
    }
}