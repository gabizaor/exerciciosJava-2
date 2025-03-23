class Exercicio1 {
    int nota1;
    int nota2;
    int nota3;

    void mediaAritmetica() {
        int media = (nota1 + nota2 + nota3) / 3;
        System.out.println("Média aritmética: " + media);
    }

    void mediaPonderada() {
        int media = (nota1 * 2 + nota2 * 3 + nota3 * 4) / 9;
        System.out.println("Média ponderada: " + media);
    }

}