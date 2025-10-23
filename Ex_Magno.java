import java.util.Scanner;

public class Ex_Magno {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
 
        System.out.print("Informe o número: ");
        int numero = input.nextInt();
 
        if (numero % 3 == 0 && numero % 7 == 0) {
            System.out.println("O número " + numero + " é múltiplo de 3 e de 7.");
        } else {
            System.out.println("O número " + numero + " NÃO é múltiplo de 3 e de 7.");
        }
 
        input.close();
    }
}
    

