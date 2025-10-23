import java.util.Scanner;

public class Ex01 {
    public static void main(String[] args) {
        
        //Entrada
        Scanner sc = new Scanner(System.in);
        System.out.println("informe o primeiro númeo: ");
        double n1 = sc.nextDouble();
        System.out.println("Informe o segundo número: ");
        double n2 = sc.nextDouble();

        //Processamento
        double soma = n1+n2;
        double sub = n1-n2;
        double div = n1/n2;
        double mult = n1*n2;

        //Saída
        System.out.println("A Soms é: " + soma);
        System.out.println("A Subtração é: " + sub);
        System.out.println("A Divisão  é: " + div);
        System.out.println("A Multplicação  é: " + mult);

        System.out.println("kkkkkk");

    }
}
