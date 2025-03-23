public class Exercicio2 {
    String nome; 
    String curso; 
    Exercicio1 notas;

    public Exercicio2(String nome, String curso, Exercicio1 notas) {
        this.nome = nome;
        this.curso = curso;
        this.notas = notas;
    }

    void info() {
        System.out.println("Nome: " + nome);
        System.out.println("Curso: " + curso);
        notas.mediaAritmetica();
        notas.mediaPonderada();
    }

    
}
