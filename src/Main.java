import java.util.Scanner;

public class Main {
    public static void main(String[] args) throws Exception {
        // Objeto que gera a matricula aletoria e guarda as outras geradas
        GeradorMatricula geraMatriculaAluno = new GeradorMatricula();
        // Scanner
        Scanner scanner = new Scanner(System.in);
        // Turmas
        Turma turmaA = new Turma("Turma A");
        Turma turmaB = new Turma("Turma B");
        Turma turmaC = new Turma("Turma C");

        String linha = "+----------------+----------------------+";
        int op = 6;
        int opc = 0;
        do {
            System.out.println(linha);
            System.out.println("=== MENU ===");
            System.out.println("1. Adicionar aluno");
            System.out.println("2. Listar alunos");
            System.out.println("3. Buscar aluno");
            System.out.println("4. Remover aluno");
            System.out.println("5. Calcular média");
            System.out.println("6. Sair");   
            System.out.println("Digite o numero p/Entrar, 6 p/sair:");
            
            op = scanner.nextInt();
            scanner.nextLine(); //Limpa o buffer do \n
            
            System.out.println(linha);
            switch (op) {
                case 1:
                    opc = 0;
                    Funcoes.clearConsole();
                    System.out.println("1. TurmaA");
                    System.out.println("2. TurmaB");
                    System.out.println("3. TurmaC");
                    System.out.printf("Em qual turma deseja adicionar?:");
                    opc = scanner.nextInt();
                    scanner.nextLine(); //Limpa o buffer do \n
                    switch (opc) {
                        case 1:
                            Funcoes.adicionarAlunoTurma(turmaA, scanner, geraMatriculaAluno);
                            break;
                        case 2:
                            Funcoes.adicionarAlunoTurma(turmaB, scanner, geraMatriculaAluno);
                            break;
                        case 3:
                            Funcoes.adicionarAlunoTurma(turmaC, scanner, geraMatriculaAluno);
                            break;
                        default:
                            break;
                    }
                    break;
                case 2:
                    opc = 0;
                    System.out.println("1. TurmaA");
                    System.out.println("2. TurmaB");
                    System.out.println("3. TurmaC");
                    System.out.printf("Qual turma deseja Listar?:");
                    opc = scanner.nextInt();
                    scanner.nextLine(); //Limpa o buffer do \n
                    switch (opc) {
                        case 1:
                            Funcoes.listaTurma(turmaA);
                            break;
                        case 2:
                            Funcoes.listaTurma(turmaB);
                            break;
                        case 3:
                            Funcoes.listaTurma(turmaC);
                            break;
                        default:
                            break;
                    }
                    break;
                case 3:
                    opc = 0;
                    System.out.println("1. TurmaA");
                    System.out.println("2. TurmaB");
                    System.out.println("3. TurmaC");
                    System.out.printf("Qual turma deseja Buscar por Matricula?:");
                    opc = scanner.nextInt();
                    scanner.nextLine(); //Limpa o buffer do \n
                    switch (opc) {
                        case 1:
                            Funcoes.buscarAlunoPorMatricula(turmaA,  scanner);
                            break;
                        case 2:
                            Funcoes.buscarAlunoPorMatricula(turmaB,  scanner);
                            break;
                        case 3:
                            Funcoes.buscarAlunoPorMatricula(turmaC, scanner);
                            break;
                        default:
                            break;
                    }
                    break;
                default:
                    break;
                case 4:
                    opc = 0;
                    System.out.println("1. TurmaA");
                    System.out.println("2. TurmaB");
                    System.out.println("3. TurmaC");
                    System.out.printf("Qual turma deseja Buscar por Matricula?:");
                    opc = scanner.nextInt();
                    scanner.nextLine(); //Limpa o buffer do \n
                    switch (opc) {
                        case 1:
                            Funcoes.removeAluno( turmaA,  scanner);
                            break;
                        case 2:
                            Funcoes.removeAluno( turmaB,  scanner);
                            break;
                        case 3:
                            Funcoes.removeAluno(turmaC, scanner);
                            break;
                        default:
                            break;
                    }
                    break;
                case 5:
                    opc = 0;
                    System.out.println("1. TurmaA");
                    System.out.println("2. TurmaB");
                    System.out.println("3. TurmaC");
                    System.out.printf("Qual turma deseja Calcular a média?:");
                    opc = scanner.nextInt();
                    scanner.nextLine(); //Limpa o buffer do \n
                    switch (opc) {
                        case 1:
                            Funcoes.calculaMedia(turmaA);
                            break;
                        case 2:
                            Funcoes.calculaMedia(turmaB);
                            break;
                        case 3:
                            Funcoes.calculaMedia(turmaC);
                            break;
                        default:
                            break;
                    }
            }

        } while (op != 6);
    }
}
