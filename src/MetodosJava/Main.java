package MetodosJava;

public class Main {
    public Main() {
    }

    public static void main(String[] args) {

        // EXERCICIO CALCULADORA:

        System.out.println("Exercicio calculadora");
        ExercicioCalculadora.soma(3.0, 6.0);
        ExercicioCalculadora.subtracao(9.0, 1.8);
        ExercicioCalculadora.multiplicacao(7.0, 8.0);
        ExercicioCalculadora.divisao(5.0, 2.5);

        // EXERCICIO MENSAGEM:

        System.out.println("Exercicio mensagem");
        Mensagem.obterMensagem(9);
        Mensagem.obterMensagem(14);
        Mensagem.obterMensagem(1);

        //EXERCICIO EMPRÉSTIMO

        System.out.println("Exercicio empréstimo");
        Emprestimo.calcular(1000.0, Emprestimo.getDuasParcelas());
        Emprestimo.calcular(1000.0, Emprestimo.getTresParcelas());
        Emprestimo.calcular(1000.0, 5);
    }
}
