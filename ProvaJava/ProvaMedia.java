import java.util.Scanner;

public class ProvaMedia {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Calcule a sua média");

        System.out.println("Digite a nota da AC1:");
        double prova1 = scanner.nextDouble() * 0.15;

        System.out.println("Digite a nota da AC2:");
        double prova2 = scanner.nextDouble() * 0.30;

        System.out.println("Digite a nota da AC3:");
        double prova3 = scanner.nextDouble() * 0.10;

        System.out.println("Digite a nota da AF:");
        double prova4 = scanner.nextDouble() * 0.45; 
        
        double media = prova1 + prova2 + prova3 + prova4;

        System.out.println("Sua média é: " + media);

        if (media >= 6) {
            System.out.println("Aprovado!");
            System.out.println("AC1: " + prova1);
            System.out.println("AC2: " + prova2);
            System.out.println("AC3: " + prova3);
            System.out.println("AF: " + prova4);
        } else {
            System.out.println("Reprovado!");
        }
    }
}
