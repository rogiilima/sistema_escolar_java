import java.util.ArrayList; // Import the ArrayList class

public class Turma {
    private String nomeDaTurma;
    private ArrayList<Aluno> alunosTurma;

    public Turma(String nomeTurma) {
        this.nomeDaTurma = nomeTurma;
        this.alunosTurma = new ArrayList<>();
    }
    
    public void adicionarAluno(Aluno aluno) {
        alunosTurma.add(aluno);
    }

    public void listarAlunos() {
        if (alunosTurma.isEmpty()) {
            System.out.println("Nenhum aluno cadastrado...");
        } else {
            for (Aluno Aluno : alunosTurma) { //Pega cada aluno e chama o metodo exibirInfo
                Aluno.exibirInfo();
                System.out.println("+----------------+----------------------+");
            }
        }
    }
// Esse método retorna um aluno para ser reaproveitado no método de removar
    public Aluno buscarAlunoPorMatricula(String matricula) {
        for (Aluno Aluno : alunosTurma) {
            if (Aluno.getMatricula() == matricula) {
                return Aluno;
            }
        }
        return null;
    }

    public boolean removerAluno(String matricula) {
        Aluno aluno = buscarAlunoPorMatricula(matricula);
        if (aluno != null) {
            alunosTurma.remove(aluno);
            return true;// Caso conseguir remover o aluno
        }
        return false;// Caso não conseguir remover o aluno
    }

    public double calcularMediaTurma() {
        if (alunosTurma.isEmpty()) {
            return 0.0; //Para o caso da turma não existir
        }
        double soma = 0;
        for (Aluno Aluno : alunosTurma) {
            soma += Aluno.getNota();
        }
        return soma / alunosTurma.size();
    }
    
    public String getNomeTurma() {
        return nomeDaTurma;
    }
}

