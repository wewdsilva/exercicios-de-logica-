import java.util.Scanner;
import java.util.concurrent.SubmissionPublisher;

public class Ex_String03 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String frase;
        String maiorFrase = "";
        int maiorTamanho =0;
        
        // Elabore um programa que receba 10 frases via teclado e ao final exiba a maior
        // frase digitada.
        
        //Entrada

        for(int i = 1; i<=2; i++){
            System.out.println("Informe a frase: ");
            frase = sc.nextLine();

            if(frase.length()>maiorTamanho){
               maiorTamanho = frase.length();
                maiorFrase = frase;
        }
    }
    System.out.println("\nA maior frase digitada foi:");
    System.out.println(maiorFrase);
    System.out.println("A quantidade de caracteres: é " + maiorTamanho);
        


    }
}
