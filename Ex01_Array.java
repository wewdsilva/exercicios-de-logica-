import java.util.Arrays;

import javax.sql.rowset.spi.SyncResolver;

public class Ex01_Array {
    public static void main(String[] args) {

        // Criação e Impressão de Elementos Crie um array de inteiros com 5 posições.
        // Atribua um valor a cada posição e, em seguida, imprima o valor do elemento no
        // índice 2 e o do último elemento.
        
        int[] idades = new int[] { 20, 25, 22, 28, 30 };

        System.out.println(idades[2]);
        System.out.println(idades[4]);
        System.out.println(idades[2] + " e " + idades[4]);

    }
}
