import java.util.Scanner;

public class ProvaMedia {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        double prova1 = 0.0;
        double prova2;
        double prova3;
        double prova4;
        double media;
        double notaMinima;




        System.out.println("Calcule a sua média");

        System.out.println("Digite a nota minima:");
        notaMinima = scanner.nextDouble();
        

        System.out.println("Digite a nota da AC1:");
        prova1 = scanner.nextDouble();

        System.out.println("Digite a nota da AC2:");
        prova2 = scanner.nextDouble();

        System.out.println("Digite a nota da AG:");
        prova3 = scanner.nextDouble();

        System.out.println("Digite a nota da AF:");
        prova4 = scanner.nextDouble(); 

        
        
        media = prova1 * 0.15 + prova2 * 0.30 + prova3 * 0.10 + prova4 * 0.45;

        System.out.println("Sua média é: " + media);

        if (notaMinima <= media) {
            System.out.println("Aprovado!");
            System.out.println("AC1: " + prova1);
            System.out.println("AC2: " + prova2);
            System.out.println("AG: " + prova3);
            System.out.println("AF: " + prova4);
        } else {
            System.out.println("Reprovado!");
        }
    }
}
