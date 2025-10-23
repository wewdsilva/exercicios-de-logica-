import java.util.Scanner;

public class Ex_String {
    public static void main(String[] args) {

        // Operação Frase: Faça um programa que receba uma frase qualquer informada
        // via teclado e escreva no vídeo o que se segue:
        // A. Os primeiros 5(cinco) caracteres da frase;
        // B. Os últimos 5(cinco) caracteres da frase;
        // C. A quantidade de caracteres contidos na frase;
        Scanner sc = new Scanner(System.in);

        // Entrada
        System.out.println("Inform sua frase: ");
        String frase = sc.nextLine();

        // Processamento A - primeiros 5 caracteres
        String primeiros5;
        if (frase.length() >= 5) {
            primeiros5 = frase.substring(0, 5);

        } else {
            primeiros5 = frase; // mostra tudo
        }
        // B - últimos 5 caracteres
        String ultimos5;
        if (frase.length() >= 5) {
            ultimos5 = frase.substring(frase.length() - 5);

        } else {
            ultimos5 = frase; // mostra tudo

        }
        // C - quantidade de caracteres
        int quantidade = frase.length();

        // Saída
        System.out.println(primeiros5);
        System.out.println(ultimos5);
        System.out.println(quantidade);

    }
}
