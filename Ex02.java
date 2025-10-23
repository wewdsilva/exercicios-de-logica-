import java.util.Scanner;

public class Ex02 {
    public static void main(String[] args) {
        

        //Entrada
        Scanner sc = new Scanner(System.in);
        System.out.println("Infoma a Primeira nota: ");
        double nota1 = sc.nextDouble();
        System.out.println("Infoma a Segunda nota: ");
        double nota2 = sc.nextDouble();

        //Processamento
        double media = (nota1+nota2)/2;

        //Saída
        System.out.println("Sua média foi: " + media);


    }
}
