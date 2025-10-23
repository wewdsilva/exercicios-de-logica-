import java.util.Scanner;

public class Ex_IF {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("Informe seu Peso: ");
        int peso = sc.nextInt();
        System.out.println("Informe sua Altura: ");
        double altura = sc.nextDouble();
        double imc = peso / (altura * altura);

        if (imc < 20) {
            System.out.println("Abaixo do Peso");
        } else if (imc < 25) {
            System.out.println("Peso Normal");
        } else if (imc < 30) {
            System.out.println("Peso Normal");
        } else if (imc < 40) {
            System.out.println("Obeso");
        } else {
            System.out.println("Obeso Mórbido");
        }

        System.out.println("O seu IMC é: " + imc);

    }
}
