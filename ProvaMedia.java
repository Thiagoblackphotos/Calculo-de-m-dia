//Thiago Andrade Nascimento - 252434
//Andre Amelini de Faria - 252207
//Arthur Marcolino da Silva - 252369


import java.util.Scanner;

public class ProvaMedia {

    

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int quantidadeDeAluno;
        double[] peso = new double[4];
        double notaMinima;
        double soma = 0;
        double aprovados = 0;
        double reprovados = 0;
        double aprovadosComExcelencia = 0;

        // Leitura e validação dos pesos
        do {
            System.out.println("Digite o peso da AC1 (ex: 0,25):");
            peso[0] = scanner.nextDouble();

            System.out.println("Digite o peso da AC2 (ex: 0,25):");
            peso[1] = scanner.nextDouble();

            System.out.println("Digite o peso da AG (ex: 0,25):");
            peso[2] = scanner.nextDouble();

            System.out.println("Digite o peso da AF (ex: 0,25):");
            peso[3] = scanner.nextDouble();

            soma = peso[0] + peso[1] + peso[2] + peso[3];

            if (soma != 1.0) {
                System.out.println("Erro: a soma dos pesos deve ser exatamente 1.0. Tente novamente.\n");
            }

        } while (soma != 1.0);

        // Leitura e validação da quantidade de alunos
        do {
            System.out.println("Quantos alunos deseja calcular?:");
            quantidadeDeAluno = scanner.nextInt();
            if (quantidadeDeAluno <= 0) {
                System.out.println("Valor inválido. Deve ter pelo menos 1 aluno.");
            }
        } while (quantidadeDeAluno <= 0);

        // Leitura da nota mínima por avaliação
        do {
            System.out.println("Qual a nota mínima para aprovação?:");
            notaMinima = scanner.nextDouble();

            if (notaMinima < 3 || notaMinima > 10) {
                System.out.println("Número inválido! Tente novamente.");
            }
        } while (notaMinima < 3 || notaMinima > 10);

        // Inicialização das estruturas de dados
        String[] nomes = new String[quantidadeDeAluno];
        double[][] notas = new double[quantidadeDeAluno][4];
        double[] medias = new double[quantidadeDeAluno];

        // Coleta dos dados dos alunos
        for (int i = 0; i < quantidadeDeAluno; i++) {
            System.out.println("Nome do Aluno:");
            nomes[i] = scanner.next();

            do {
                System.out.println("Nota da AC1:");
                notas[i][0] = scanner.nextDouble();
                if (notas[i][0] <= 0 || notas[i][0] > 10) {
                    System.out.println("Nota inválida! Tente novamente.");
                }
            } while (notas[i][0] <= 0 || notas[i][0] > 10);

            do {
                System.out.println("Nota da AC2:");
                notas[i][1] = scanner.nextDouble();
                if (notas[i][1] <= 0 || notas[i][1] > 10) {
                    System.out.println("Nota inválida! Tente novamente.");
                }
            } while (notas[i][1] <= 0 || notas[i][1] > 10);

            do {
                System.out.println("Nota da AG:");
                notas[i][2] = scanner.nextDouble();
                if (notas[i][2] <= 0 || notas[i][2] > 10) {
                    System.out.println("Nota inválida! Tente novamente.");
                }
            } while (notas[i][2] <= 0 || notas[i][2] > 10);

            do {
                System.out.println("Nota da AF:");
                notas[i][3] = scanner.nextDouble();
                if (notas[i][3] <= 0 || notas[i][3] > 10) {
                    System.out.println("Nota inválida! Tente novamente.");
                }
            } while (notas[i][3] <= 0 || notas[i][3] > 10);

            // Cálculo da média ponderada
            medias[i] = notas[i][0] * peso[0] + notas[i][1] * peso[1] + notas[i][2] * peso[2] + notas[i][3] * peso[3];
        }

        // Exibição dos resultados
        System.out.println("\n----- RESULTADOS FINAIS -----");
        for (int i = 0; i < quantidadeDeAluno; i++) {
            System.out.println("\nAluno: " + nomes[i]);
            System.out.println("Notas -> AC1: " + notas[i][0]
                    + ", AC2: " + notas[i][1]
                    + ", AG: " + notas[i][2]
                    + ", AF: " + notas[i][3]);
            System.out.printf("Média Ponderada: %.2f\n", medias[i]);


            boolean passouNotasMinimas = notas[i][0] >= notaMinima
                    && notas[i][1] >= notaMinima
                    && notas[i][2] >= notaMinima
                    && notas[i][3] >= notaMinima;

            if (passouNotasMinimas) {
                if (medias[i] >= 9.5) {
                    System.out.println("Status: Aprovado com Excelência");
                    aprovadosComExcelencia++;
                } else {
                    System.out.println("Status: Aprovado");
                }
                aprovados++;
            } else {
                System.out.println("Status: Reprovado");
                reprovados++;
            }
        }
         
        double somaMediaGeral = 0;
        for (int i = 0; i < quantidadeDeAluno; i++){
            somaMediaGeral += medias[i];

        }
        double mediaGeralTurma = somaMediaGeral / quantidadeDeAluno;
        System.out.printf("\nmédia Geral da turma: %.2f\n", mediaGeralTurma);

        System.out.println("------------------------------");

        // Cálculo e exibição das porcentagens
        double porcentagemAprovados = (aprovados / quantidadeDeAluno) * 100;
        double porcentagemReprovados = (reprovados / quantidadeDeAluno) * 100;
        double porcentagemAprovadosComExcelencia = (aprovadosComExcelencia / quantidadeDeAluno) * 100;

        System.out.printf("Porcentagem de Aprovados: %.2f%%\n", porcentagemAprovados);
        System.out.printf("Porcentagem de Reprovados: %.2f%%\n", porcentagemReprovados);
        System.out.printf("Porcentagem de Aprovados com Excelência: %.2f%%\n", porcentagemAprovadosComExcelencia);
    }
}
