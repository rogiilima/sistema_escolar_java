import java.io.IOException;
import java.util.Scanner;

public class Funcoes {
    //Função que limpa console
    public static void clearConsole() {
        try {
            String os = System.getProperty("os.name");

            if (os.contains("Windows")) {
                // Para Windows
                ProcessBuilder pb = new ProcessBuilder("cmd", "/c", "cls");
                pb.inheritIO().start().waitFor(); // Use waitFor() para esperar o comando terminar
            } else {
                // Para Linux/macOS
                Runtime.getRuntime().exec("clear");
            }
        } catch (IOException | InterruptedException e) {
            // Tratamento de exceção
            System.err.println("Erro ao limpar o console: " + e.getMessage());
            e.printStackTrace();
        }
    }
    //Escolhe turma...


    //Função de adicionar turma
    public final static void adicionarAlunoTurma(Turma turma, Scanner scanner, GeradorMatricula a){
        System.out.println("Digite o nome do aluno:");
        String nome = scanner.nextLine();
        // scanner.nextLine(); //Limpa o buffer do \n

        System.out.println("Digite a nota do aluno(Separador decimar é a ',' Ex.:7,9):");
        double nota = scanner.nextDouble();
        // scanner.nextLine(); //Limpa o buffer do \n

        // matrícula gerada automaticamente pelo objeto que você fez
        String matricula = a.geraMatriculaAluno(); 
        Aluno novoAluno = new Aluno(nome, matricula, nota);
        turma.adicionarAluno(novoAluno);
    }
    //Fução para listar por turma
    public static void listaTurma(Turma turma){
        turma.listarAlunos();
    }
    // Busca por Matricula
    public static void buscarAlunoPorMatricula(Turma turma, Scanner scanner){
        System.out.println("Digite a matricula:");
        String matricula = scanner.nextLine();
        // scanner.nextLine(); //Limpa o buffer do \n

        Aluno aluno = turma.buscarAlunoPorMatricula(matricula);

        if (aluno != null) {
            System.out.println("Dados:");
            aluno.exibirInfo();
            return;
        };
        System.out.println("Matricula não encontrada!");
    }
    //Remover aluno por matricula
    public static void removeAluno(Turma turma, Scanner scanner){
        System.out.println("Digite a matricula:");
        String matricula = scanner.nextLine();
        // scanner.nextLine(); //Limpa o buffer do \n

        if (turma.removerAluno(matricula)) {
            System.out.println("Removido com sucesso!");
            return;
        };

        System.out.println("Erro ao remover...");
    }
    //Calcula a media
    public static void calculaMedia(Turma turma){
        System.out.println("A média da turma é: " + turma.calcularMediaTurma());
    }

}
