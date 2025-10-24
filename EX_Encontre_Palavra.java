import java.util.Scanner;

public class EX_Encontre_Palavra {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Desenvolva um programa que permita ao usuário verificar se uma palavra específica está contida em uma frase.
        //o final, imprima uma mensagem clara informando se a palavra foi encontrada na frase ("A palavra '...' foi encontrada na frase.") ou não ("A palavra '...' NÃO foi encontrada na frase.").

        // Entrada da Frase
        System.out.println("Informe a Frase: ");
        String frase = sc.nextLine();

        // Entrada da Palavra
        System.out.println("Informe a Palavra: ");
        String palavraBusca = sc.nextLine();

        // Verificação (ignorando diferenças de maiúsculas/minúsculas)
        // if (frase.toUpperCase().contains(palavra.toUpperCase())){
        // System.out.println("A palavra " + palavra + " Foi encontrada ");

        // }else{
        // System.out.println("Palavra não encontrda!! ");
        // }
        for (String palavra : args) {
            
        }
        if (frase.toLowerCase().contains(palavra.toLowerCase())) {
            System.out.println("A palavra '" + palavra + "' foi encontrada.");
        } else {
            System.out.println("A palavra '" + palavra + "' NãO foi encontrada!");
        }
        System.out.println("teste");
        System.out.println("teste");
    }
}
