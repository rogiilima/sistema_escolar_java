import java.util.ArrayList;
import java.util.Random;
import java.time.Year;

public class GeradorMatricula {
    private ArrayList<String> usadas; // vetor que guarda todas as matriculas já geradas
    private Random random;

    public GeradorMatricula() {
        usadas = new ArrayList<>();
        random = new Random();
    }

    // Pode ser colocado argumentos para gerar de acordo com a turma**
    public String geraMatriculaAluno() {
        // Variaveis locais
        String matricula;
        String anoAtual = String.valueOf(Year.now().getValue()); // pega o ano do sistema

        do {
            // 2025 + 4 dígitos aleatórios ex.:"20255587"
            int numero = 1000 + random.nextInt(9000); //Numero aleatorio entre 1000 e 9999
            matricula = anoAtual + numero;
        } while (usadas.contains(matricula));// Retorna false se já estiver no Array e tenta outro laço do loop

        usadas.add(matricula); // registra a matricula no arraylist
        return matricula; //Tem que instaciar um objeto pra usar esse negocio
    }
}