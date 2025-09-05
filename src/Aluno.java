public class Aluno {
    private String nome;
    private String matricula;
    private double nota;

    // Construtor
    public Aluno(String nome, String matricula, double nota ) {
        this.nome = nome;
        this.matricula = matricula;
        this.nota = nota;
    }

    // Getters Setters 
    public String getNome() {
        return nome;
    }
    public void setNome(String nome) {
        this.nome = nome;
    }
    public double getNota() {
        return nota;
    }
    public void setNota(double nota) {
        this.nota = nota;
    }
    public String getMatricula() {
        return matricula;
    }
    
    public void exibirInfo(){
        String linha = "+----------------+----------------------+";
        System.out.println(linha);
        System.out.printf("| %-14s | %-20s |%n", "Nome", nome);
        System.out.printf("| %-14s | %-20s |%n", "Matrícula", matricula);
        System.out.printf("| %-14s | %-20.2f |%n", "Nota", nota);
        System.out.println(linha);
    }

    
}
