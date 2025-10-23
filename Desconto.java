import java.util.Scanner;

import javax.swing.plaf.synth.SynthScrollBarUI;

public class Desconto {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Informe o Código Bairro (S/I/T): ");
        String bairro = sc.nextLine();
        System.out.println("Informe sua Renda: ");
        double renda = sc.nextDouble();
        System.out.println("Informe o valor de Consumo: ");
        double valorConsumo = sc.nextDouble();
        double desconto = 0;

        if (bairro.equalsIgnoreCase("s")) {
            if (renda >= 50 && renda <= 500) {
                desconto = 50;
            } else if (renda > 500 && renda <= 1000) {
                desconto = 25;
            }

        } else if (bairro.equalsIgnoreCase("I")) {
            if (renda >= 240 && renda <= 1000) {
                desconto = 240;
            } else if (renda > 1000 && renda <= 5000) {
                desconto = 120;
            }
        } else if (bairro.equalsIgnoreCase("T")) {
            if (renda > 5000 && renda <= 10000) {
                desconto = 720;
            } else if (renda > 10000 && renda <= 20000) {
                desconto = 360;
            }
        } else {
            System.out.println("Código do bairro invalido");
        }

        double valor_com_desconto = valorConsumo - desconto;
        System.out.println("Valor com desconto: " + valor_com_desconto);

    }

}
