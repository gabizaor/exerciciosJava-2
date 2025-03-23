public class Exercicio3e4 {
    int numero; 
    String titular;
    float saldo;
    float limite;

    public Exercicio3e4(int numero, String titular, float saldo, float limite) {
        this.numero = numero;
        this.titular = titular;
        this.saldo = saldo;
        this.limite = limite;
    }

    // Exercicio 3
    boolean sacar(float valor) {
        if (valor > this.saldo + this.limite) {
            return false;
        }
        this.saldo -= valor;
        return true;
    }

    boolean depositar (float valor) {
        if (valor > 0) {
            this.saldo += valor;
            return true;
        }
        return false;
    }

    void info () {
        System.out.println("Número: " + this.numero);
        System.out.println("Titular: " + this.titular);
        System.out.println("Saldo: " + this.saldo);
        System.out.println("Limite: " + this.limite);
    }

    // Exercicio 4
    boolean transferir (Exercicio3e4 conta, float valor) {
        if (this.sacar(valor)) {
            conta.depositar(valor);
            return true;
        }
        return false;
    }
}
